package mx.edu.uacm.herramientas.domain;//

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

//
//
//  @ Project : Herramientas de software
//  @ File Name : Busqueda.java
//  @ Date : 02/10/2016
//  @ Author : Irving Ziranda, Cesar López
//
//



@Entity
public class Herramienta {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="herramienta_id")
	private Long id;
	
	@NotNull
	private String nombre;
	@NotNull
	private String version;
	@NotNull
	private String descripcion;
	@NotNull
	private String url;
	
	private String costo;
	
	@NotNull
	private String categoriaSoftware;
	
	private String periodoLicencia;
		
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="herramienta", cascade={CascadeType.ALL})
	private List<Materia> materias;

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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the costo
	 */
	public String getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(String costo) {
		this.costo = costo;
	}

	/**
	 * @return the categoriaSoftware
	 */
	public String getCategoriaSoftware() {
		return categoriaSoftware;
	}

	/**
	 * @param categoriaSoftware the categoriaSoftware to set
	 */
	public void setCategoriaSoftware(String categoriaSoftware) {
		this.categoriaSoftware = categoriaSoftware;
	}

	/**
	 * @return the periodoLicencia
	 */
	public String getPeriodoLicencia() {
		return periodoLicencia;
	}

	/**
	 * @param periodoLicencia the periodoLicencia to set
	 */
	public void setPeriodoLicencia(String periodoLicencia) {
		this.periodoLicencia = periodoLicencia;
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
	
	
	
	
	
	
	
}
