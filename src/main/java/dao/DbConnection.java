package dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConnection {
	private static final String MTBATIS_RESOURCE = "mybatis-config.xml";

	public static void main(String[] args) {
		System.out.println(getDb());
	}
	
	public static SqlSession getDb() {
		try {
			InputStream inputStream = Resources.getResourceAsStream(MTBATIS_RESOURCE);
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
			return sf.openSession();
		} catch (Exception e) {
			e.printStackTrace();			
		}
		return null;		
	}

}
