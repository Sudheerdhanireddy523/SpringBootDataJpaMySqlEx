package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Product> list=Arrays.asList(new Product(1, "A", 2.3),
				
				new Product(2, "B", 3.3),
				new Product(3, "C", 3.3),
				new Product(4, "D", 4.3),
				new Product(5, "E", 2.3),
				new Product(6, "F", 5.3),
				
				new Product(7, "G", 6.3),
				new Product(8, "H", 3.3),
				new Product(9, "I", 8.3),
				new Product(10, "J", 3.3)
				
				
				);
		repo.saveAll(list);
		
		// find all 
		
		repo.findAll();
		
		// delete row
		//repo.deleteById(23);
		
		// findall with Sort 
		
	//repo.findAll(Sort.by(Direction.DESC,"prodCode")).
		//repo.findAll(Sort.by("prodCode")).
		//	forEach(System.out::println);
		
		// findall with Pageable
		//PageRequest p=PageRequest.of(2, 3);
	//repo.findAll(p).forEach(System.out::println);
	
	//findall with Example Object
		
		/*Product p=new Product();
		p.setProdCost(3.3);
		
		Example<Product> ex=Example.of(p);
		repo.findAll(ex).forEach(System.out::println);
		
		//findall Example with Sort
		
		Product p=new Product();
		p.setProdCost(3.3);
		
		Example<Product> ex=Example.of(p);
		repo.findAll(ex,Sort.by(Direction.DESC,"prodCode")).forEach(System.out::println);
		
		
		//findall Example with pageable
		
				Product p=new Product();
				p.setProdCost(3.3);
				
				Example<Product> ex=Example.of(p);
				repo.findAll(ex,PageRequest.of(1, 2)).forEach(System.out::println); */
				
// using  findAllById 
		repo.findAllById(Arrays.asList(2,4,6,8)).
		forEach(System.out::println);
		
		
		
		
	}

}
