package org.solutions.spring.restcontrollers;

import org.solutions.spring.entities.Category;
import org.solutions.spring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CategoryRestController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable("id") Long id){
        return categoryService.getCategoryById(id);
    }
    @PostMapping("/categories/save")
    public Category createCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
    @PutMapping("/categories/update")
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }
    @DeleteMapping("/categories/delete/{id}")
    public void deleteCategoryById(@PathVariable("id") Long id){
        categoryService.deleteCategoryById(id);
    }
}
