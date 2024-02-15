package com.Task.Manager.DB;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private Connection connection;
    public DBConnection(String url, String user, String password){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  Connection connection(){
        return this.connection;
    }

}
