package br.com.menuTest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.menuTest.bean.Tgmenu;
import br.com.menuTest.services.TgmenuService;

@RestController
@RequestMapping(value = "/menu")
public class TgmenuResource {
	
	@Autowired
	private TgmenuService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Tgmenu>> findAll() {
		List<Tgmenu> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
