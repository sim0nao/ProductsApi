package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	private ProductRepository ProductRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.ok().body(ProductRepository.findAll());
	}

	
	  @GetMapping(value = "/{id}") 
	  public ResponseEntity<Product>findById(@PathVariable Long id) { 
		  return ResponseEntity.ok().body(ProductRepository.findById(id)); }
	  
	  
	  
	 
}
