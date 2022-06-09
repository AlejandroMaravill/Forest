/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author tariq
 */
public class ConfiguracionControlador {
    
    public static String ip;
    
    public static String database;
    
    public static String user;
    
    public static String password;
    
    public static String port;

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        ConfiguracionControlador.ip = ip;
    }

    public static String getDatabase() {
        return database;
    }

    public static void setDatabase(String database) {
        ConfiguracionControlador.database = database;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        ConfiguracionControlador.user = user;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ConfiguracionControlador.password = password;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        ConfiguracionControlador.port = port;
    }

    public ConfiguracionControlador() {
        
    }
    
    
}
