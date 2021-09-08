package br.com.menuTest.services;

import java.text.ParseException;
import java.util.ArrayList;
//import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.menuTest.domain.Tgmenu;
import br.com.menuTest.domain.Tgrotas;
import br.com.menuTest.repositories.TgmenuRepository;
import br.com.menuTest.repositories.TgrotasRepository;

@Service
public class DBService {

//	@Autowired
//	private BCryptPasswordEncoder pe;

	@Autowired
	private TgrotasRepository tgrotasRepository;

	@Autowired
	private TgmenuRepository tgmenuRepository;

	public void instantiateTestDatabase() throws ParseException {

		List<Tgmenu> listasMenus = new ArrayList<>();
		List<Tgrotas> listasRotas = new ArrayList<>();

		Tgrotas r1 = new Tgrotas();
		r1.setIdrota(0);
		r1.setRota(1);
		r1.setHref("");

		Tgrotas r2 = new Tgrotas();
		r2.setIdrota(1);
		r2.setRota(1);
		r2.setHref("/");

		Tgmenu m1 = new Tgmenu();
		m1.setIdmenu(0);
		m1.setAtivo(new Short("0"));
		m1.setDescricao("Rota");
		m1.setClass1("fa fa-plus-circle");
		m1.setRotas(r1);

		Tgmenu m2 = new Tgmenu();
		m2.setIdmenu(0);
		m2.setAtivo(new Short("0"));
		m2.setDescricao("novo");
		m2.setClass1("fa fa-plus-circle");
		m2.setRotas(r1);

		listasRotas.add(r1);
		listasRotas.add(r2);

		listasMenus.add(m1);
		listasMenus.add(m2);
		
		tgrotasRepository.saveAll(Arrays.asList(r1, r2));
//		tgmenuRepository.saveAll(Arrays.asList(m1,m2));
	}
}
