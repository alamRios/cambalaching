/*
 * CPC SISTEMAS
 */
package com.cambalaching.model.dao.impl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alam.rios
 */
public class Conection {
    private static final String url = "jdbc:mysql://localhost/"; 
    private static final String base = "cambalachingdb?characterEncoding=UTF8";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String userName = "root";
    private static final String password = "root";
    
    public static Connection obtenerConeccion() throws Exception{
        Connection con = null; 
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(url+base,userName,password);
          return con; 
        } catch (SQLException e) {
            throw e; 
        } catch (Exception e){
            throw e;
        }
    }
}
