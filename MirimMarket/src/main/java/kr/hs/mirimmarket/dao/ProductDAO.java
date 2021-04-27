package kr.hs.mirimmarket.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.mirimmarket.dto.Product;

@Repository
public class ProductDAO {

	@Autowired
    private SqlSession sqlSession;

    @Autowired
    private ProductMapper productMapper;
    
    public List<Product> getProductList(){
    	productMapper = sqlSession.getMapper(ProductMapper.class);
    	List<Product> productDAO = productMapper.getProductList();
    	return productDAO;
    }
}
