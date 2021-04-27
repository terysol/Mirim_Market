package kr.hs.mirimmarket.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.mirimmarket.dao.ProductMapper;
import kr.hs.mirimmarket.dao.ProductService;
import kr.hs.mirimmarket.dto.Product;


@RestController
@MapperScan(basePackages ="kr.hs.mirimmarket.dao")
public class JSPController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/main")
	public ModelAndView main() {
		ModelAndView model =new ModelAndView();
		List<Product> productlist=service.getProductList();
		model.addObject("productlist",productlist);
		model.setViewName("main");
		return model;
   }
}
