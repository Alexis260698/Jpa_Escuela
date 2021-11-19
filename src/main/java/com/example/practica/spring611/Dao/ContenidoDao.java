package com.example.practica.spring611.Dao;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Contenido;
import org.springframework.data.repository.CrudRepository;

public interface ContenidoDao extends CrudRepository<Contenido, Integer> {

}
