package kr.hs.mirimmarket.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.mirimmarket.dto.ProductDTO;

@Service
public class ProductService {
	@Autowired
	private ProductDAO productdao;
	
	public List<ProductDTO> getProductList(){
		return productdao.getProductList();
	}
}
