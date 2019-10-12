package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class dbOperations {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService = ctx.getBean("productServiceImpl", ProductService.class);
		List<Product> allProducts = productService.findAllProducts();
		System.out.println("all products are : ");
		for (Product product : allProducts) {
			System.out.println(product);
		}
	
		List<Product> priceSortedProducts = productService.findProductsByPrice(20000, 500);
		System.out.println("price sorted products are : ");
		for (Product product : priceSortedProducts) {
			System.out.println(product);
		}
		
			
		List<Product> namedProducts = productService.findProductsByName("halwa");
		System.out.println("products of name halwa are : ");
		for (Product product : namedProducts) {
			System.out.println(product);
		}
		
		List<Product> brandedProducts = productService.findProductsByBrand("desi");
		System.out.println("products of brand desi are : ");
		for (Product product : brandedProducts) {
			System.out.println(product);
		}
		System.out.println("product of id 1002 are : ");
		Product p = productService.findProductById(1002);
		
		if (p!=null) {
			System.out.println(p);
			productService.updateProduct(p);
			productService.removeProduct(p);
		}
		else {
			System.out.println("product not found");
		}
		Product updatedProduct = new Product(1075, "daiomnd", "gem", 102000);
		productService.insertProduct(p); 
		
	}

}
