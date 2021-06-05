package kr.hs.mirimmarket.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
=======
>>>>>>> branch 'develop' of https://github.com/terysol/Mirim_Market.git

import kr.hs.mirimmarket.dto.ProductDTO;
<<<<<<< HEAD
=======

>>>>>>> branch 'develop' of https://github.com/terysol/Mirim_Market.git

public interface ProductMapper {
<<<<<<< HEAD
	
	// 상품 리스트 보여주기
	public List<ProductDTO> getProductList();
	
	public  ProductDTO getProduct(@Param("seq") int seq);
	
	public void updateClick(int seq);
	
	public void insertProduct(ProductDTO dto);
=======
	public List<ProductDTO> getProductList();
>>>>>>> branch 'develop' of https://github.com/terysol/Mirim_Market.git
}
