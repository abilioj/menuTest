package br.com.menuTest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.menuTest.domain.Tgrotas;

@Repository
public interface TgrotasRepository extends JpaRepository<Tgrotas,Integer>{

	@Query("SELECT t.idrota,t.href,t.rota FROM Tgrotas t")
	List<Tgrotas> findAll();
	
}
