package com.matchmingle.models;

import java.time.LocalDate;

public class Usuario {
    // Atributos correspondientes a las columnas de la tabla `usuarios`
    private int idUsuario;
    private String nombre;
    private String email;
    private String contraseña;
    private LocalDate fechaNacimiento;
    private String genero;
    private String orientacion;

    // Constructor vacío (necesario para algunas operaciones)
    public Usuario() {}

    // Constructor con todos los atributos (para facilitar la creación de objetos Usuario)
    public Usuario(int idUsuario, String nombre, String email, String contraseña,
                   LocalDate fechaNacimiento, String genero, String orientacion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.orientacion = orientacion;
    }

    // Getters y Setters para acceder y modificar los atributos

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
}
