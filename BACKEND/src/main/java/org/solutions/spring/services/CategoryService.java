package org.solutions.spring.services;

import org.solutions.spring.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    Category getCategoryById(Long id);
    List<Category> getAllCategories();
    void deleteCategoryById(Long id);
    void deleteAllCategories();
}
