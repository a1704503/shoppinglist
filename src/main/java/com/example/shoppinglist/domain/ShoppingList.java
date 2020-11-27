package com.example.shoppinglist.domain;

import java.util.List;

public class ShoppingList {

	private Long sl_id;
	private String sl_name;

	// For H2-inmemory DB
	private List<Product> products;

	public ShoppingList() {
		super();
	}

	public ShoppingList(Long sl_id) {
		super();
		this.sl_id = sl_id;
	}

	public ShoppingList(Long sl_id, String sl_name) {
		super();
		this.sl_id = sl_id;
		this.sl_name = sl_name;
	}

	public ShoppingList(Long sl_id, String sl_name, List<Product> products) {
		super();
		this.sl_id = sl_id;
		this.sl_name = sl_name;
		this.products = products;
	}

	public Long getSl_id() {
		return sl_id;
	}

	public void setSl_id(Long sl_id) {
		this.sl_id = sl_id;
	}

	public String getSl_name() {
		return sl_name;
	}

	public void setSl_name(String sl_name) {
		this.sl_name = sl_name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
