package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.entity.Product;

public interface IProductService {

	Integer saveProduct(Product p);
	void updateProduct(Product p);
	void deleteProduct(Integer id);
	Product getOneProduct(Integer id);
	List<Product> getAllProducts();
	
	Integer updateProductCodeById(String code,Integer id);
}
