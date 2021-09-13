package br.com.menuTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.menuTest.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
