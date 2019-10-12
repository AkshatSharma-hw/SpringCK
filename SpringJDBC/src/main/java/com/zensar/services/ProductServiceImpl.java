package com.zensar.services;
import java.util.ArrayList;
/**
 * @author Ak
 * @version 1.0
 * @date_of_creation 4.10.2019 11.48
 * @modification_date 4.10.2019 10.48
 * @copyright zensar
 * @desc it is a product service implementation class using persistence layer
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	public ProductServiceImpl() {
		
	}
	@Override
	public List<Product> findAllProducts() {
		
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getById(productId);
	}

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);
	}

	@Override
	public void updateProduct(Product product) {
		productDao.update(product);

	}

	@Override
	public void removeProduct(Product product) {
		productDao.delete(product);

	}

	@Override
	public List<Product> findProductsByPrice(float max, float min) {
		List<Product> all=productDao.getAll();
		List<Product> priceSorted = new ArrayList<>();
		for (Product product : all) {
			float price = product.getPrice();
			if (price>=min&&price<=max) {
				priceSorted.add(product);
			}
		}
		return priceSorted;
	}

	@Override
	public List<Product> findProductsByName(String name) {
		List<Product> allProducts=productDao.getAll();
		List<Product> productByName = new ArrayList<>();
		for (Product product : allProducts) {
			if ((product.getName()).equals(name)) {
				productByName.add(product);
			}
		}
		
		return productByName;
	}

	@Override
	public List<Product> findProductsByBrand(String brand) {
		List<Product> allProducts=productDao.getAll();
		List<Product> productByBrand = new ArrayList<>();
		for (Product product : allProducts) {
			if ((product.getBrand()).equals(brand)) {
				productByBrand.add(product);
			}
		}
		return productByBrand;
	}

	@Override
	public Long GetProductCount() {
		List<Product> allProducts=productDao.getAll();
		
		return (long) (allProducts.size());
	}

}
