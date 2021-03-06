package br.com.menuTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.menuTest.domain.Tgmenu;
import br.com.menuTest.repositories.TgmenuRepository;

@Service
public class TgmenuService {

	// pra instancia automaticamento TgmenuRepository
	@Autowired
	private TgmenuRepository repo;

	public List<Tgmenu> findAll(){
		return repo.findAll();
	}
	
	public List<Tgmenu> findMenuR() {
		return repo.findMenuR();
	}
}
