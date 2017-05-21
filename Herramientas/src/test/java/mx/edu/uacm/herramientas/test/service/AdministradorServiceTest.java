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
import mx.edu.uacm.herramientas.domain.Administrador;
import mx.edu.uacm.herramientas.service.AdministradorService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class AdministradorServiceTest {
public static final Logger log = Logger.getLogger(MateriaServiceTest.class);
	
	@Autowired
	AdministradorService administradorService;
	
	@Autowired
	MessageSource messages;
	@Test
	public void agregarAdministradorServiceTest(){
		log.debug("Iniciando metodo agregarAddministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("la conicion se cumple", mensajeError.equals(null));	
	}
	
	
	@Test
	public void malNombreAdministradorServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar121233");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E001",null, LocaleContextHolder.getLocale())));
	}
	
	
	@Test
	public void maxNombreAdministradorServiceTest(){
		log.debug("Iniciando metodo maxNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesarasjkjasjakjsakjakjsaksjaskajsakjsakjsakjsaksjaksjaksjaksjakjsakjsakjsksjakjaaskj"
				+ "shjhsajshjashajhsjashajshjahsjshajshajshjshjahsjhsjashjahsajhsajhsajshajhsajshajhsajhsajhsajhsajhsh"
				+ "shajhsajshjashjsahsajsahjsahsajahjahsjashjahsjsahjshajhsajsahjashjahshsajhajhsjshsjhsjahshjhsajhsas");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E001",null, LocaleContextHolder.getLocale())));
	}
	
	
	@Test
	public void malApellidoPaternoAdministradorServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez123");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E002",null, LocaleContextHolder.getLocale())));
	}
	
	@Test
	public void maxApellidoPaternoAdministradorServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopezahsahskjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjsajjsjjsjasajsajjasjssasasasasasa"
				+  "shjhsajshjashajhsjashajshjahsjshajshajshjshjahsjhsjashjahsajhsajhsajshajhsajshajhsajhsajhsajhsajhsh"
				+ "shajhsajshjashjsahsajsahjsahsajahjahsjashjahsjsahjshajhsajsahjashjahshsajhajhsjshsjhsjahshjhsajhsas");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E002",null, LocaleContextHolder.getLocale())));
	}
	
	
	@Test
	public void malApellidoMaternoAdministradorServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo1234");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E003",null, LocaleContextHolder.getLocale())));
	}
	
	@Test
	public void maxApellidoMaternoAdministradorServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredoahsahskjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjsajjsjjsjasajsajjasjssasasasasasa"
				+  "shjhsajshjashajhsjashajshjahsjshajshajshjshjahsjhsjashjahsajhsajhsajshajhsajshajhsajhsajhsajhsajhsh"
				+ "shajhsajshjashjsahsajsahjsahsajahjahsjashjahsjsahjshajhsajsahjashjahshsajhajhsjshsjhsjahshjhsajhsas");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E003",null, LocaleContextHolder.getLocale())));
	}
	
	@Test
	public void malEmailAdministradorServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234hotmail.com");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E006",null, LocaleContextHolder.getLocale())));
	}
	
	
	
	@Test
	public void maxEmailAdministradorServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234hotmail.comoahsahskjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjsajjsjjsjasajsajjasjssasasasasassa"
				+  "shjhsajshjashajhsjashajshjahsjshajshajshjshjahsjhsjashjahsajhsajhsajshajhsajshajhsajhsajhsajhsajhsxssssssssssssssssxxsasaxsh"
				+ "shajhsajshjashjsahsajsahjsahsajahjahsjashjahsjsahjshajhsajsahjashjahshsajhajhsjshsjhsjahshjhsajhsasasssssssssssssssssssssssss"
				+ "saxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxsxaaaaaaaaaaaaa");
		administrador.setTelefono("5520186950");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E006",null, LocaleContextHolder.getLocale())));
	}
	
	@Test
	public void malTelefonoServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("55201869ll");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E005",null, LocaleContextHolder.getLocale())));
	}
	
	@Test
	public void maxTelefonoServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("552018691111");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E005",null, LocaleContextHolder.getLocale())));
	}
	
	@Test
	public void malUsuarioServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186911");
		administrador.setUsuario("Cesar@@");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E004",null, LocaleContextHolder.getLocale())));
	}
	
	
	@Test
	public void maxUsuarioServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186911");
		administrador.setUsuario("Cesarsahgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggsgaaaaaaaaaaxhs"
				+ "xssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssxxaxsaxsax");
		administrador.setContrasena("cesar");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E004",null, LocaleContextHolder.getLocale())));
	}
	
	
	@Test
	public void malContrasenaServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186911");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesar?¡&");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E007",null, LocaleContextHolder.getLocale())));
	}
	
	@Test
	public void maxContrasenaServiceTest(){
		log.debug("Iniciando metodo malNombreAdministradorServiceTest");
		Administrador administrador=new Administrador();
		administrador.setNombre("Cesar");
		administrador.setApellidoPaterno("Lopez");
		administrador.setApellidoMaterno("Robredo");
		administrador.setEmail("cesar1234@hotmail.com");
		administrador.setTelefono("5520186911");
		administrador.setUsuario("Cesar");
		administrador.setContrasena("cesarcdsjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkjdsjdksjsk"
				+ "dssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
		String mensajeError=administradorService.agregarAdministrador(administrador);
		Assert.assertTrue("La condicion se cumple", mensajeError.equals(messages.getMessage("E007",null, LocaleContextHolder.getLocale())));
	}
	

}
