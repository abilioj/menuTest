package br.com.menuTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.menuTest.domain.Tgbanco;

public interface TgbancoRepository  extends JpaRepository<Tgbanco,Integer> {

//	 "Tgbanco.findAll" - "SELECT t FROM Tgbanco t"
//	 "Tgbanco.findByIdtgbanco" - "SELECT t FROM Tgbanco t WHERE t.idtgbanco = :idtgbanco"
//	 "Tgbanco.findByCod" - "SELECT t FROM Tgbanco t WHERE t.cod = :cod"
//	 "Tgbanco.findByNome" - "SELECT t FROM Tgbanco t WHERE t.nome = :nome"
			 
}
