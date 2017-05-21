package mx.edu.uacm.herramientas.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import mx.edu.uacm.herramientas.domain.Administrador;
import mx.edu.uacm.herramientas.domain.repository.AdministradorRepository;
import mx.edu.uacm.herramientas.service.AdministradorService;

public class AdministradorServiceImpl implements AdministradorService {
	private static final int LOGITUD_MAX = 70;
	private static final int LOGITUD_MAX_CONTRA = 20;
	private static final int LOGITUD_MAX_TEL = 10;
	private static final int LOGITUD_MAX_EMAIL = 100;


	public static final Logger log = Logger.getLogger(AdministradorServiceImpl.class);
	

	@Autowired
	AdministradorRepository administradorRepository;
	
	@Autowired
	MessageSource messages;
	
	
	
	public String agregarAdministrador(Administrador administrador) {
		if(administrador.getApellidoPaterno().matches("[A-Za-zÁ\\s]+")){
			return messages.getMessage("E002", null, LocaleContextHolder.getLocale());
			
		}
		if(administrador.getNombre().matches("[A-Za-zÁ\\s]+")){
			return messages.getMessage("E001", null, LocaleContextHolder.getLocale());
			
		}
		if(administrador.getApellidoMaterno().matches("[A-Za-zÁ\\s]+")){
			return messages.getMessage("E003", null, LocaleContextHolder.getLocale());
			
			
		}
		if(administrador.getEmail().matches("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$")){
			
			return messages.getMessage("E006", null, LocaleContextHolder.getLocale());
			
		}
	    if(administrador.getTelefono().matches("^[0-9]*$")){
	    	
	    	return messages.getMessage("E005", null, LocaleContextHolder.getLocale());
			
	    	
	    }
	    if(administrador.getContrasena().length()>LOGITUD_MAX_CONTRA){
	    	return messages.getMessage("E007", null, LocaleContextHolder.getLocale());
			
	    	
	    }
	    
	    if(administrador.getContrasena().matches("[A-Za-zÁ\\s]+")){
	    	return messages.getMessage("E007", null, LocaleContextHolder.getLocale());
			
	    }
	    if(administrador.getUsuario().length()>LOGITUD_MAX_CONTRA){
	    	return messages.getMessage("E004", null, LocaleContextHolder.getLocale());
			
	    }
	    if(administrador.getUsuario().matches("[A-Za-zÁ\\s]+")){
	    	
	    	return messages.getMessage("E004", null, LocaleContextHolder.getLocale());
			
	    }
	
	    if(administrador.getNombre().length()>LOGITUD_MAX){
	    	return messages.getMessage("E001", null, LocaleContextHolder.getLocale());
			
	    }
	    if(administrador.getApellidoPaterno().length()>LOGITUD_MAX){
	    	return messages.getMessage("E002", null, LocaleContextHolder.getLocale());
			
	    }
	    if(administrador.getApellidoMaterno().length()>LOGITUD_MAX){
	    	return messages.getMessage("E003", null, LocaleContextHolder.getLocale());
			
	    }
	    
	    if(administrador.getEmail().length()>LOGITUD_MAX_EMAIL){
	    	
	    	return messages.getMessage("E006", null, LocaleContextHolder.getLocale());
			
	    }
	    if(administrador.getTelefono().length()>LOGITUD_MAX_TEL){
	    	return messages.getMessage("E005", null, LocaleContextHolder.getLocale());
			
	    }
	    
	  
        administradorRepository.save(administrador);
        return null;
	}

	public Administrador buscarXId(Long id) {
		
		return administradorRepository.findOne(id);
	}

}
