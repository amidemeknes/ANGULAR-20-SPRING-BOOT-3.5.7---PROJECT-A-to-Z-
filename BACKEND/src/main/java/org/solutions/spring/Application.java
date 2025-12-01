package org.solutions.spring;

import jakarta.annotation.PostConstruct;
import org.solutions.spring.entities.Category;
import org.solutions.spring.entities.Product;

import org.solutions.spring.services.CategoryService;
import org.solutions.spring.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class Application {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(CategoryRepository categoryRepository){
//        return args -> {
//            Category category1 = Category.builder()
//                    .categoryName("BAKERY")
//                    .build();
//            categoryRepository.save(category1);
//            Category category2 = Category.builder()
//                    .categoryName("DAIRY")
//                    .build();
//            categoryRepository.save(category2);
//            Category category3 = Category.builder()
//                    .categoryName("FRUIT")
//                    .build();
//            categoryRepository.save(category3);
//            Category category4  = Category.builder()
//                    .categoryName("SEAFOOD")
//                    .build();
//            categoryRepository.save(category4);
//            Category category5  = Category.builder()
//                    .categoryName("VEGETABLE")
//                    .build();
//            categoryRepository.save(category5);
//        };


    //@PostConstruct
    void initial_categories(){
        categoryService.saveCategory(new Category(null, "BAKERY"));
        categoryService.saveCategory(new Category(null, "DAIRY"));
        categoryService.saveCategory(new Category(null, "FRUIT"));
        categoryService.saveCategory(new Category(null, "SEAFOOD"));
        categoryService.saveCategory(new Category(null, "VEGETABLE"));
    }
    //@PostConstruct
    void init_data() {
        // 1. Create categories
        Category bakery = categoryService.saveCategory(new Category(null, "BAKERY"));
        Category dairy = categoryService.saveCategory(new Category(null, "DAIRY"));
        Category fruit = categoryService.saveCategory(new Category(null, "FRUIT"));
        Category seafood = categoryService.saveCategory(new Category(null, "SEAFOOD"));
        Category vegetable = categoryService.saveCategory(new Category(null, "VEGETABLE"));

        // 2. Create products with existing categories
        productService.saveProduct(new Product(null, "CHEESE", 35.00, new Date(), dairy));
        productService.saveProduct(new Product(null, "BREAD", 12.00, new Date(), bakery));
        productService.saveProduct(new Product(null, "CARROT", 8.00, new Date(), vegetable));
        productService.saveProduct(new Product(null, "BANANA", 10.00, new Date(), fruit));
        productService.saveProduct(new Product(null, "SARDINE", 22.00, new Date(), seafood));
        productService.saveProduct(new Product(null, "MILK", 14.00, new Date(), dairy));
    }
//    @PostConstruct
//    void initial_products(){
//        productService.saveProduct(new Product(null, "CHEESE", 35.00, new Date(), new Category(null, "DAIRY")));
//        productService.saveProduct(new Product(null, "BREAD", 35.00, new Date(),new Category(null, "BAKERY")));
//        productService.saveProduct(new Product(null, "CARROT", 35.00, new Date(),new Category(null, "VEGETABLE")));
//        productService.saveProduct(new Product(null, "BANANA", 35.00, new Date(),new Category(null, "FRUIT")));
//        productService.saveProduct(new Product(null, "SARDINE", 35.00, new Date(),new Category(null, "SEAFOOD")));
//        productService.saveProduct(new Product(null, "MILK", 35.00, new Date(),new Category(null, "DAIRY")));
//    }

}
