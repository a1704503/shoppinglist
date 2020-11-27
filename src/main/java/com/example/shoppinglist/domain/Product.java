package com.example.shoppinglist.domain;

public class Product {

	private Long product_id;

	private String product_name;
	private String generic_name;
	private String quantity;
	private String brands;
	private String ingredients_text;
	private String image_small_url;
	private String energy_kcal_100g;

	// For H2-inmemoryDB

	// Constructors for adding a product
	public Product() {
		super();
	}

	public Product(Long product_id) {
		super();
		this.product_id = product_id;
	}

	public Product(Long product_id, String product_name) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
	}

	public Product(Long product_id, String product_name, String generic_name) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.generic_name = generic_name;
	}

	public Product(Long product_id, String product_name, String generic_name, String quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.generic_name = generic_name;
		this.quantity = quantity;
	}

	public Product(Long product_id, String product_name, String generic_name, String quantity, String brands) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.generic_name = generic_name;
		this.quantity = quantity;
		this.brands = brands;
	}

	public Product(Long product_id, String product_name, String generic_name, String quantity, String brands,
			String ingredients_text) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.generic_name = generic_name;
		this.quantity = quantity;
		this.brands = brands;
		this.ingredients_text = ingredients_text;
	}

	public Product(Long product_id, String product_name, String generic_name, String quantity, String brands,
			String ingredients_text, String image_small_url) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.generic_name = generic_name;
		this.quantity = quantity;
		this.brands = brands;
		this.ingredients_text = ingredients_text;
		this.image_small_url = image_small_url;
	}

	public Product(Long product_id, String product_name, String generic_name, String quantity, String brands,
			String ingredients_text, String image_small_url, String energy_kcal_100g) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.generic_name = generic_name;
		this.quantity = quantity;
		this.brands = brands;
		this.ingredients_text = ingredients_text;
		this.image_small_url = image_small_url;
		this.energy_kcal_100g = energy_kcal_100g;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
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

	public String getEnergy_kcal_100g() {
		return energy_kcal_100g;
	}

	public void setEnergy_kcal_100g(String energy_kcal_100g) {
		this.energy_kcal_100g = energy_kcal_100g;
	}

}
