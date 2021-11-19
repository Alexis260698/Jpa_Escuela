package com.example.practica.spring611.repository;

import com.example.practica.spring611.Dao.AlumnoDao;
import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlumnoRepository {

    @Autowired
    private AlumnoDao alumnoDao;

    public List<Alumno> getAll(){
        return (List<Alumno>) alumnoDao.findAll();
    }

    public Optional<Alumno> getbyId(Integer id){
        return alumnoDao.findById(id);
    }

    public Alumno create(Alumno alumno){
        alumnoDao.save(alumno);
        return alumno;
    }

    public void delete(Integer id){
        alumnoDao.deleteById(id);
    }

    public Alumno update(Alumno alumno){
        Alumno alumnoViejo= alumnoDao.findById(alumno.getDni()).get();
        alumnoViejo.setNombre(alumno.getNombre());
        alumnoViejo.setApellido(alumno.getApellido());
        alumnoViejo.setDireccion(alumno.getDireccion());
        alumnoViejo.setMail(alumno.getMail());
        alumnoDao.save(alumnoViejo);
        return alumnoViejo;
    }

    public List<Expediente> getExpedientes(Integer id){
        Alumno alumno= alumnoDao.findById(id).get();
        return alumno.getExpedientes();
    }
}
