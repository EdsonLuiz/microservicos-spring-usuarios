package com.edson.app.usuarios.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.edson.app.commons.usuarios.models.entities.Usuario;


@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
	@RestResource(path = "findusername")
	public Usuario findByUserName(@Param("name") String username);
	
	@Query("select u from Usuario u where u.userName=?1")
	public Usuario getByUsername(String username);

}
