package com.example.shoppinglist.domain;

import java.util.List;

public interface ProductDAO {

	public List<Product> findByName(Product productname);

	public void addToListById(long id);

	public void deleteFromListById(long id);

	public List<Product> showAllInList();

	public void clearList();
}
