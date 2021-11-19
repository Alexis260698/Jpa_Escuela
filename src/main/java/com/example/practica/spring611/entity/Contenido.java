package com.example.practica.spring611.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Contenido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private String descripcion;
    private Integer duracion;

    public Contenido(String nombre, String descripcion, Integer duracion){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.duracion= duracion;
    }


}
