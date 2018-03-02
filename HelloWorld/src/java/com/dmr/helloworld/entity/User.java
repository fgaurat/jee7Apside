/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.helloworld.entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author fgaurat
 */
public class User {
    String login,password;

    public User(String login, String password) throws Exception{
        Context initContext = new InitialContext();
        
        DataSource ds = (DataSource)initContext.lookup("java:app/jdbc/apsideDatasource");
        Connection conn = ds.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT login,password FROM users WHERE login='"+login+"' AND password = '"+password+"'");
        rs.next();        
        this.login = rs.getString("login");
        this.password = rs.getString("password");

        
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + '}';
    }
    
    
    
    
}
