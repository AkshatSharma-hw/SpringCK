package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Ak
 * @version 1.0
 * @date_of_creation 10.10.2019 16.13
 * @modification_date 10.10.2019 16.13
 * @copyright zensar
 * @desc it is a product dao implementation class using persistence layer
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return (List<Product>) hibernateTemplate.find("from Product");
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
		System.out.println("inserted");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
		System.out.println("updated");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
		System.out.println("deleted");
	}
	
	
 
}
