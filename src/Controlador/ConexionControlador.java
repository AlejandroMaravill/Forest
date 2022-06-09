/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;

/**
 *
 * @author tariq
 */
public class ConexionControlador {
    public static Connection getConnection(){
        return Modelo.ConexionModelo.getConnection(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
}
