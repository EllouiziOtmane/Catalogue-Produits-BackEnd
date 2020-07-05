package org.tiw.catproduit.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Produit implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode ;
    private String designation ;
    private double price   ;
    private int quantite ;/*
    private Long  rank ;
	private String brand ;
	private String ean;
	private String Comapany  ;
	private String category ;
	private String type ;
	private String unit  ;
	private Float salesPrice ;
	private Float returnPrice ;
	private Float discount ;
	private Integer vat ;
	private Boolean hold ;
	private String holdReason  ;
	private Double weight ;
	private Double volume ;
	private Date lastUpdate  ;
	private Date creationDate ;
	private String photo ;*/


}
