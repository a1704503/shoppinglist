package com.example.shoppinglist.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class ShoppingList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long slistId;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "shoppingList")
	private List<Product> products;

	public ShoppingList() {

	}
}
