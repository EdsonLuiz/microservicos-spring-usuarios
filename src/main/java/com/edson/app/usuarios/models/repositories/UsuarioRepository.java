package com.edson.app.usuarios.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edson.app.usuarios.models.entities.Usuario;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
	public Usuario findByUserName(String userName);
	
	@Query("select u from Usuario u where u.userName=?1")
	public Usuario getByUsername(String username);
}
