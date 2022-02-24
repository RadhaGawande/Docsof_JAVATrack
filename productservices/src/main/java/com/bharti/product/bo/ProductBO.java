package com.bharti.product.bo;

public interface ProductBO {
  void create(Product product);
  Product findProduct(int id);
}
