package kr.hs.mirimmarket.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import kr.hs.mirimmarket.dto.Product;

public interface ProductMapper {
	public List<Product> getProductList();
}
