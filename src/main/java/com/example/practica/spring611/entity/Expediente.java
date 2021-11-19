package com.example.practica.spring611.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Expedientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fechaInsc;
    private Integer calificacion;
    private String fechaFin;


    @OneToOne(cascade = CascadeType.ALL)
    private Curso curso;
}
