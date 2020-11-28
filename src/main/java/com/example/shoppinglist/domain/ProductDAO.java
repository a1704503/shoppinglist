package com.example.shoppinglist.domain;

import java.util.List;

public interface ProductDAO {

	// Productlist

	public List<Product> findByNameProductlist(Product productname);

	public List<Product> findAllProductlist();

	public List<Product> findByIdProductlist(long id);

	// Shoppinglist

	public void addToShoppinglistById(long id);

	public void deleteFromShoppinglistById(long id);

	public List<Product> showAllInShoppinglist();

	public void clearShoppinglist();
}
