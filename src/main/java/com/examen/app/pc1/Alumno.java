package com.examen.app.pc1;

public class Alumno {

    private String codigo;
    private String nombre;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Alumno() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
