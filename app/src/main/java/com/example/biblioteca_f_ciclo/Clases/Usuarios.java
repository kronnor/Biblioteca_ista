package com.example.biblioteca_f_ciclo.Clases;

public class Usuarios {
    private int cedula;
    private String nombres;
    private String usuario;
    private int celular;
    private String correo;
    private String clave;

    public Usuarios(int cedula, String nombres, String usuario, int celular, String correo, String clave) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.usuario = usuario;
        this.celular = celular;
        this.correo = correo;
        this.clave = clave;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
