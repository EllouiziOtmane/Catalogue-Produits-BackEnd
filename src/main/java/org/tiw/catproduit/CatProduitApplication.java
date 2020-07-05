package org.tiw.catproduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.tiw.catproduit.dao.ProduitRepository;
import org.tiw.catproduit.entities.Produit;

@SpringBootApplication
public class CatProduitApplication implements CommandLineRunner {

    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;
    public static void main(String[] args) {

        SpringApplication.run(CatProduitApplication.class, args);
    }

  @Override
    public void run(String... args) throws Exception {

       restConfiguration.exposeIdsFor(Produit.class) ;
        /*
        produitRepository.save(new Produit(null,"A0043","PC HP",76000,10));
        produitRepository.save(new Produit(null,"A0044","Imprimante Canon",9900,9));
        produitRepository.save(new Produit(null,"A0045" ,"Bureau",6600,3));
        produitRepository.save(new Produit(null,"A0046","PC HP",76000,10));
        produitRepository.save(new Produit(null,"A0047","Imprimante Canon",9900,9));
        produitRepository.save(new Produit(null,"A0048" ,"Bureau",6600,3));
        produitRepository.findAll().forEach(p-> {
            System.out.println(p.toString());
        });*/
    }
}
