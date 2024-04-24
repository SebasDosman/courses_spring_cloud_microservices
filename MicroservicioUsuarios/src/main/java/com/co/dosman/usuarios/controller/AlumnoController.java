package com.co.dosman.usuarios.controller;

import com.co.dosman.usuarios.entity.Alumno;
import com.co.dosman.usuarios.service.AlumnoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@RestController
public class AlumnoController {
    private AlumnoService alumnoService;

    @Value("${config.balanceador.test}")
    private String balanceadorTest;

    @GetMapping("/balanceadorTest")
    public ResponseEntity<?> balanceadorTest() {
        Map<String, Object> response = new HashMap<String, Object>();

        response.put("balanceador", balanceadorTest);
        response.put("alumnos", alumnoService.findAll());

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/listarAlumnos")
    public ResponseEntity<?> listarAlumnos() {
        return ResponseEntity.ok().body(alumnoService.findAll());
    }

    @GetMapping("/buscarAlumnoPorId/{id}")
    public ResponseEntity<?> buscarAlumnoPorId(@PathVariable Long id) {
        Optional<Alumno> alumno = alumnoService.findById(id);

        if (alumno.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(alumno.get());
    }

    @PostMapping("/crearAlumno")
    public ResponseEntity<?> crearAlumno(@RequestBody Alumno alumno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumno));
    }

    @PutMapping("/actualizarAlumno/{id}")
    public ResponseEntity<?> actualizarAlumno(@PathVariable Long id, @RequestBody Alumno alumno) {
        Optional<Alumno> alumnoGuardado = alumnoService.findById(id);

        if (alumnoGuardado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Alumno alumnoActualizado = alumnoGuardado.get();
        alumnoActualizado.setNombre(alumno.getNombre());
        alumnoActualizado.setApellido(alumno.getApellido());
        alumnoActualizado.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoActualizado));
    }

    @DeleteMapping("/eliminarAlumno/{id}")
    public ResponseEntity<?> eliminarAlumno(@PathVariable Long id) {
        alumnoService.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
