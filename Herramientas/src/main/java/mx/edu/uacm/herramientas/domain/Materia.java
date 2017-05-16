package mx.edu.uacm.herramientas.domain;//
//
//
//
//  @ Project : Herramientas de software
//  @ File Name : Busqueda.java
//  @ Date : 02/10/2016
//  @ Author : Equipo 1
//
//

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;



public class Materia {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private String nombre;
	@NotNull
	private int semestre;
	
	@ManyToOne
	@JoinColumn(name="Herramienta_id")
	private Herramienta herramienta;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the herramienta
	 */
	public Herramienta getHerramienta() {
		return herramienta;
	}
	/**
	 * @param herramienta the herramienta to set
	 */
	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}
	
	
	
	
}
