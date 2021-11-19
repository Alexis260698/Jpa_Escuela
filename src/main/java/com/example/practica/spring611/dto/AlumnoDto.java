package com.example.practica.spring611.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDto {
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;
    private String idExpediente;

}
