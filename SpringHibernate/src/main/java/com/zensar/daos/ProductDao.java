package com.zensar.daos;

import java.util.List;



import com.zensar.entities.Product;

/**
 * @author Ak
 * @version 1.0
 * @date_of_creation 4.10.2019 10.06
 * @modification_date 4.10.2019 10.06
 * @copyright zensar
 * @desc it is a product dao interface using persistence layer
 *
 */
public interface ProductDao {
	

	
	List<Product> getAll();

	Product getById(int productId);

	void insert(Product product);

	void update(Product product);

	void delete(Product product);
}
