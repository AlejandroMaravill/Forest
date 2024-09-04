/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelUser;

/**
 *
 * @author tariq
 */
public class ControllerUser {
    
    ModelUser modus = new ModelUser();
    
    public String usuario;
    public String clave;
    public int tipo;
    public int estado;
    public int intento;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ControllerUser() {
    }

    public int getIntento() {
        return intento;
    }

    public void setIntento(int intento) {
        this.intento = intento;
    }

    public ControllerUser(String usuario, String clave, int tipo, int estado, int intento) {
        this.usuario = usuario;
        this.clave = clave;
        this.tipo = tipo;
        this.estado = estado;
        this.intento = intento;
    }
    
    public int AgregarUsuario(){
        return modus.AñadirUsuario(usuario, clave, tipo, estado, intento,ConfiguracionControlador.ip, ConfiguracionControlador.port, ConfiguracionControlador.database, ConfiguracionControlador.user, ConfiguracionControlador.password);
    }
    
}
