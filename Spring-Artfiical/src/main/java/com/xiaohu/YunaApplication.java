package com.xiaohu;

public class YunaApplication {
    public static void main(String[] args) throws Exception {
        YunApplicationContext yunApplicationContext = new YunApplicationContext(YunaConfig.class);
        UserService userService = (UserService) yunApplicationContext.getBean("userService");
        System.out.println(userService);
    }


}
