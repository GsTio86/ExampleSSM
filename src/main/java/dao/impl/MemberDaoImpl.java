package dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.DbConnection;
import dao.MemberDao;
import vo.Member;

public class MemberDaoImpl implements MemberDao {
	
	public static void main(String[] args) {
		MemberDaoImpl mdi = new MemberDaoImpl();
		
		//Add 
		//mdi.add(new Member("1232131","312321","453453"));
		
		//ReadALl
		/*
		for (Member m : mdi.readAll()) {
			System.out.println(m.toString());
		}
		*/	
		
	}
	
	private static SqlSession session = DbConnection.getDb();

	@Override
	public void add(Member m) {
		session.insert("addMember", m);
		session.commit();
	}

	@Override
	public List<Member> readAll() {
		return session.selectList("selectAll", Member.class);		
	}

}
