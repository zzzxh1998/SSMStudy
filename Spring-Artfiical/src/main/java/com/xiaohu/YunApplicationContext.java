package com.xiaohu;

import cn.hutool.core.lang.ClassScanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class YunApplicationContext {
    private Class configClass;
//    private Set<Class<?>> classes;
    private static Map<String,Object> singletonMap = new HashMap<>();
    private static Map<String,BeanDefination> beanDefinationMap = new HashMap<>();

    //解析配置类
    public YunApplicationContext(Class configClass) {
        this.configClass = configClass;
        ComponentScan annotation = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
        String path = annotation.value();
        Set<Class<?>> classes = ClassScanner.scanPackage(path);
        classes.stream()
                .filter(c -> c.getAnnotation(Component.class) != null)
                .forEach(c -> {
                    BeanDefination beanDefination = new BeanDefination();
                    beanDefination.setClazz(c);
                    Scope scope = (Scope) configClass.getAnnotation(c);
                    beanDefination.setScope(scope == null ? "singleton" : scope.value());
                    Component component = c.getAnnotation(Component.class);
                    beanDefinationMap.put(component.value(),beanDefination);
                });

//        classes = ClassScanner.scanPackage(path);

    }

    public Object getBean(final String beanName) throws Exception {
        BeanDefination beanDefination = beanDefinationMap.get(beanName);
        if(beanDefination.getScope().equals("singleton")){
            Object object = singletonMap.get(beanName);
            if (object == null){
                object = beanDefination.getClazz().newInstance(); //实例化
                singletonMap.put(beanName,object);
            }
            return object;
        }else {
            return beanDefination.getClazz().newInstance();//实例化
        }
    }

}
