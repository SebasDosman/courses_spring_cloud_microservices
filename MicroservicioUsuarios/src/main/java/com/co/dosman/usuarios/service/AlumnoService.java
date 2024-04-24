package com.co.dosman.usuarios.service;

import com.co.dosman.usuarios.entity.Alumno;

import java.util.Optional;


public interface AlumnoService {
    Iterable<Alumno> findAll();
    Optional<Alumno> findById(Long id);
    Alumno save(Alumno alumno);
    void deleteById(Long id);
}
