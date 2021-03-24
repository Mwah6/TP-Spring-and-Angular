//package fr.mwahCorp.jWTSpringSecurity.web;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import fr.mwahCorp.jWTSpringSecurity.entity.Produit;
//import fr.mwahCorp.jWTSpringSecurity.repository.ProduitRepository;
//
////Pas toujours utile car Spring jpa rest fait tout le taff
//@CrossOrigin("*")
//@RestController
//public class ProduitRestController {
//	@Autowired
//	private ProduitRepository produitRepository;
////	@GetMapping(value="/listProduits",produces = MediaType.APPLICATION_ATOM_XML_VALUE) =>pour lui imposer un format
//	//Json par défaut
//	@GetMapping(value="/listProduits")
//	public List<Produit> litProduits() {
//		return produitRepository.findAll();
//	}
//	@GetMapping(value="/listProduits/{id}")
//	public Produit litProduits(@PathVariable(name="id") Long id) {
//		return produitRepository.findById( id).get();
//	}
//	@CrossOrigin("*")
//	@DeleteMapping(value="/listProduits/{id}")
//	public void delete(@PathVariable(name="id") Long id) {
//		 produitRepository.deleteById(id);
//	}
//	@PutMapping(value="/listProduits/{id}")
//	public Produit update(@PathVariable(name="id") Long id, @RequestBody Produit p) {
//		p.setId(id);
//		return produitRepository.save(p);
//	}
//	@PostMapping(value="/listProduits")
//	public Produit save( @RequestBody Produit p) {
//		return produitRepository.save(p);
//	}
//}
