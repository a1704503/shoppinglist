package com.example.shoppinglist.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product> {

	// Product sql response
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setBrands(rs.getString("brands"));
		product.setEnergy_kcal_100g(rs.getString("energy_kcal_100g"));
		product.setGeneric_name(rs.getString("generic_name"));
		product.setProduct_id(rs.getLong("product_id"));
		product.setImage_small_url(rs.getString("image_small_url"));
		product.setIngredients_text(rs.getString("ingredients_text"));
		product.setProduct_name(rs.getString("product_name"));
		product.setQuantity(rs.getString("quantity"));

		return product;
	}

}
