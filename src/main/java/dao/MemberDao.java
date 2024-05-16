package dao;

import java.util.List;
import vo.Member;

public interface MemberDao {

	void add(Member m);
	
	List<Member> readAll();
}
