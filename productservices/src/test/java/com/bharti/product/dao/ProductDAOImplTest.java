package com.bharti.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bharti.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product =new Product();
		product.setId(1);
		product.setName("iphone");
		product.setDescription("Its Nice!!");
		product.setPrice(500);
		dao.create(new product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("IPhone",result.getName());
	}

}
