package server.dao;

import common.util.CafeException;

public class MemberDAO {
	
	public MemberDAO() throws CafeException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new CafeException("오라클 드라이버 등록 실패");
		}
	}
	
	

}
