package br.com.menuTest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	@RequestMapping(method = RequestMethod.GET)
	private ResponseEntity<String> main() {
		return ResponseEntity.ok("Usuarios Api Rest.");
	}
	
}
