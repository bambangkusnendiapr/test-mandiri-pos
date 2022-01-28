package com.test.enigma.test.service;

import com.test.enigma.test.entity.Product;

import java.util.List;

public interface ProductService {
  Product create(Product product);
  List<Product> list();
}
