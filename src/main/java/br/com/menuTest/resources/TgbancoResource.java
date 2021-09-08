package br.com.menuTest.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.menuTest.domain.Tgbanco;
import br.com.menuTest.services.TgbancoService;

@RestController
@RequestMapping(value = "/banco")
public class TgbancoResource {
	
	@Autowired
	private TgbancoService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Tgbanco>> findAll() {
		List<Tgbanco> listBanco = service.findAll();
		return ResponseEntity.ok().body(listBanco);
	}
	
}
