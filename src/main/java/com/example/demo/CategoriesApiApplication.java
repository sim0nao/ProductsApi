package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;

@SpringBootApplication
public class CategoriesApiApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository category;
	@Autowired
	private ProductRepository product;

	
	public static void main(String[] args) {
		SpringApplication.run(CategoriesApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		category.save(cat1);
		Category cat2 = new Category(2L, "Books");
		category.save(cat2);
		Category cat3 = new Category(3L, "Pets");
		category.save(cat3);
		
		Product p1 = new Product(1L, "TV", 2200.00, cat1);
		product.save(p1);
		Product p2 = new Product(2L, "Domain Driven Design", 120.00, cat2);
		product.save(p2);
		Product p3 = new Product(3L, "PS5", 2800.00, cat1);
		product.save(p3);
		Product p4 = new Product(4L, "Docker", 100.00, cat2);
		product.save(p4);
		Product p5 = new Product(5L, "Ração Golden Gatos", 120.00, cat3);
		product.save(p5);
		Product p6= new Product(6L, "Ração Golden Cães", 130.00, cat3 );
		product.save(p6);

		cat1.getListProducts().addAll(Arrays.asList(p1, p3));
		cat2.getListProducts().addAll(Arrays.asList(p2, p4));
		cat3.getListProducts().addAll(Arrays.asList(p5, p6));
	
		
	}

}
