package mx.edu.uacm.herramientas.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import mx.edu.uacm.herramientas.domain.Administrador;
import mx.edu.uacm.herramientas.domain.repository.AdministradorRepository;
import mx.edu.uacm.herramientas.service.AdministradorService;

public class AdministradorServiceImpl implements AdministradorService {
	private static final int LOGITUD_MAX = 70;


	public static final Logger log = Logger.getLogger(AdministradorServiceImpl.class);
	

	@Autowired
	AdministradorRepository administradorRepository;
	
	@Autowired
	MessageSource messages;
	
	
	
	public void agregarAdministrador(Administrador administrador) {
		if(administrador.getApellidoPaterno().matches("[A-Za-zÁ\\s]+")){
			
		}
		if(administrador.getNombre().matches("[A-Za-zÁ\\s]+")){
			
		}
		if(administrador.getApellidoMaterno().matches("[A-Za-zÁ\\s]+")){
			
			
		}
		if(administrador.getEmail().matches("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$")){
			
		}
	    if(administrador.getTelefono().matches("^[0-9]*$")){
	    	
	    	
	    	
	    }
	    if(administrador.getContrasena().length()>20){
	    	
	    	
	    }
	    
	    if(administrador.getContrasena().matches("[A-Za-zÁ\\s]+")){}
	    if(administrador.getUsuario().length()>20){}
	    if(administrador.getUsuario().matches("[A-Za-zÁ\\s]+")){
	    	
	    	
	    	
	    }
	    if(administrador.equals(null)){
	    	
	    }
	    if(administrador.getNombre().length()>LOGITUD_MAX){
	    	
	    }
	    if(administrador.getApellidoPaterno().length()>LOGITUD_MAX){
	    	
	    }
	    if(administrador.getApellidoMaterno().length()>LOGITUD_MAX){
	    	
	    }
	    
	    if(administrador.getEmail().length()>100){}
	    if(administrador.getTelefono().length()>10){}
        administradorRepository.save(administrador);
	}

	public Administrador buscarXId(Long id) {
		
		return administradorRepository.findOne(id);
	}

}
