package com.matchmingle.models;

public class Mensaje {
    private int idMensaje;
    private int idUsuario;
    private String bio;
    private String ubicacion;
    private String intereses;

    // Constructor vacío
    public Mensaje() {}

    // Constructor completo
    public Mensaje(int idMensaje, int idUsuario, String bio, String ubicacion, String intereses) {
        this.idMensaje = idMensaje;
        this.idUsuario = idUsuario;
        this.bio = bio;
        this.ubicacion = ubicacion;
        this.intereses = intereses;
    }

    // Getters y Setters

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdPerfil(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }
}
