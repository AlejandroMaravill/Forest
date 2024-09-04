/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author tariq
 */
public class ModelUser {
    
    PreparedStatement ps;
    
    public int AñadirUsuario(String usuario, String clave, int tipo, int estado, int intentos, String ip, String port, String db, String user, String password){
        Connection con; 
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "insert into usuarios values(?, ?, ?, ?, ?)";
            ps = con.prepareStatement(query);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            ps.setInt(3, tipo);
            ps.setInt(4, estado);
            ps.setInt(5, intentos);
            ps.execute();
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al momento de ingresar al usuario, vuelva a intentar mas tarde" + e.toString(), "Proceso Incompleto", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    } 
    
}
