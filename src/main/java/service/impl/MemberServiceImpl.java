package service.impl;

import dao.impl.MemberDaoImpl;
import service.MemberService;
import vo.Member;

public class MemberServiceImpl implements MemberService {
	
	public static void main(String[] args) {
		
	}
	
	private static MemberDaoImpl mdi = new MemberDaoImpl();

	@Override
	public void add(Member m) {
		mdi.add(m);
	}

	@Override
	public String showAll() {
		StringBuilder build = new StringBuilder();
		for (Member m: mdi.readAll()) {
			build.append("<tr><td>"+m.getId()+
					"<td>"+m.getName()+
					"<td>"+m.getUsername()+
					"<td>"+m.getPassword());
		}		
		return build.toString();
	}

}
