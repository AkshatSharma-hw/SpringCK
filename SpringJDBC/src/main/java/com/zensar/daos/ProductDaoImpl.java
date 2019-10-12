package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Product> getAll() {
		String sql = "Select * from product;";
		
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Product> allProducts = new ArrayList<Product>();
				while (rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));	
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					allProducts.add(product);
				}
				return allProducts;
			}
		});
	}

	@Override
	public Product getById(int productId) {
		String sql = "Select * from product where id = ? ;";
		
		return jdbcTemplate.query(sql, new Object[]{productId}, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				Product p = new Product();
				if (rs.next()) {
					p.setProductId(rs.getInt(1));	
					p.setName(rs.getString(2));
					p.setBrand(rs.getString(3));
					p.setPrice(rs.getFloat(4));
					return p;
				}
				else {
					return null;
				}
				
			}
		});
	}

	@Override
	public void insert(Product product) {
		String sql = "insert into product values (?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId() , product.getName(),product.getBrand(),product.getPrice());
		System.out.println("product inserted");
	}

	@Override
	public void update(Product product) {
		String sql = "update product set name = ? , brand = ? , price = ? where id = ? ;";
		jdbcTemplate.update(sql,  product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("product updated");
	}

	@Override
	public void delete(Product product) {
		String sql = "delete from product where id = ? ;";
		jdbcTemplate.update(sql, product.getProductId());
		System.out.println("product deleted");
	}
 
}
