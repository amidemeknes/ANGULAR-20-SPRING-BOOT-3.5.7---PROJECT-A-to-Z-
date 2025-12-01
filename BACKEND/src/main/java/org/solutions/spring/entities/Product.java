package org.solutions.spring.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    //@NotNull
    //@Size(min = 3, max = 20)
    private String productName;
    //@Min(5)
    //@Max(10000)
    private Double productPrice;
    //@Temporal(TemporalType.DATE)
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    //@PastOrPresent
    private Date creationDate;
    @ManyToOne
    private Category category;
}
