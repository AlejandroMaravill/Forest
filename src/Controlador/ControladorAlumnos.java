/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloAlumnos;
import java.sql.ResultSet;
import Modelo.ModeloAlumnos;

/**
 *
 * @author Estudiante_PC4
 */
public class ControladorAlumnos {

    ModeloAlumnos modAl = new ModeloAlumnos();
    ControllerUser contus = new ControllerUser();

    public String nombre;
    public String apellido;
    public String carnet;
    public int modalidad;
    public int especialidad;
    public int grupo;
    public int seccion;
    public int empresa;
    public int estado;
    public int usuario;
    public int docente;
    public String year;
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getModalidad() {
        return modalidad;
    }

    public void setModalidad(int modalidad) {
        this.modalidad = modalidad;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getDocente() {
        return docente;
    }

    public void setDocente(int docente) {
        this.docente = docente;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ControladorAlumnos() {
    }

    public ControladorAlumnos(String nombre, String apellido, String carnet, int modalidad, int especialidad, int grupo, int seccion, int empresa, int estado, int usuario, int docente, String year) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.modalidad = modalidad;
        this.especialidad = especialidad;
        this.grupo = grupo;
        this.seccion = seccion;
        this.empresa = empresa;
        this.estado = estado;
        this.usuario = usuario;
        this.docente = docente;
        this.year = year;
    }

    public int IngresarAlumno() {
        return modAl.AñadirAlumno(nombre, apellido, carnet, modalidad, especialidad, grupo, seccion, empresa, estado, usuario, docente, year, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarAlumno() {
        return modAl.MostrarAlumno(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarEspecialidad() {
        return modAl.MostrarEspecialidad(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarGrupo() {
        return modAl.MostrarGrupo(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarSeccion() {
        return modAl.MostrarSeccion(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarDocente() {
        return modAl.MostrarDocente(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarModalidad() {
        return modAl.MostrarModalidad(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarEmpresa() {
        return modAl.MostrarEmpresa(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostrarEstado() {
        return modAl.MostrarEstado(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public ResultSet MostraeDocenteFiltro() {
        return modAl.MostrarDocenteFiltro(especialidad, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public int ObtenerUsuario(String user) {
        ResultSet rsc = modAl.ObtenerUsuario(user, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        usuario = 0;
        try {
            while (rsc.next()) {
                usuario = rsc.getInt("id_usuario");
            }
            return usuario;
        } catch (Exception e) {
            return 0;
        }
    }

    public int ActualizarAlumno() {
        return modAl.ActualizarAlumno(nombre, apellido, carnet, modalidad, especialidad, grupo, seccion, empresa, estado, docente, year, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }

    public int ObtenerModalidad(String carnett) {
        ResultSet rsc = modAl.ObtenerIDModalidad(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        modalidad = 0;
        try {
            while (rsc.next()) {
                modalidad = rsc.getInt("id_modalidad");
            }
            return modalidad;
        } catch (Exception e) {
            return 0;
        }
    }

    public int ObtenerEspecialidad(String carnett) {
        ResultSet rsc = modAl.ObtenerIDEspecialidad(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        especialidad = 0;
        try {
            while (rsc.next()) {
                especialidad = rsc.getInt("id_especialidad");
            }
            return especialidad;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int ObtenerGrupo(String carnett) {
        ResultSet rsc = modAl.ObtenerIDGrupo(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        grupo = 0;
        try {
            while (rsc.next()) {
                grupo = rsc.getInt("id_grupo");
            }
            return grupo;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int ObtenerSeccion(String carnett) {
        ResultSet rsc = modAl.ObtenerIDseccion(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        seccion = 0;
        try {
            while (rsc.next()) {
                seccion = rsc.getInt("id_seccion");
            }
            return seccion;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int ObtenerEmpresa(String carnett) {
        ResultSet rsc = modAl.ObtenerIDempresa(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        empresa = 0;
        try {
            while (rsc.next()) {
                empresa = rsc.getInt("id_empresa");
            }
            return empresa;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int ObtenerEstado(String carnett) {
        ResultSet rsc = modAl.ObtenerIDestado(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        estado = 0;
        try {
            while (rsc.next()) {
                estado = rsc.getInt("id_estado_estudiante");
            }
            return estado;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int ObtenerDocente(String carnett) {
        ResultSet rsc = modAl.ObtenerIDdocente(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        docente = 0;
        try {
            while (rsc.next()) {
                docente = rsc.getInt("id_docente");
            }
            return docente;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int DelStdnt(){
        return modAl.DelStudent(carnet, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    
    public int ObtenerEstudiante(String carnett) {
        ResultSet rsc = modAl.ObtenerIDestudiante(carnett, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
        id = 0;
        try {
            while (rsc.next()) {
                id = rsc.getInt("id_estudiante");
            }
            return id;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int Delptc(){
        return modAl.Delptc(id, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    
    public int Delcont(){
        return modAl.Delcont(id, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    
    public int Delast(){
        return modAl.Delast(id, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    
    public int Delcrt(){
        return modAl.Delcrt(id, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    
    public int Delall(){
        return modAl.Delall(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
}
