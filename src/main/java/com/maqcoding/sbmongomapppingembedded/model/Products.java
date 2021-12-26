package com.maqcoding.sbmongomapppingembedded.model;

import javax.annotation.security.DenyAll;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {

	private String name;
	private int quantity;
	private int price;
	
	
	
}
