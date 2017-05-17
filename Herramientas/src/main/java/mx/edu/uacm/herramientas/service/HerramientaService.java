package mx.edu.uacm.herramientas.service;

import mx.edu.uacm.herramientas.domain.Herramienta;

public interface HerramientaService {
	Herramienta buscarXNombre(String nombre);
	String guardarHerramienta(Herramienta herramienta);
	

}
