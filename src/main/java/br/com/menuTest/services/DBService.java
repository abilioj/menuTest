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
import br.com.menuTest.repositories.TgrotasRepository;

@Service
public class DBService {

//	@Autowired
//	private BCryptPasswordEncoder pe;

	@Autowired
	private TgrotasRepository tgrotasRepository;

	public void instantiateTestDatabase() throws ParseException {

		List<Tgmenu> listasMenus = new ArrayList<>();
//		List<Tgrotas> listasRotas = new ArrayList<>();

		Tgrotas r1 = new Tgrotas();
		r1.setIdrota(0);
		r1.setRota(1);
		r1.setHref("");

		Tgrotas r2 = new Tgrotas();
		r2.setIdrota(1);
		r2.setRota(1);
		r2.setHref("/");
		
		Tgrotas r3 = new Tgrotas();
		r3.setIdrota(2);
		r3.setRota(1);
		r3.setHref("/user/n");

		
		tgrotasRepository.saveAll(Arrays.asList(r1, r2, r3));
		
		System.out.println(listasMenus);
	}
}
