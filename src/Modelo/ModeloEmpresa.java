/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author marav
 */
public class ModeloEmpresa {
    PreparedStatement ps;
    public ResultSet cargarEstado(String ip, String port, String db, String user, String Password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, Password);
            String query = "SELECT * FROM estado_empresas";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no se han podido cargar los estados");
            return  null;
        }
    }
    
    public Boolean AgregarEmpresa(String nombre, int numero, String representante, String direccion, int estado, byte [] logo, String ip, String port, String db, String user, String Password){
        Connection con;
        boolean retorno = false;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, Password);
            String query = "INSERT INTO empresas(empresa, numero_tributario, representante_legal, direccion, id_estado_empresa, logo) VALUES(?,?,?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setInt(2, numero);
            ps.setString(3, representante);
            ps.setString(4, direccion);
            ps.setInt(5, estado);
            ps.setBytes(6, logo);
            ps.execute();
            retorno = true;
            return retorno;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            return retorno;
        }
    }
    public ResultSet CargarTabla(String ip, String port, String db, String user, String Password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, Password);
            String query = "SELECT * FROM empresas";
            ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no se ha podido cargar la tabla de informacion de las empresas");
            return null;
        }
    }
    public ResultSet CargarImagen(int Id, String ip, String port, String db, String user, String Password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, Password);
            String query = "SELECT logo FROM empresas WHERE id_empresa = " + Id;
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no se ha podido cargar la imagen del regsitro que frue selecionado");
            return null;
        }
    }
}
