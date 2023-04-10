package com.ru.tolmachev.productmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Short amount;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
