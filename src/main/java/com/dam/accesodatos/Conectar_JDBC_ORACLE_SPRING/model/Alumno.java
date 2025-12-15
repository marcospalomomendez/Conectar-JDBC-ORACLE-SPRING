package com.dam.accesodatos.Conectar_JDBC_ORACLE_SPRING.model;


public class Alumno {

    private String nombre;
    private String curso;

    public Alumno(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
