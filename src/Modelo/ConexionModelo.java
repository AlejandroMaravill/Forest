/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tariq
 */
public class ConexionModelo {
    public static Connection getConnection(String ip, String port, String db, String user, String password){
        Connection con;
        try {
            String query = ("jdbc:sqlserver://" + ip + ":" + port + ";"
                            + "database = " + db + ";"
                            + "user = " + user + ";"
                            + "password = " + password + ";"
                            + "loginTimeOut = 20");
            con = DriverManager.getConnection(query);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
