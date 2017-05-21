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
		
if(materia.getNombre().matches("Introducción a la programación|Introducción a la ingeniería en software|Programación orientada a objetos|Estructura de datos|Análisis de algoritmos"
		+ "|Teoría de la computación|Construcción y evolución del software|Bases de datos|Análisis de requisitos|Programación web|"
		+ "Sistemas operativos|Aseguramiento de la calidad del software|Análisis y modelamiento de software|Programación de sistemas|"
		+ "Arquitectura de computadoras|Lenguajes de programación|Técnicas de pruebas de software|Diseño de software|Metodología de la investigación"
		+ "|Redes de computadoras|Normatividad y legislación|Arquitectura de software"
		+ "|Sistemas distribuidos|Administración de proyectos I|Métricas de software"
		+ "|Diseño de experimentos en ingeniería de software|Administración de proyectos II|Gestión tecnológica")){
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
