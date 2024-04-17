package com.co.dosman.usuarios.service;

import com.co.dosman.usuarios.entity.Alumno;

import java.util.Optional;


public interface IAlumnoService {
    public Iterable<Alumno> findAll();
    public Optional<Alumno> findById(Long id);
    public Alumno save(Alumno alumno);
    public void deleteById(Long id);
}
