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

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Materia {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="materia_id")
	private Long id;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String semestre;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="materia", cascade={CascadeType.ALL})
	private List <Herramienta> herramientas;

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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the semestre
	 */
	public String getSemestre() {
		return semestre;
	}

	/**
	 * @param string the semestre to set
	 */
	public void setSemestre(String string) {
		this.semestre = string;
	}

	/**
	 * @return the herramientas
	 */
	public List<Herramienta> getHerramientas() {
		return herramientas;
	}

	/**
	 * @param herramientas the herramientas to set
	 */
	public void setHerramientas(List<Herramienta> herramientas) {
		this.herramientas = herramientas;
	}
	
	
	
		
	
}
