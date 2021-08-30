package br.com.menuTest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeResource {
	@GetMapping
    private ResponseEntity<String> index() {
        return ResponseEntity.ok("Bem Vindo a Api Rest.");		
    }
}
