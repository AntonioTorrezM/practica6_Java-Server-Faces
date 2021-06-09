package com.emergentes;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "usuarioBean")
@RequestScoped
public class UsuarioBean {
    private String nombre;
    private String apellidos;
    private String correo;
    private Integer contraseña;
    
    public UsuarioBean() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Integer getContraseña() {
        return contraseña;
    }
    public void setContraseña(Integer contraseña) {
        this.contraseña = contraseña;
    }   
}
