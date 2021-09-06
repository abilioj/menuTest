package br.com.menuTest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.menuTest.bean.Tgmenu;

@Repository
public interface TgmenuRepository  extends JpaRepository<Tgmenu,Integer>{

	 @Query("select t.idmenu,t.ativo,t.descricao,r.href,t.class1"
	 		+ " from Tgmenu t, Tgrotas r"
	 		+ " where r.idrota=t.rotas ")
	 List<Tgmenu> findAll();

	@Transactional(readOnly = true)
	 @Query("select distinct t from Tgmenu t " +
	            "left join fetch t.fkmenu tt " +
	            "left join fetch t.tgmenuList ch " +
	            "where tt is null")
	public List<Tgmenu> findMenuR();
}
