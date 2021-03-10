package web.dao;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import web.vo.MemberVO;

public class MemberDAO {
	
	SqlSessionFactory sqlMapper;
	

	public MemberDAO() {
		try {
			Reader reader=Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
			sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}

	public List<MemberVO> selectAllMemberList() {
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> list=session.selectList("mapper.member.selectAllMemberList");
		return list;
	}

	public String login(MemberVO m) {
		
		SqlSession session=sqlMapper.openSession();
		String name=(String) session.selectOne("mapper.member.login", m);
		return name;
	}

	public List<MemberVO> selectMemberById(MemberVO m) {
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> list=session.selectList("mapper.member.selectMemberById", m.getId());
		return list;
	}
	
	public List<MemberVO> selectMemberByPw(MemberVO m) {
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> list=session.selectList("mapper.member.selectMemberByPw", m.getPw());
		return list;
	}

	public void memberInsert(MemberVO m) {
		SqlSession session=sqlMapper.openSession();
		int i=session.insert("mapper.member.memberInsert", m);
		
		session.commit(); 
	}
	
}