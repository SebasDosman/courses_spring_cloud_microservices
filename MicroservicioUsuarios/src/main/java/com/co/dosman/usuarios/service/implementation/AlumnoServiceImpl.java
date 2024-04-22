package com.co.dosman.usuarios.service.implementation;

import com.co.dosman.usuarios.entity.Alumno;
import com.co.dosman.usuarios.repository.AlumnoRepository;
import com.co.dosman.usuarios.service.AlumnoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@AllArgsConstructor
@Service
public class AlumnoServiceImpl implements AlumnoService {
    private final AlumnoRepository alumnoRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno> findById(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        alumnoRepository.deleteById(id);
    }
}
