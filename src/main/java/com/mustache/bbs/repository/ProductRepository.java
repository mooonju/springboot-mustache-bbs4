package com.mustache.bbs.repository;

import com.mustache.bbs.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
