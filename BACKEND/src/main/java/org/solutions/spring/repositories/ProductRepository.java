package org.solutions.spring.repositories;

import org.solutions.spring.entities.Category;
import org.solutions.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select product from Product product where product.productPrice >?1")
    List<Product> findAllProductsByPrice(double price);

    @Query("select product from Product product where product.productName like %:productName and product.productPrice >:productPrice")
    List<Product> findAllProductsByNamePrice(@Param("nameProduct") String productName , @Param("productPrice") double productPrice);

    @Query("select product from Product product where product.category =?1")
    List<Product> findAllProductsByCategory(Category category);

    @Query("select product from Product product order by product.productName")
    List<Product> findAllProductsByNameSort();

    List<Product> findByCategoryCategoryId(Long id);
}
