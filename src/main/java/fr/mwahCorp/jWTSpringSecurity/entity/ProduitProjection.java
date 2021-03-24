package fr.mwahCorp.jWTSpringSecurity.entity;

import org.springframework.data.rest.core.config.Projection;

//Une projection est une interface qui contient l'annoation "@Projection"
@Projection(name="P1", types = Produit.class) //a un nom et une classe
public interface ProduitProjection {
	public double getPrice();
	//http://localhost:8080/produits?projection=P1
	//Affiche le prix à la place du produit
}
