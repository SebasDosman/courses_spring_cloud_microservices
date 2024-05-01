package com.co.dosman.usuarios.service;

import com.co.dosman.common.service.CommonService;
import com.co.dosman.common.usuario.entity.Alumno;

import java.util.Optional;


public interface AlumnoService extends CommonService<Alumno> {
    Optional<Alumno> findById(Long id);
    Alumno save(Alumno alumno);
}
