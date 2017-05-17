package mx.edu.uacm.herramientas.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import mx.edu.uacm.herramientas.domain.Herramienta;
import mx.edu.uacm.herramientas.domain.repository.HerramientaRepository;
import mx.edu.uacm.herramientas.service.HerramientaService;



@Service
public class HerramientaServiceImpl implements HerramientaService {
	
	private static final int MAX_NOMBRE = 100;
	private static final int MIN_NOMBRE = 1;
	
	private static final int MAX_VERSION = 50;
	private static final int MIN_VERSION = 1;
	
	private static final int MAX_DESCRIPCION = 1000;
	private static final int MIN_DESCRIPCION = 20;

	public static final Logger log = Logger.getLogger(HerramientaServiceImpl.class);
	
	
	@Autowired
	MessageSource messages;
	
	@Autowired
	HerramientaRepository herramientaRepository;
	
	
	public String guardarHerramienta(Herramienta herramienta){
		
		if(log.isDebugEnabled())
			log.debug("Entrando al metodo guardarHerramienta ");
		
		if(String.valueOf(herramienta.getNombre()).length() < MIN_NOMBRE )
			return messages.getMessage("message.min", null, LocaleContextHolder.getLocale());
		if(String.valueOf(herramienta.getNombre()).length() > MAX_NOMBRE )
			return messages.getMessage("message.max.nom", null, LocaleContextHolder.getLocale());
		if(!(herramienta.getNombre().matches("^[A-Za-z0-9\\s]+$")) )
			return messages.getMessage("message.alfa.nom", null, LocaleContextHolder.getLocale());
		
		
		
		if(String.valueOf(herramienta.getVersion()).length() < MIN_VERSION )
			return messages.getMessage("message.min", null, LocaleContextHolder.getLocale());
		if(String.valueOf(herramienta.getVersion()).length() > MAX_VERSION )
			return messages.getMessage("message.max.ver", null, LocaleContextHolder.getLocale());
		if(!(herramienta.getVersion().matches("^[A-Za-z0-9\\s]+$")) )
			return messages.getMessage("message.alfa.ver", null, LocaleContextHolder.getLocale());
		
		
		if(String.valueOf(herramienta.getDescripcion()).length() < MIN_DESCRIPCION )
			return messages.getMessage("message.min.desc", null, LocaleContextHolder.getLocale());
		if(String.valueOf(herramienta.getDescripcion()).length() > MAX_DESCRIPCION )
			return messages.getMessage("message.max.desc", null, LocaleContextHolder.getLocale());
		
		if( !(herramienta.getUrl().matches("^(https?://)?(([\\w!~*'().&=+$%-]+: )?[\\w!~*'().&=+$%-]+@)"
				+ "?(([0-9]{1,3}\\.){3}[0-9]{1,3}|([\\w!~*'()-]+\\.)*([\\w^-][\\w-]{0,61})?[\\w]\\.[a-z]{2,6})"
				+ "(:[0-9]{1,4})?((/*)|(/+[\\w!~*'().;?:@&=+$,%#-]+)+/*)$")))
			return messages.getMessage("message.url", null, LocaleContextHolder.getLocale());
		
		
		if(!(herramienta.getCosto().matches("^[0-9\\s]+$")) )
			return messages.getMessage("message.cos", null, LocaleContextHolder.getLocale());
		
		if(!(herramienta.getCategoriaSoftware().matches("OpenSource| Propietario| Software Libre")) )
			return messages.getMessage("message.catSof", null, LocaleContextHolder.getLocale());
		
		if(!(herramienta.getPeriodoLicencia().matches("^[A-Za-z0-9\\s]+$")) )
			return messages.getMessage("message.alfa", null, LocaleContextHolder.getLocale());
		

		
		
		
		
		
		return null;
		
	}


	public Herramienta buscarXNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
