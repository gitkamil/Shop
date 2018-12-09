package com.interview.shop.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.interview.shop.models.Product;
import com.interview.shop.repositories.ShopRepository;

@RestController
@RequestMapping("/api/v1/shop")
public class ShopController {

    @Autowired
    private ShopRepository shopRepository;

    @GetMapping
    public List<Product> list() {
	return shopRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Product product) {
	shopRepository.save(product);

    }

    @GetMapping("/{id}")
    public Product get(@PathVariable("id") long id) {
	return shopRepository.getOne(id);
    }
}
