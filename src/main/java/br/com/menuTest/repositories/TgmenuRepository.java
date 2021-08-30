package br.com.menuTest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.menuTest.bean.Tgmenu;

@Repository
public interface TgmenuRepository  extends JpaRepository<Tgmenu,Integer>{

//	 @Query("select distinct t from Tgmenu t " +
//	            "left join fetch t.fkmenu tt " +
//	            "left join fetch t.children ch " +
//	            "where tt is null")
//	 List<Tgmenu> findAll();
	 
}
