package fr.mwahCorp.jWTSpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import fr.mwahCorp.jWTSpringSecurity.entity.Produit;
import fr.mwahCorp.jWTSpringSecurity.repository.ProduitRepository;

@SpringBootApplication
public class TpSpringAndAngularApplication implements CommandLineRunner{

	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(TpSpringAndAngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Produit.class);
		//Permet de demander à Spring Data Rest d'afficher les id. pas hyper utile
		produitRepository.save(new Produit(null, "Ordinateur LX 45", 6700, 3));
		produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
		produitRepository.save(new Produit(null, "Smartphone Samsung", 8000, 13));
		produitRepository.findAll().forEach(System.out::println);
		
	}

}
