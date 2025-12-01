package org.solutions.spring.services;

import org.solutions.spring.entities.Category;
import org.solutions.spring.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService
{
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void deleteProductById(Long id);
    void deleteAllProducts();

    List<Product> findAllProductsByPrice(double price);
    List<Product> findAllProductsByNamePrice(@Param("productName") String productName , @Param("productPrice") double productPrice);
    List<Product> findAllProductsByCategory(Category category);

    List<Product> findByCategoryCategoryId(Long id);

    List<Product> findAllProductsByCategory(Long id);

    List<Product> findAllProductsByNameSort();

    Page<Product> getAllProductsByPage(int page, int size);
}
