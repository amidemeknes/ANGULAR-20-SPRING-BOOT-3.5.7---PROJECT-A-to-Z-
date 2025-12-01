package org.solutions.spring.services;

import org.solutions.spring.entities.Category;
import org.solutions.spring.entities.Product;
import org.solutions.spring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
    @Override
    public void deleteAllProducts() {
        productRepository.deleteAll();
    }
    @Override
    public List<Product> findAllProductsByPrice(double productPrice) {
        return productRepository.findAllProductsByPrice(1000.00);
    }
    @Override
    public List<Product> findAllProductsByNamePrice(String productName, double productPrice) {
        return productRepository.findAllProductsByNamePrice("TV", 3000.00);
    }
    @Override
    public List<Product> findAllProductsByCategory(Category category) {
        return productRepository.findAllProductsByCategory(category);
    }

    @Override
    public List<Product> findByCategoryCategoryId(Long id) {
        return List.of();
    }

    @Override
    public List<Product> findAllProductsByCategory(Long id) {
        return productRepository.findByCategoryCategoryId(id);
    }
    @Override
    public List<Product> findAllProductsByNameSort() {
        return productRepository.findAllProductsByNameSort();
    }
    @Override
    public Page<Product> getAllProductsByPage(int page, int size) {
        return productRepository.findAll(PageRequest.of(page, size));
    }
}
