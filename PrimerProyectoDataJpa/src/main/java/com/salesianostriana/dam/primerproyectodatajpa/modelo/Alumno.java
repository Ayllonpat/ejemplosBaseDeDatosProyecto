package com.salesianostriana.dam.primerproyectodatajpa.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
@Table(name="alumnado")
public class Alumno {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(columnDefinition= "VARCHAR(100)") 	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
	public Alumno(String n, String a, String e) {
		this.nombre = n;
		this.apellidos = a;
		this.email = e;
	}

}
