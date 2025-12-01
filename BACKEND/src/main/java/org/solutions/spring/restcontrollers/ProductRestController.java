package org.solutions.spring.restcontrollers;

import org.solutions.spring.entities.Product;
import org.solutions.spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductRestController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }
    @GetMapping("/products/category/{id}")
    public List<Product> getAllProductsByCategory(@PathVariable("id") Long id){
        return productService.findByCategoryCategoryId(id);
    }
    @PostMapping("/products/save")
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PutMapping("/products/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("/products/delete/{id}")
    public void deleteProductById(@PathVariable("id") Long id){
        productService.deleteProductById(id);
    }
}
