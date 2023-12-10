package com.store.MyShop.Services;

import com.store.MyShop.Models.Product;
import com.store.MyShop.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Long id, Product newProduct) {
        Product existingProduct = productRepository.findById(id).orElse(null);

        if (existingProduct != null) {
            existingProduct.setNom(newProduct.getNom());
            // Ajoutez d'autres propriétés à mettre à jour si nécessaire
            return productRepository.save(existingProduct);
        }

        return null; // Gérer le cas où le produit n'existe pas
    }
}
