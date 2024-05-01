package com.co.dosman.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.dosman.common.usuario.entity.Curso;


public interface CursoRepository extends CrudRepository<Curso, Long> {
}
