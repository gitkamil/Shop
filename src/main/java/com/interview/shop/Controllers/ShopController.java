package com.interview.shop.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.interview.shop.models.Product;

@RestController
@RequestMapping("/api/v1/shop")
public class ShopController {
    @GetMapping
    public List<Product> list() {
	List<Product> products = new ArrayList<>();
	return products;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Product product) {

    }

    @GetMapping("/{id}")
    public Product get(@PathVariable("id") long id) {
	return new Product();
    }
}
