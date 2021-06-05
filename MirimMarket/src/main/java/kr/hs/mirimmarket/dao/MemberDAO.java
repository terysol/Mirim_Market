package kr.hs.mirimmarket.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.hs.mirimmarket.dto.MemberDTO;

public class MemberDAO {
	@Autowired
    private SqlSession sqlSession;
	
	@Autowired
	private MemberMapper mapper;
	
	public MemberDTO loginMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void insertMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		
	}
	
	public MemberDTO readMember(String id) {
		return null;
	}

}
