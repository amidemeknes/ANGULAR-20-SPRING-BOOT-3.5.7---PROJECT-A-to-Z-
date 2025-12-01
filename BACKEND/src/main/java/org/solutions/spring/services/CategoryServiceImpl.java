package org.solutions.spring.services;

import org.solutions.spring.entities.Category;
import org.solutions.spring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
    @Override
    public void deleteAllCategories() {
        categoryRepository.deleteAll();
    }
}
