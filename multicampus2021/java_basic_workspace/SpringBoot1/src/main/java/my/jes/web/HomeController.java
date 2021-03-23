package my.jes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping("/home.jes")
	public String home() {
		System.out.println("Hello 인수~!");
		return "Hello 인수!!";
	}
}
