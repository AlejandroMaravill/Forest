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
 * @author Estudiante_PC4
 */
public class ModeloAlumnos {

    PreparedStatement ps;

    public ResultSet ObtenerUsuario(String usuario, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_usuario from usuarios where usuario = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public int AñadirAlumno(String nombres, String apellidos, String carnet, int modalidad, int especialidad, int grupo, int seccion, int empresa, int estado, int usuario, int docente, String year, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "insert into estudiantes values(?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, carnet);
            ps.setInt(4, modalidad);
            ps.setInt(5, especialidad);
            ps.setInt(6, grupo);
            ps.setInt(7, seccion);
            ps.setInt(8, empresa);
            ps.setInt(9, estado);
            ps.setInt(10, usuario);
            ps.setInt(11, docente);
            ps.setString(12, year);
            ps.execute();
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al momento de ingresar al estudiante, vuelva a intentar mas tarde" + e.toString(), "Proceso Incompleto", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public ResultSet MostrarAlumno(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from Alumnos";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarEspecialidad(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from especialidades";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarGrupo(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from grupos";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarSeccion(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from secciones";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarDocente(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from docentes";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarModalidad(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from modalidades";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarEmpresa(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from empresas";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarEstado(String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from estado_estudiantes";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet MostrarDocenteFiltro(int especialidad, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select * from docentes where id_especialidad = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, especialidad);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

    public int ActualizarAlumno(String nombres, String apellidos, String carnet, int modalidad, int especialidad, int grupo, int seccion, int empresa, int estado, int docente, String year, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "update estudiantes set Nombres = ?, apellidos = ?, carnet = ?, id_modalidad = ?, id_especialidad = ?, id_grupo = ?, id_seccion = ?, id_empresa = ?, id_estado_estudiante = ?, id_docente = ?, año = ? where carnet = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, carnet);
            ps.setInt(4, modalidad);
            ps.setInt(5, especialidad);
            ps.setInt(6, grupo);
            ps.setInt(7, seccion);
            ps.setInt(8, empresa);
            ps.setInt(9, estado);
            ps.setInt(10, docente);
            ps.setString(11, year);
            ps.setString(12, carnet);
            ps.execute();
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al momento de actualizar al estudiante, vuelva a intentar mas tarde" + e.toString(), "Proceso Incompleto", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public ResultSet ObtenerIDModalidad(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_modalidad from modalidades where modalidad = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ResultSet ObtenerIDEspecialidad(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_especialidad from especialidades where especialidad = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ResultSet ObtenerIDGrupo(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_grupo from grupos where grupo = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ResultSet ObtenerIDseccion(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_seccion from secciones where seccion = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ResultSet ObtenerIDempresa(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_empresa from empresas where empresa = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ResultSet ObtenerIDestado(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_estado_estudiante from estado_estudiantes where estado = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ResultSet ObtenerIDdocente(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_docente from docentes  where docente = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public int DelStudent(String carnet, String ip, String port, String db, String user, String password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "delete estudiantes where carnet = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ps.execute();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public ResultSet ObtenerIDestudiante(String carnet, String ip, String port, String db, String user, String password) {
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "select id_estudiante from estudiantes  where carnet = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, carnet);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public int Delptc(int id, String ip, String port, String db, String user, String password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "delete peticiones where id_estudiante = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int Delcont(int id, String ip, String port, String db, String user, String password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "delete contacto_estudiantes where id_estudiante = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int Delast(int id, String ip, String port, String db, String user, String password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "delete asistencias where id_estudiante = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int Delcrt(int id, String ip, String port, String db, String user, String password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "delete cartas where id_estudiante = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int Delall(String ip, String port, String db, String user, String password){
        Connection con;
        try {
            con = ConexionModelo.getConnection(ip, port, db, user, password);
            String query = "delete peticiones";
            ps = con.prepareStatement(query);
            ps.execute();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
}
