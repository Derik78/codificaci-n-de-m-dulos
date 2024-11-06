package com.matchmingle.models;

public class Perfil {
    private int idPerfil;
    private int idUsuario;
    private String bio;
    private String ubicacion;
    private String intereses;

    // Constructor vacío
    public Perfil() {}

    // Constructor completo
    public Perfil(int idPerfil, int idUsuario, String bio, String ubicacion, String intereses) {
        this.idPerfil = idPerfil;
        this.idUsuario = idUsuario;
        this.bio = bio;
        this.ubicacion = ubicacion;
        this.intereses = intereses;
    }

    // Getters y Setters

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
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
