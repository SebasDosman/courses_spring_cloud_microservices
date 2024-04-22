package com.co.dosman.usuarios.repository;

import com.co.dosman.usuarios.entity.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
