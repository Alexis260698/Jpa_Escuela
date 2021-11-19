package com.example.practica.spring611.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Alumnos")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dni;

    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Expedientes", nullable = true)
    private List<Expediente> expedientes;



}
