package kr.hs.mirimmarket.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.hs.mirimmarket.dto.ProductDTO;


public interface ProductMapper {
	public List<ProductDTO> getProductList();
}
