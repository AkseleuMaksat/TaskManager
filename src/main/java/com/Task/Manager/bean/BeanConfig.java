package com.Task.Manager.bean;

import com.Task.Manager.DB.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public DBConnection getConnector (){
        DBConnection dbConnection = new DBConnection("jdbc:mysql://localhost:8889/TaskManager", "root", "root");
        return dbConnection;
    }

}
