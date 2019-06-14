package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findByProdCode(String prodCode);
	List<Product> findByProdCodeIs(String prodCode);
    List<Product> findByProdCodeEquals(String prodCode);
    
	List<Product> findByProdCostLessThan(double prodCost);
	List<Product> findByProdCostLessThanEqual(double prodCost);
	
	List<Product> findByProdCodeOrProdCost(String prodCode,double prodCost);
	
	List<Product> findByProdCodeIsNotNull();
	
	List<Product> findByProdCostBetween(double prodCost1,double prodCost);
	
	List<Product> findByProdCodeIn(List<String> prodCode);
	
	List<Product> findByProdCostOrderByProdCode(double prodCost);
	
	List<Product> findByProdCodeLike(String prodCode);
	List<Product> findByProdCodeContaining(String prodCode);
	
	
	
	
	

	

}
