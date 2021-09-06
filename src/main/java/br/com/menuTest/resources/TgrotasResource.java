package br.com.menuTest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.menuTest.bean.Tgrotas;
import br.com.menuTest.bean.dto.TgrotasDTO;
import br.com.menuTest.services.TgrotasService;

@RestController
@RequestMapping(value = "/rota")
public class TgrotasResource {

	@Autowired
	private TgrotasService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<TgrotasDTO> find(@PathVariable Integer id) {
		TgrotasDTO obj = service.fromDTO(service.find(id));
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Tgrotas>> findALL(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
}