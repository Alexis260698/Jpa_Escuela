package com.example.practica.spring611.repository;

import com.example.practica.spring611.Dao.ContenidoDao;
import com.example.practica.spring611.entity.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContenidoRepository {

    @Autowired
    private ContenidoDao contenidoDao;

    public void create(Contenido contenido){
        contenidoDao.save(contenido);
    }
}
