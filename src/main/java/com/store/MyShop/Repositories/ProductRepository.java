package com.store.MyShop.Repositories;

import com.store.MyShop.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
