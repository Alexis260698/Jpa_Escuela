package com.example.practica.spring611.Dao;

import com.example.practica.spring611.entity.Expediente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpedienteDao extends CrudRepository<Expediente,Integer> {





}
