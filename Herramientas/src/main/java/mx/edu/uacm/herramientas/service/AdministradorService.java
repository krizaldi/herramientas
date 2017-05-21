package mx.edu.uacm.herramientas.service;

import mx.edu.uacm.herramientas.domain.Administrador;

public interface AdministradorService {
	String agregarAdministrador(Administrador administrador);
	Administrador buscarXId(Long id);
}
