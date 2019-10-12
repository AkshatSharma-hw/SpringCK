package com.zensar.services;
/**
 * @author Ak
 * @version 1.0
 * @date_of_creation 4.10.2019 11.39
 * @modification_date 4.10.2019 11.39
 * @copyright zensar
 * @desc it is a product services interfaces  using business  layer
 *
 */

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {
	List<Product> findAllProducts();
	Product findProductById(int productId);
	void insertProduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	List<Product> findProductsByPrice(float max, float min);
	List<Product> findProductsByName(String name);
	List<Product> findProductsByBrand(String brand);
	Long GetProductCount();
}
