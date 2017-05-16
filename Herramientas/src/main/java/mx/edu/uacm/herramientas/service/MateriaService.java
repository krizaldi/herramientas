package mx.edu.uacm.herramientas.service;

import mx.edu.uacm.herramientas.domain.Materia;

public interface MateriaService {
	void agregarMateria(Materia materia);
	Materia buscarMateriaXNombre(Long id);
	

}
