package mx.edu.uacm.herramientas.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import mx.edu.uacm.herramientas.domain.Materia;
import mx.edu.uacm.herramientas.domain.repository.MateriaRepository;
import mx.edu.uacm.herramientas.service.MateriaService;



@Service
public class MateriaServiceImpl implements MateriaService {
   
	@Autowired
	MessageSource messages;
	
	@Autowired
	MateriaRepository materiaRepository;
	public static final Logger log = Logger.getLogger(HerramientaServiceImpl.class);
	
	
	
	public String agregarMateria(Materia materia) {
		if(log.isDebugEnabled())
			log.debug("Entrando al metodo agregarMateria ");
		
if(materia.getNombre().matches("Introducci�n a la programaci�n|Introducci�n a la ingenier�a en software|Programaci�n orientada a objetos|Estructura de datos|An�lisis de algoritmos"
		+ "|Teor�a de la computaci�n|Construcci�n y evoluci�n del software|Bases de datos|An�lisis de requisitos|Programaci�n web|"
		+ "Sistemas operativos|Aseguramiento de la calidad del software|An�lisis y modelamiento de software|Programaci�n de sistemas|"
		+ "Arquitectura de computadoras|Lenguajes de programaci�n|T�cnicas de pruebas de software|Dise�o de software|Metodolog�a de la investigaci�n"
		+ "|Redes de computadoras|Normatividad y legislaci�n|Arquitectura de software"
		+ "|Sistemas distribuidos|Administraci�n de proyectos I|M�tricas de software"
		+ "|Dise�o de experimentos en ingenier�a de software|Administraci�n de proyectos II|Gesti�n tecnol�gica")){
			return messages.getMessage("message.mal.mat",new Object[]{materia.getNombre()}, LocaleContextHolder.getLocale());
		}
		if(materia.getNombre().length()>50){
			return messages.getMessage("message.max.mat", null, LocaleContextHolder.getLocale());
		}
		if(String.valueOf(materia.getSemestre()).matches("^[0-9]+2$")){
			
			return messages.getMessage("message.sem", null, LocaleContextHolder.getLocale());
		}
		if(String.valueOf(materia.getSemestre()).length()>2){
			return messages.getMessage("message.max.sem", null, LocaleContextHolder.getLocale());
		}

	materiaRepository.save(materia);
		return null;
	}

	public Materia buscarMateriaXNombre(Long id) {
		
		return materiaRepository.findOne(id);
	}

}
