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
@Table(name = "Sistema")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sistema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Contenidos")
    private List<Contenido> contenidos;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Alumnos")
    private List<Alumno> alumnos;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Cursos")
    private List<Curso> cursos;
}
