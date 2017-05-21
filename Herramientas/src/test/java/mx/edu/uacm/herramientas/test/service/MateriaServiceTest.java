package mx.edu.uacm.herramientas.test.service;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import mx.edu.uacm.herramientas.Application;
import mx.edu.uacm.herramientas.domain.Materia;
import mx.edu.uacm.herramientas.service.MateriaService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class MateriaServiceTest {
public static final Logger log = Logger.getLogger(MateriaServiceTest.class);
	
	@Autowired
	MateriaService materiaService;
	
	@Autowired
	MessageSource messages;
	
	
	
	@Test
	public void agregarMateriaServiceTest() {
		log.debug("Iniciando metodo agregarMateriaServiceTest");
		Materia materia=new Materia();
		materia.setNombre("Introducción a la programación");
		materia.setSemestre("1");
		String mensajeDeError = materiaService.agregarMateria(materia);
		
		Materia materiaEnocontrada = materiaService.buscarMateriaXNombre(materia.getId());
        Assert.assertNotNull(materiaEnocontrada);
		
		Assert.assertTrue("La concicion se cumple", materia.getId().equals(materiaEnocontrada.getId()));
		
		Assert.assertTrue("la condicion se cumple",mensajeDeError.equals(null));
		
	}
	
	@Test
	public void nombreMateriaServiceTest(){
		log.debug("Iniciando metodo nombreMateriaServiceTest");
		Materia materia=new Materia();
		materia.setNombre("Introducción");
		materia.setSemestre("1");
		String mensajeDeError = materiaService.agregarMateria(materia);
		Assert.assertTrue("La condicion se cumple", mensajeDeError.equals(messages.getMessage("message.mal.mat",new Object[] {materia.getNombre()}, LocaleContextHolder.getLocale())));
		
	}
	
	@Test
	public void maxNombreMateriaServiceTest(){
	log.debug("Iniciando metodo maxNombreMateriaServiceTest");
	Materia materia=new Materia();
	materia.setNombre("Introducciónashledemdeuwjhsgflmnbdgwtyendismneirutyetrtrtrtrtrtrtrtrtrtrtrtrtrtr");
	materia.setSemestre("1");
	String mensajeDeError = materiaService.agregarMateria(materia);
	Assert.assertTrue("La condicion se cumple", mensajeDeError.equals(messages.getMessage("message.max.mat",null, LocaleContextHolder.getLocale())));

    }
	
	@Test
	public void maxSemestreMateriaServiceTest(){
		
		log.debug("Iniciando metodo maxSemestreMateriaServiceTest");
		Materia materia=new Materia();
		materia.setNombre("Introducción a la programación");
		materia.setSemestre("103");
		String mensajeDeError = materiaService.agregarMateria(materia);
		Assert.assertTrue("La condicion se cumple", mensajeDeError.equals(messages.getMessage("message.max.sem",null, LocaleContextHolder.getLocale())));
		
		
		
	}
	
	
	@Test
	public void SemestreMateriaServiceTest(){
		
		log.debug("Iniciando metodo SemestreMateriaServiceTest");
		Materia materia=new Materia();
		materia.setNombre("Introducción a la programación");
		materia.setSemestre("L");
		String mensajeDeError = materiaService.agregarMateria(materia);
		Assert.assertTrue("La condicion se cumple", mensajeDeError.equals(messages.getMessage("message.sem",null, LocaleContextHolder.getLocale())));
		
		
		
	}
	
	
	
	
	
	

}
