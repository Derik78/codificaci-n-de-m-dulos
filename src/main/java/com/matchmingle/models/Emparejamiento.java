package com.matchmingle.models;

import java.sql.Timestamp;

public class Emparejamiento {
    private int idEmparejamiento;
    private int idUsuario1;
    private int idUsuario2;
    private Timestamp creadoEn;
    private String estado;

    // Constructor vacío
    public Emparejamiento() {}

    // Constructor completo
    public Emparejamiento(int idEmparejamiento, int idUsuario1, int idUsuario2, Timestamp creadoEn, String estado) {
        this.idEmparejamiento = idEmparejamiento;
        this.idUsuario1 = idUsuario1;
        this.idUsuario2 = idUsuario2;
        this.creadoEn = creadoEn;
        this.estado = estado;
    }

    // Getters y Setters

    public int getIdEmparejamiento() {
        return idEmparejamiento;
    }

    public void setIdEmparejamiento(int idEmparejamiento) {
        this.idEmparejamiento = idEmparejamiento;
    }

    public int getIdUsuario1() {
        return idUsuario1;
    }

    public void setIdUsuario1(int idUsuario1) {
        this.idUsuario1 = idUsuario1;
    }

    public int getIdUsuario2() {
        return idUsuario2;
    }

    public void setIdUsuario2(int idUsuario2) {
        this.idUsuario2 = idUsuario2;
    }

    public Timestamp getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Timestamp creadoEn) {
        this.creadoEn = creadoEn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
