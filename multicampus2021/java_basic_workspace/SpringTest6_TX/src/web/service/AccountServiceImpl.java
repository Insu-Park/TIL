package web.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import web.dao.AccountDAO;

@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService{
	
	AccountDAO accountDAO;
	
	

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}



	@Override
	public void sendMoney() {
		accountDAO.updateBalance1(); // -
		accountDAO.updateBalance2(); // +
	}
	
}
