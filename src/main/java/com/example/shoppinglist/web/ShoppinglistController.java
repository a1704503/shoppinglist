package com.example.shoppinglist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.shoppinglist.domain.Product;
import com.example.shoppinglist.domain.ProductDAO;

@Controller
public class ShoppinglistController {

	@Autowired
	private ProductDAO productDAO;

	// SHOPPINGLIST

	@GetMapping("/shoppinglist")
	public String ShowShoppingList(Model model) {
		List<Product> product = productDAO.showAllInList();
		model.addAttribute("product", new Product());
		model.addAttribute("shoppinglist", product);

		return "shoppinglist";
	}

	@GetMapping("/remove/{id}")
	public String removeItemFromShoppingList(@PathVariable("id") Long product_id) {
		productDAO.deleteFromListById(product_id);

		return "redirect:../shoppinglist";
	}

	@GetMapping(value = "/clearlist")
	public String clearShoppingList() {
		productDAO.clearList();

		return "redirect:../shoppinglist";
	}

	// PRODUCT - SEARCH

	// empty product for user
	@GetMapping(value = "/index")
	public String emptyProduct(Model model) {
		model.addAttribute("product", new Product());

		return "index";
	}

	@GetMapping(value = "/search")
	public String searchProduct(@ModelAttribute Product product, Model model) {
		List<Product> products = productDAO.findByName(product);
		model.addAttribute("listofproducts", products);

		return "index";
	}

	@GetMapping(value = "/addproduct/{id}")
	public String addProductToList(@PathVariable("id") Long product_id) {
		productDAO.addToListById(product_id);

		return "redirect:/index";
	}

}
