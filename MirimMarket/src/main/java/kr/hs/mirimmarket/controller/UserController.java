package kr.hs.mirimmarket.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.hs.mirimmarket.dao.ProductMapper;
import kr.hs.mirimmarket.dto.Product;


@RestController
@MapperScan(basePackages="kr.hs.mirimmarket.dao")//탐색할 패키시 설정
public class UserController {
	@Autowired
	private ProductMapper productDAO;//UserDAO bean을 자동으로 주입
	
//	@RequestMapping("/")
//	public List<Product> users(@RequestParam(value="country", defaultValue = "")String country) throws Exception { //query String으로 county를 받도록 설정
//		final UserDTO param = new UserDTO(0, null, country);//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
//		final List<Product> userList = productDAO.getProductList();// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
//		return userList;
//	}
	
}