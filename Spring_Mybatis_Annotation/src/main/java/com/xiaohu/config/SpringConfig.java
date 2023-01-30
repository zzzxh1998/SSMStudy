package com.xiaohu.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//该类是一个配置类，作用和bean.xml相同
@Configuration
@ComponentScan("com.xiaohu")
public class SpringConfig {

    //用于创建一个QueryRunner对象
    /*
    * 代替一下内容
    * <!--注意在测试成功后，再加入别名，-->
    <bean id="customers" class="com.xiaohu.entity.Customers">
        <property name="customernumber" value="1"/>
        <property name="customername" value="11"/>
    </bean>
    * */
    @Bean(name="queryRunner")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    //创建一个DataSource对象
    /*
    * 代替一下内容
    *
    *
    <!--配置QueryRunner-->
    <bean id="queryRunner" class="org.apache.commons.dbutils.QueryRunner" scope="prototype">
        <constructor-arg name="ds" ref="dataSource"/>
    </bean>

    <!--配置数据源-->
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <!--连接数据库的必备信息-->
        <property name="driverClass" value="com.mysql.cj.jdbc.Driver"/>
        <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/spring"/>
        <property name="user" value="root"/>
        <property name="password" value="1998"/>
    </bean>
    * */
    @Bean(name="dataSource")
    public DataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/mysql_official_example_database");
        ds.setUser("root");
        ds.setPassword("1998");
        return ds;
    }

}
