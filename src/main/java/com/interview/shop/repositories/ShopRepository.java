package com.interview.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interview.shop.models.Product;

public interface ShopRepository extends JpaRepository<Product, Long> {

}
