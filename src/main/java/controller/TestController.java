package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.impl.MemberServiceImpl;
import vo.Member;

public class TestController {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		MemberServiceImpl msi = (MemberServiceImpl) context.getBean("ms");
		
		msi.add(new Member("aa","ff","adwada"));
		
		
	}
}
