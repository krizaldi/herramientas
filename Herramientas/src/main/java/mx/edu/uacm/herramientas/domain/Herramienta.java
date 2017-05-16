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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Herramienta {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private String nombre;
	@Size(max=200)
	private String descripcion;
	@NotNull
	private String version;
	@Size(max=50)
	private String tipoDlicencia;
	@Size(max=50)
	private String periodo;
	@Size(max=50)
	private String costo;
	@Size(max=300)
	private String url;
	@OneToMany(mappedBy="herramienta", fetch = FetchType.EAGER, cascade={CascadeType.ALL})
	private List<Materia> materias;
	
	private Materia materia;
	
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTipoDlicencia() {
		return tipoDlicencia;
	}
	public void setTipoDlicencia(String tipoDlicencia) {
		this.tipoDlicencia = tipoDlicencia;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the materias
	 */
	public List<Materia> getMaterias() {
		return materias;
	}
	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	
}
