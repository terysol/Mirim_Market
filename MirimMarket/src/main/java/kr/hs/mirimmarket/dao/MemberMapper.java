package kr.hs.mirimmarket.dao;

import kr.hs.mirimmarket.dto.MemberDTO;

public interface MemberMapper {
	
	// 구글 로그인
	public MemberDTO loginMember(MemberDTO dto);
	
	// 구글 회원가입 (db에 insert)
	public void insertMember(MemberDTO dto);
	
	// 회원 정보 가져오기
	public MemberDTO readMember(String id);
	
	
}
