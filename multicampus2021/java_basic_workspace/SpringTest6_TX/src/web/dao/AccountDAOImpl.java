package web.dao;

import org.apache.ibatis.session.SqlSession;

public class AccountDAOImpl implements AccountDAO{
	
	SqlSession sqlSession;	
	

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void updateBalance1() {
		sqlSession.update("mapper.account.updateBalance1");
		
	}

	@Override
	public void updateBalance2() {
		sqlSession.update("mapper.account.updateBalance2");
		
	}

}
