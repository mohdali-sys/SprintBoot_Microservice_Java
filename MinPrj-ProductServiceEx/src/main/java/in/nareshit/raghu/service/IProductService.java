package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.entity.Product;

public interface IProductService {

	public Long createProduct(Product p);
	public List<Product> fetchAllProducts();
	public Product  fetchProductById(long id) ;
}
