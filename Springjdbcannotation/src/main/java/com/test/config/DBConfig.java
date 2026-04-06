package com.test.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.test")
@PropertySource("classpath:database.properties")
public class DBConfig {
@Autowired
private Environment env;
private final String DRIVER="driver";
private final String URL="url";
private final String USER="dbuser";
private final String PASSWORD="dbpassword";
@Bean
public DataSource dataSource(){
DriverManagerDataSource dataSource=new DriverManagerDataSource()	;
dataSource.setDriverClassName(env.getProperty(DRIVER));
dataSource.setUrl(env.getProperty(URL));
dataSource.setUsername(env.getProperty(USER));
dataSource.setPassword(env.getProperty(PASSWORD));
return dataSource;
}
}
