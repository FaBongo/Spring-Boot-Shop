package com.store.MyShop;

import com.store.MyShop.Models.Category;
import com.store.MyShop.Models.Product;
import com.store.MyShop.Repositories.CategoryRepository;
import com.store.MyShop.Repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyShopApplicationTests {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	MyShopApplicationTests(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}


	@Test
	void contextLoads() {
	}

}
