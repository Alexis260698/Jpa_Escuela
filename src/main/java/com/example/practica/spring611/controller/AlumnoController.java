package com.example.practica.spring611.controller;

import com.example.practica.spring611.dto.AlumnoDto;
import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Expediente;
import com.example.practica.spring611.repository.AlumnoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/traerAlumnos")
    public List<Alumno> traerAlumnos() {
        return alumnoRepository.getAll();
    }

    @GetMapping("/buscaPorId/{id}")
    public ResponseEntity<Alumno> buscarPorId(@PathVariable("id") Integer id) {
        Optional<Alumno> existeAlumno = alumnoRepository.getbyId(id);
        if (existeAlumno.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(existeAlumno.get());
        }
    }


    @PostMapping("/CrearAlumno")
    public ResponseEntity<Alumno> crearAlumno(@RequestBody Alumno alumno) {
        // Alumno alumno=modelMapper.map(alumnoDto,Alumno.class);

        /*
        Alumno alumno=new Alumno();
        alumno.setNombre(alumnoDto.getNombre());
        alumno.setApellido(alumnoDto.getApellido());
        alumno.setMail(alumnoDto.getMail());
        alumno.setDireccion(alumnoDto.getDireccion());

        Expediente expediente= new Expediente();

        alumno.setExpedientes(new List.of());
        */
        alumnoRepository.create(alumno);
        return ResponseEntity.ok(alumno);
    }


    @DeleteMapping("/eliminarAlumno/{id}")
    public ResponseEntity<Alumno> eliminarAlumno(@PathVariable("id") Integer id) {
        Optional<Alumno> existeAlumno = alumnoRepository.getbyId(id);
        if (existeAlumno.isPresent()) {
            alumnoRepository.delete(id);
            return ResponseEntity.ok(existeAlumno.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/ActualizarAlumno")
    public ResponseEntity<Alumno> actualizarAlumno(@RequestBody Alumno alumno) {
        Optional<Alumno> existeAlumno = alumnoRepository.getbyId(alumno.getDni());

        if (existeAlumno.isPresent()) {
            return ResponseEntity.ok(alumnoRepository.update(alumno));

        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/traerExpedientes/{dni}")
    public ResponseEntity<List<Expediente>> getExpedientes(@PathVariable("dni") Integer dni) {
        Optional<Alumno> alumno = alumnoRepository.getbyId(dni);

        if (alumno.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(alumnoRepository.getExpedientes(dni));
        }

    }


}
