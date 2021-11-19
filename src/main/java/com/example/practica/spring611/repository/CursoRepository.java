package com.example.practica.spring611.repository;

import com.example.practica.spring611.Dao.CursoDao;
import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Curso;
import com.example.practica.spring611.entity.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CursoRepository {

    @Autowired
    private CursoDao cursoDao;

    public void create(Curso curso){
        cursoDao.save(curso);
    }

    public Optional<Curso> getById(Integer id){
        return cursoDao.findById(id);
    }

    public List<Curso> traerTodos() {
        return (List<Curso>) cursoDao.findAll();
    }

    public void delete(Integer id) {
        cursoDao.deleteById(id);
    }

    public Curso update(Curso curso) {
        return curso;
    }


}
