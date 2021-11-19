package com.example.practica.spring611.Dao;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoDao extends CrudRepository<Curso, Integer> {

}
