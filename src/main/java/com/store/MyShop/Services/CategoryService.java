package com.store.MyShop.Services;

import com.store.MyShop.Models.Category;
import com.store.MyShop.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    public Category updateCategory(Long id, Category newCategory) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);

        if (existingCategory != null) {
            existingCategory.setNom(newCategory.getNom());

            // Ajoutez d'autres propriétés à mettre à jour si nécessaire
            return categoryRepository.save(existingCategory);
        }

        return null; // Gérer le cas où la catégorie n'existe pas
    }
}
