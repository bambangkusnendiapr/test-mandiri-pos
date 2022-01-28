package com.test.enigma.test.service;

import com.test.enigma.test.entity.Product;
import com.test.enigma.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public Product create(Product product) {
    return productRepository.save(product);
  }

  @Override
  public List<Product> list() {
    return productRepository.findAll();
  }
}