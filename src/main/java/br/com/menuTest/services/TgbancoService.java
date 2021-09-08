package br.com.menuTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.menuTest.domain.Tgbanco;
import br.com.menuTest.repositories.TgbancoRepository;

@Service
public class TgbancoService {

	@Autowired
	private TgbancoRepository repo;
	
	public List<Tgbanco> findAll(){
		return repo.findAll();
	}
}
