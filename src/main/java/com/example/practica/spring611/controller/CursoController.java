package com.example.practica.spring611.controller;

import com.example.practica.spring611.Dao.ExpedienteDao;
import com.example.practica.spring611.entity.Curso;
import com.example.practica.spring611.entity.Expediente;
import com.example.practica.spring611.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping("/crearCurso")
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso){
        cursoRepository.create(curso);
        return ResponseEntity.ok(curso);
    }

    @GetMapping("/buscarCurso/{id}")
    public ResponseEntity<Curso> buscarCurso(@PathVariable("{id}") Integer id){
        Optional<Curso> existeCurso= cursoRepository.getById(id);
        if(existeCurso.isPresent()){
            return ResponseEntity.ok(existeCurso.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/traerCursos")
    public List<Curso> traertodos(){
        return cursoRepository.traerTodos();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Curso> eliminar(@PathVariable("id") Integer id){
        Optional<Curso> existeCurso= cursoRepository.getById(id);
        if(existeCurso.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            cursoRepository.delete(id);
            return ResponseEntity.ok(existeCurso.get());
        }
    }

    @PutMapping("/actualizarCurso")
    public ResponseEntity<Curso> actualizaCurso(@RequestBody Curso curso){
        Optional<Curso> existeCurso=cursoRepository.getById(curso.getId());
        if(existeCurso.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(cursoRepository.update(curso));
        }
    }






}
