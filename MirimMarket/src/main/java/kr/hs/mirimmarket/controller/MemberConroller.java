package kr.hs.mirimmarket.controller;


import javax.servlet.http.HttpSession;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.hs.mirimmarket.dao.MemberMapper;
import kr.hs.mirimmarket.dao.MemberService;
import kr.hs.mirimmarket.dto.MemberDTO;


@RestController
@MapperScan(basePackages ="kr.hs.mirimmarket.dao")
public class MemberConroller {
	
	@Autowired
	private MemberService service;
	
	private static final Logger l= LoggerFactory.getLogger(MemberConroller.class);
	
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public String Login(MemberDTO dto, HttpSession session, RedirectAttributes rttr, MemberDTO mdto) throws Exception{
//		MemberDTO returnDTO=service.loginMember(dto);
//		String mvo_ajaxid = mdto.getId();
//		System.out.println("C: 구글 아이디 db에서 가져온 dto : " + dto);
//		System.out.println("C: 구글 아이디 ajax에서 가져온 id : " + mvo_ajaxid);
//		
//		if(returnDTO == null) {   // 아이디가 db에 존재하지 않는 경우
//			service.insertMember(dto);
//			
//			returnDTO = service.loginMember(dto);
//			session.setAttribute("id", returnDTO.getId());
//			rttr.addFlashAttribute("dto",returnDTO);
//		}
//		
//		if(mvo_ajaxid.equals(returnDTO.getId())) {   // 아이디가 db에 존재하는 경우
//			service.loginMember(dto);
//			session.setAttribute("id", returnDTO.getId());
//			rttr.addFlashAttribute("dto",returnDTO);
//		}else {    // 아이디가 db에 존재하지 않는 경우
//			service.insertMember(dto);
//			session.setAttribute("id", returnDTO.getId());
//			rttr.addFlashAttribute("dto",returnDTO);
//		}
		return "redirect:/mirimmarket/main";
		
	}
	
}