package mx.edu.uacm.herramientas.service.impl;

import mx.edu.uacm.herramientas.domain.Materia;
import mx.edu.uacm.herramientas.domain.repository.MateriaRepository;
import mx.edu.uacm.herramientas.service.MateriaService;

public class MateriaServiceImpl implements MateriaService {
   
	MateriaRepository materiaRepository;
	
	
	
	
	public void agregarMateria(Materia materia) {
		
		if(materia.getNombre().matches("[Introduccion a la programacion||Programacion Orientada a Objetos]+")){
			
		}
		if(materia.getNombre().length()>50){
			
		}
		if(String.valueOf(materia.getSemestre()).matches("^[0-9]+2$")){}
		if(String.valueOf(materia.getSemestre()).length()>2){}

	}

	public Materia buscarMateriaXNombre(Long id) {
		
		return materiaRepository.findOne(id);
	}

}
