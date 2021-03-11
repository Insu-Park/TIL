package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import web.service.AccountService;

public class AccountControllerImpl extends MultiActionController implements AccountController{
	AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@Override
	public ModelAndView sendMoney(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView("result");
		//WEB-INF/views/account/result.jsp
		accountService.sendMoney();
		return mav;
	}
	
}
