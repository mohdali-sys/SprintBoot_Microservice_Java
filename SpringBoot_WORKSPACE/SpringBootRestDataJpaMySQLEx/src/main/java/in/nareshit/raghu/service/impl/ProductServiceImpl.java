package in.nareshit.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.exception.ProductNotFoundException;
import in.nareshit.raghu.repo.ProductRepository;
import in.nareshit.raghu.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;
	
	public Integer saveProduct(Product p) {
		return repo.save(p).getProdId();
	}

	
	public void updateProduct(Product p) {
		if(p.getProdId()!=null && repo.existsById(p.getProdId()))
			repo.save(p);
		else
			throw new ProductNotFoundException("Product Not Exist");
	}

	
	public void deleteProduct(Integer id) {
		//repo.deleteById(id);
		repo.delete(getOneProduct(id));
	}

	
	public Product getOneProduct(Integer id) {
		//return repo.findById(id).get();
		Optional<Product> opt = repo.findById(id);
		if(opt.isEmpty())
			throw new ProductNotFoundException("Product Not Exist");
		else
			 return opt.get();
	}

	
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Transactional
	public Integer updateProductCodeById(String code, Integer id) {
		//return repo.updateProductCodeById(code, id);
		if(repo.existsById(id))
			return repo.updateProductCodeById(code, id);
		else
			throw new ProductNotFoundException("Product Not Exist");
	}
}
