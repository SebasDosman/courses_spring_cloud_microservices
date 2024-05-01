package com.co.dosman.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.dosman.common.usuario.entity.Alumno;


public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
