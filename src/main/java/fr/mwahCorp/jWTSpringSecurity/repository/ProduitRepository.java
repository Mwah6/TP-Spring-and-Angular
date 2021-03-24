package fr.mwahCorp.jWTSpringSecurity.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.mwahCorp.jWTSpringSecurity.entity.Produit;

@CrossOrigin(origins = "http://localhost:4200") //dit à l'application que l'api rest est accessible de n'importe quel site
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long>{
	@RestResource(path = "/byDesignation")
	public List<Produit> findByDesignationContains(@Param("mc") String des);
	//http://localhost:8080/produits/search/byDesignation?mc=HP
	//"search" est un mot clé de Spring Data Rest
	@RestResource(path = "/byDesignationPage")
	public Page<Produit> findByDesignationContains(@Param("mc") String des, Pageable pageable);
	//Pour retourner des pages => plus sympa comme retour pour le client
	//http://localhost:8080/produits/search/byDesignationPage?mc=Imprimante%20HP&page=2&size=2
//	@RestResource(path = "deleteById")
//	public void deleteById(@Param("id") Long id);
	
}
