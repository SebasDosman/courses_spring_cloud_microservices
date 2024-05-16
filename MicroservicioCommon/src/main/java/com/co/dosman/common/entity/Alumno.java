package com.co.dosman.common.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;

    @Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} if (!(obj instanceof Alumno)) {
			return false;
		}
		
		Alumno alumno = (Alumno) obj;
		
		return this.id != null && this.id.equals(alumno.getId());
	}

	@Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    public void prePersist() {
        this.createAt = new Date();
    }
}
