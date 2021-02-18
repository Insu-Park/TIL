package server.service;

import common.util.CafeException;
import server.dao.MemberDAO;

public class MemberService {
	
	MemberDAO mdao;
	
	public MemberService() throws CafeException {
		mdao=new MemberDAO();
	}

}
