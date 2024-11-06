package com.matchmingle.models;

public class Preferencia {
    private int idPreferencia;
    private int idUsuario;
    private Integer rangoEdadMin; // Se usa Integer para permitir nulos
    private Integer rangoEdadMax; // Se usa Integer para permitir nulos
    private Integer distanciaMaxKm; // Se usa Integer para permitir nulos
    private String generoPreferido;

    // Constructor vacío
    public Preferencia() {}

    // Constructor completo
    public Preferencia(int idPreferencia, int idUsuario, Integer rangoEdadMin,
                       Integer rangoEdadMax, Integer distanciaMaxKm, String generoPreferido) {
        this.idPreferencia = idPreferencia;
        this.idUsuario = idUsuario;
        this.rangoEdadMin = rangoEdadMin;
        this.rangoEdadMax = rangoEdadMax;
        this.distanciaMaxKm = distanciaMaxKm;
        this.generoPreferido = generoPreferido;
    }

    // Getters y Setters

    public int getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(int idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getRangoEdadMin() {
        return rangoEdadMin;
    }

    public void setRangoEdadMin(Integer rangoEdadMin) {
        this.rangoEdadMin = rangoEdadMin;
    }

    public Integer getRangoEdadMax() {
        return rangoEdadMax;
    }

    public void setRangoEdadMax(Integer rangoEdadMax) {
        this.rangoEdadMax = rangoEdadMax;
    }

    public Integer getDistanciaMaxKm() {
        return distanciaMaxKm;
    }

    public void setDistanciaMaxKm(Integer distanciaMaxKm) {
        this.distanciaMaxKm = distanciaMaxKm;
    }

    public String getGeneroPreferido() {
        return generoPreferido;
    }

    public void setGeneroPreferido(String generoPreferido) {
        this.generoPreferido = generoPreferido;
    }
}
