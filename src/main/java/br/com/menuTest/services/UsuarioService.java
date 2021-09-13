package br.com.menuTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.menuTest.domain.Usuario;
import br.com.menuTest.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public void insert() {
		
	}
	
	public List<Usuario> findAll(){
		return repo.findAll();
	}
}
