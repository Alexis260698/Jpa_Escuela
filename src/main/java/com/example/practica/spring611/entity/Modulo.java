package com.example.practica.spring611.entity;


import java.util.List;

public class Modulo extends Contenido{

    private List<Contenido>contenidos;

    public Modulo(){}

    public Modulo(String nombre, String descripcion, Integer duracion){
        super(nombre,descripcion,duracion);
    }

    public Integer getDuracion(){
        return getDuracion();
    }

}
