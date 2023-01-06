package tn.essat.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.ITypePfe;
import tn.essat.dao.Ipfe;
import tn.essat.model.Pfe;
import tn.essat.model.TypePfe;

@RestController
@CrossOrigin("*")
public class AppCrt {
	@Autowired
	Ipfe dao_pfe;

	@Autowired
	ITypePfe dao_type;
	

	@GetMapping("/pfes")
	public List<Pfe> f() {
		return dao_pfe.findAll();
	}

	@GetMapping("/types")
	public List<TypePfe> f1() {
		return dao_type.findAll();
	}

	@GetMapping("/pfebytype/{id}")
	public List<Pfe> f1(@PathVariable("id") int id) {
		return dao_pfe.getAllPfeByType(id);
	}

	@GetMapping("/PfesBytitre/{titre}")
	public List<Pfe> f2(@PathVariable("titre") String titre) {
		return dao_pfe.getAllPfeByTitre(titre);
	}

	@GetMapping("/delete/{id}")
	public void f3(@PathVariable("id") Integer id) {
		dao_pfe.deleteById(id);
	}

	@PostMapping("/save")
	public Pfe f4(@RequestBody Pfe pfe) {
		return dao_pfe.save(pfe);
	}

}