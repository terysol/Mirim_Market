package kr.hs.mirimmarket.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import kr.hs.mirimmarket.dto.ProductDTO;

public interface ProductMapper {
	
	// 상품 리스트 보여주기
	public List<ProductDTO> getProductList();
	
	public  ProductDTO getProduct(@Param("seq") int seq);
	
	public void updateClick(int seq);
	
	public void insertProduct(ProductDTO dto);
}
