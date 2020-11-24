package com.example.shoppinglist.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String product_name;
	private String generic_name;
	private String quantity;
	private String brands;
	private String ingredients_text;
	private String image_small_url;
	private int energy_kcal_100g;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "slistId")
	private ShoppingList shoppingList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getGeneric_name() {
		return generic_name;
	}

	public void setGeneric_name(String generic_name) {
		this.generic_name = generic_name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getBrands() {
		return brands;
	}

	public void setBrands(String brands) {
		this.brands = brands;
	}

	public String getIngredients_text() {
		return ingredients_text;
	}

	public void setIngredients_text(String ingredients_text) {
		this.ingredients_text = ingredients_text;
	}

	public String getImage_small_url() {
		return image_small_url;
	}

	public void setImage_small_url(String image_small_url) {
		this.image_small_url = image_small_url;
	}

	public int getEnergy_kcal_100g() {
		return energy_kcal_100g;
	}

	public void setEnergy_kcal_100g(int energy_kcal_100g) {
		this.energy_kcal_100g = energy_kcal_100g;
	}

	public ShoppingList getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(ShoppingList shoppingList) {
		this.shoppingList = shoppingList;
	}

}
