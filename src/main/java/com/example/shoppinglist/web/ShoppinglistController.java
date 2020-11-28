package com.example.shoppinglist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.shoppinglist.domain.Product;
import com.example.shoppinglist.domain.ProductDAO;

@Controller
public class ShoppinglistController {

	@Autowired
	private ProductDAO productDAO;

	// SHOPPINGLIST

	@GetMapping("/shoppinglist")
	public String ShowShoppingList(Model model) {
		List<Product> product = productDAO.showAllInShoppinglist();
		model.addAttribute("product", new Product());
		model.addAttribute("shoppinglist", product);

		return "shoppinglist";
	}

	@GetMapping("/remove/{id}")
	public String removeItemFromShoppingList(@PathVariable("id") Long product_id) {
		productDAO.deleteFromShoppinglistById(product_id);

		return "redirect:../shoppinglist";
	}

	@GetMapping(value = "/clearlist")
	public String clearShoppingList() {
		productDAO.clearShoppinglist();

		return "redirect:/shoppinglist";
	}

	// Shoppinglist REST - JSON
	@GetMapping("/shoppinglistjson")
	public @ResponseBody List<Product> shoppingListRest() {
		return (List<Product>) productDAO.showAllInShoppinglist();
	}

	// PRODUCT - SEARCH

	@GetMapping(value = "/index")
	public String emptyProduct(Model model) {
		model.addAttribute("product", new Product()); // empty product for user

		return "index";
	}

	@GetMapping(value = "/search")
	public String searchProduct(@ModelAttribute Product product, Model model) {
		List<Product> products = productDAO.findByNameProductlist(product);
		model.addAttribute("listofproducts", products);

		return "index";
	}

	@GetMapping(value = "/addproduct/{id}")
	public String addProductToList(@PathVariable("id") Long product_id) {
		productDAO.addToShoppinglistById(product_id);

		return "redirect:/shoppinglist";
	}

	// Product by id REST - JSON
	@GetMapping(value = "/productlistjson/{id}")
	public @ResponseBody List<Product> findByIdProductListRest(@PathVariable("id") Long id) {
		return (List<Product>) productDAO.findByIdProductlist(id);
	}

	// Productlist REST - JSON
	@GetMapping("/productlistjson")
	public @ResponseBody List<Product> productlistRest() {
		return (List<Product>) productDAO.findAllProductlist();
	}
}
