package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import service.impl.MemberServiceImpl;
import vo.Member;

@Controller
public class MemberController {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	public static MemberServiceImpl msi = (MemberServiceImpl) context.getBean("ms");
	
	
	@PostMapping("addMember")
	public String addMember(String name, String username, String password) {
		msi.add(new Member(name,username,password));
		//return "redirect:/addSuccess";
		return "redirect:/addSuccess";
	}
	
	@GetMapping("addSuccess")
	public String addSuccess() {
		return "addSuccess";
	}
	
	@GetMapping("query")
	public String readMember() {
		return "query";
	}

}
