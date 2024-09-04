/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloEmpresa;
import java.sql.ResultSet;

/**
 *
 * @author marav
 */
public class ControladorEmpresa {
    ModeloEmpresa obj = new ModeloEmpresa();
    public ResultSet CagarEstados(){
        return obj.cargarEstado(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database
        ,ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    public ResultSet CargarEmpresas(){
        return obj.CargarTabla(ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database
        ,ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    
    
    public static int idempresa;
    public String nombre;
    public int NumTributario;
    public String Representante;
    public int estado;
    public String Direccion;
    public byte [] Logo;

    
    
    public byte[] getLogo() {
        return Logo;
    }

    public void setLogo(byte[] Logo) {
        this.Logo = Logo;
    }


    public static int getIdempresa() {
        return idempresa;
    }

    public static void setIdempresa(int idempresa) {
        ControladorEmpresa.idempresa = idempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTributario() {
        return NumTributario;
    }

    public void setNumTributario(int NumTributario) {
        this.NumTributario = NumTributario;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public boolean InsertarEmpresa(){
        return obj.AgregarEmpresa(nombre, NumTributario, Representante, Direccion, estado, Logo, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database
        ,ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    public ResultSet CargarImagen(){
        return obj.CargarImagen(idempresa, ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database
        ,ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
}
