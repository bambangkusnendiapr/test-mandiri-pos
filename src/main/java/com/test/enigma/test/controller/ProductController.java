package com.test.enigma.test.controller;

import com.test.enigma.test.entity.Product;
import com.test.enigma.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/product"})
public class ProductController {

  @Autowired
  private ProductService productService;

  @PostMapping
  public Product create(@RequestBody Product product) {
    return productService.create(product);
  }

  @GetMapping
  public List<Product> list() {
    return productService.list();
  }
}
