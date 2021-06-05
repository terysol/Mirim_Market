package kr.hs.mirimmarket.impl;

import org.springframework.beans.factory.annotation.Autowired;

import kr.hs.mirimmarket.dao.MemberDAO;
import kr.hs.mirimmarket.dao.MemberMapper;
import kr.hs.mirimmarket.dto.MemberDTO;

public class MemberServiceImpl implements MemberMapper{
	
	@Autowired
	private MemberDAO mdao;
	
	@Override
	public MemberDTO readMember(String id) {
		// TODO Auto-generated method stub
		MemberDTO dto=null;
		try {
			dto=mdao.readMember(id);
			System.out.println("S:로그인 정보 리턴");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	@Override
	public MemberDTO loginMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		MemberDTO returnDAO=null;
		try {
			returnDAO = mdao.readMember(dto.getId());
			System.out.println("S: 로그인아이디 : " + dto.getId() + " 이름 : "  + dto.getName());
		}catch(Exception e) {
			e.printStackTrace();
			returnDAO=null;
		}
		return returnDAO;
	}

	@Override
	public void insertMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		mdao.insertMember(dto);
	}

	

}
