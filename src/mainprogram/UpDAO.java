package mainprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class UpDAO {

	public static ArrayList list;
	
	public void  upmain() {
		
												  //testcloth <==db이름
		String url = "jdbc:mysql://localhost:3708/project01?characterEncoding=utf8&serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		
		list = new ArrayList();
		
		
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");//외부의 자료를 이용할 때 에러가 많이 발생할 수 있기 때문에 에러가 많이 뜸
			//2)db연결
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select * from top where category = ? ";
			
			
			PreparedStatement ps = con.prepareStatement(sql);
			
					
			//String nameclo = DTOstatic.cate;
			
			
			
			ps.setString(1, Main.clicktype);  // null<-- 버튼 가져올 때 값 가져올거니가 기다려;
			
		
			ResultSet rs = ps.executeQuery();
			//ResultSet db의 테이블을 소환하는 부품이다.
			
			while (rs.next()) { //rs.next() => 값이 있는지 없는지 확인해주는 것 있으면 true 업승면 false
				// 검색결과가 있는지 체크해주는 메서드
				UpDTO updto2 = new UpDTO();
				
				int no = rs.getInt(1); 
				String category = rs.getString(2);
				String model = rs.getString(3);
				String brand = rs.getString(4);
				String size = rs.getString(5);
				String uplength = rs.getString(6);
				String width = rs.getString(7);
				String chest = rs.getString(8);
				String armlength = rs.getString(9);
				String armcircle = rs.getString(10);
				
				
				
				
				updto2.setNo(no); //1
				updto2.setCategory(category);//2
				updto2.setModel(model);//3
				updto2.setBrand(brand);//4
				updto2.setSize(size);//5
				updto2.setLength(uplength);//6
				updto2.setWidth(width);//7
				updto2.setChest(chest);//8
				updto2.setArmlength(armlength);//9
				updto2.setArmcircle(armcircle);//10
				
				
				
				
				
				
				String mamam = no+"#"+category+"#"+model+"#"+brand+"#"+size+"#"
				+uplength+"#"+width+"#"+chest+"#"+armlength+"#"+armcircle;
				
				list.add(mamam);
				
				
				
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		//return list;
		

	}

}
