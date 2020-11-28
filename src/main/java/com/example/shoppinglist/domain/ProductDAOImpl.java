package com.example.shoppinglist.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbcT;

	public JdbcTemplate getJdbcT() {
		return jdbcT;
	}

	public void setJdbcT(JdbcTemplate jdbcT) {
		this.jdbcT = jdbcT;
	}

	// Find matching pairs with wildcards from DB
	public List<Product> findByNameProductlist(Product productname) {
		String sql = "SELECT * FROM dbo.products_table WHERE product_name LIKE CONCAT('%', ?, '%')";
		Object[] parameters = new Object[] { productname.getProduct_name() };
		RowMapper<Product> mapper = new ProductRowMapper();

		List<Product> product = jdbcT.query(sql, parameters, mapper);
		return product;
	}

	public List<Product> findAllProductlist() {
		String sql = "SELECT * FROM dbo.products_table";
		RowMapper<Product> mapper = new ProductRowMapper();
		List<Product> products = jdbcT.query(sql, mapper);

		return products;
	}

	public List<Product> findByIdProductlist(long id) {
		String sql = "SELECT * FROM dbo.products_table WHERE product_id = ?";
		Object[] parameters = new Object[] { id };
		RowMapper<Product> mapper = new ProductRowMapper();

		List<Product> product = jdbcT.query(sql, parameters, mapper);
		return product;
	}

	// Find & add to shoppinglist.dbo -list
	public void addToShoppinglistById(long id) {
		String sql = "INSERT INTO dbo.shoppinglist_table SELECT * FROM dbo.products_table WHERE product_id = ? ";
		Object[] parameters = new Object[] { id };

		jdbcT.update(sql, parameters);
	}

	public void deleteFromShoppinglistById(long id) {
		String sql = "DELETE FROM dbo.shoppinglist_table WHERE product_id = ?";
		Object[] parameters = new Object[] { id };

		jdbcT.update(sql, parameters);
	}

	public List<Product> showAllInShoppinglist() {
		String sql = "SELECT * FROM dbo.shoppinglist_table";
		RowMapper<Product> mapper = new ProductRowMapper();
		List<Product> products = jdbcT.query(sql, mapper);

		return products;
	}

	public void clearShoppinglist() {
		String sql = "DELETE FROM dbo.shoppinglist_table";
		jdbcT.update(sql);
	}

}
