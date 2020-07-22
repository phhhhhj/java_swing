package mainprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import login.Login;

public class UiSizeDaoTest {

	public static ArrayList mysizelist;
	
	public void sizechage() {
		
		String url = "jdbc:mysql://localhost:3708/project01?characterEncoding=utf8&serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//외부의 자료를 이용할 때 에러가 많이 발생할 수 있기 때문에 에러가 많이 뜸
			//2)db연결
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select * from personal_size where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			
			
			ps.setString(1, Login.loginID); // null<-- 버튼 가져올 때 값 가져올거니가 기다려;
			
			
			ResultSet rs = ps.executeQuery();
			//ResultSet db의 테이블을 소환하는 부품이다.
		
			if(rs.next()) { //rs.next() => 값이 있는지 없는지 확인해주는 것 있으면 true 업승면 false
				// 검색결과가 있는지 체크해주는 메서드
				
				mysizelist = new ArrayList();
				//String id = rs.getString(1); 
				for (int i = 1; i < 10; i++) {
					mysizelist.add(rs.getString(i));
				}
		
		} 
		
		}
		catch (Exception e) {
		}
		
		
	}
}
