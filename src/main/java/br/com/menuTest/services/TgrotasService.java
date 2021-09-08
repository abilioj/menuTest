package br.com.menuTest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.menuTest.domain.Tgrotas;
import br.com.menuTest.domain.dto.TgrotasDTO;
import br.com.menuTest.repositories.TgrotasRepository;
import br.com.menuTest.services.exceptions.ObjectNotFoundException;

@Service
public class TgrotasService {
	
	@Autowired
	private TgrotasRepository repo;

	private void updateData(Tgrotas newObj, Tgrotas obj) {
		newObj.setIdrota(obj.getIdrota());
	}
	
	public Tgrotas insert(Tgrotas obj) {
		return repo.save(obj);
	}

	public Tgrotas find(Integer id) {
		Optional<Tgrotas> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
		
	public List<Tgrotas> findAll(){
		return repo.findAll();
	}
	
	public Tgrotas update(Tgrotas obj) {
		Tgrotas objNew = find(obj.getIdrota());
		updateData(objNew, obj);
		return repo.save(obj);
	}

	
	public TgrotasDTO fromDTO(Tgrotas obj) {
		TgrotasDTO oDTO = new TgrotasDTO(obj.getIdrota(), obj.getHref(), obj.getRota());
		return oDTO;
	}
    
}
