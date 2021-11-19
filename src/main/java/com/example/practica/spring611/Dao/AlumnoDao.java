package com.example.practica.spring611.Dao;

import com.example.practica.spring611.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoDao extends CrudRepository<Alumno, Integer> {
}
