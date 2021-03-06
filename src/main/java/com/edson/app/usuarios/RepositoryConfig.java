package com.edson.app.usuarios;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.edson.app.commons.usuarios.models.entities.Role;
import com.edson.app.commons.usuarios.models.entities.Usuario;


//@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}

	 
}
