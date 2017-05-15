package mx.edu.uacm.herramientas.service;

import mx.edu.uacm.herramientas.domain.Administrador;

public interface AdministradorService {
	void agregarAdministrador(Administrador administrador);
	Administrador buscarXNombre(String nombre);
}
