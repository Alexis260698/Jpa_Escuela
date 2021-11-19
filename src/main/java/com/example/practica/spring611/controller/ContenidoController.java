package com.example.practica.spring611.controller;

import com.example.practica.spring611.entity.Contenido;
import com.example.practica.spring611.entity.Tema;
import com.example.practica.spring611.repository.ContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContenidoController {

    @Autowired
    private ContenidoRepository contenidoRepository;

    @PostMapping("/crearContenido")
    public ResponseEntity<Contenido> crearContenido(@RequestBody Contenido contenido){
        contenidoRepository.create(contenido);
        return ResponseEntity.ok(contenido);
    }

    @PostMapping("/crearTema")
    public ResponseEntity<Tema> crearTema(@RequestBody Tema tema){
        contenidoRepository.create(tema);
        return ResponseEntity.ok(tema);
    }




}
