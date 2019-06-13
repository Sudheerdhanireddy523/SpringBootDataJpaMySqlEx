package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// save the data
		
		//repo.save(new Product(6,"sudheer", 34.89));
		//repo.save(new Product(23,"kumar", 89.78));
		
		// update call
		
		//repo.save(new Product(6,"salma", 23.89));
		
		//Bulk data insert
		
		/*List<Product> prds=Arrays.asList(new Product(3, "samantha", 23.89),
				new Product(4, "kajole", 33.89),
				new Product(8, "devinarayanan", 73.89),
				new Product(9, "srujana", 93.89)
				);
		repo.saveAll(prds);
		
		// fetch one row
		
		Optional<Product> prd=repo.findById(87);
		if(prd.isPresent()) {
		Product p=prd.get();
		System.out.println(p.getProdCode());
	}else {
		System.out.println("row not found");
	}
		
		// fetch all rows
		
		List<Product> list=repo.findAll();
		list.forEach(System.out::println);
		
		// delete operation
	//	repo.deleteById(6);
		
		// delete all rows
	//	repo.deleteAll();
		
	//	repo.deleteAllInBatch();
		
	}*/
	}
}
