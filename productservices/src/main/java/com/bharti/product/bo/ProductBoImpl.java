package com.bharti.product.bo;

public class ProductBoImpl implements ProductBO {
	
	private ProdutcDAO dao= nee ProductDAOImpl();
	@Override 
	public void create(Product product) {
		dao.create(product);
		
	}
	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
