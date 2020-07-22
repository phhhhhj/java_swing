package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class QnADAO {
	String jdbc_url = "jdbc:mysql://localhost:3708/project01?characterEncoding=utf8&serverTimezone=UTC";
	// '3708/'와 '?character' 사이에 사용하는 데이터베이스의 이름을 넣어주어야 한다.
	String user = "root"; // 계정확인
	String password = "1234"; // 비밀번호 확인

	public void insert(QnADTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "insert into qna values (?,?,?,?,?)"; // 3번
			PreparedStatement ps = con.prepareStatement(sql); // 4번
			ps.setString(1, null);
			ps.setString(2, dto.getType());
			ps.setString(3, dto.getTitle());
			ps.setString(4, dto.getWritter());
			ps.setString(5, dto.getDay());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<QnADTO> select() {
		ArrayList<QnADTO> list = new ArrayList<QnADTO>();
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "select * from qna";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				QnADTO dto2 = new QnADTO();
				int no = rs.getInt(1);
				String type = rs.getString(2);
				String title = rs.getString(3);
				String writter = rs.getString(4);
				String day = rs.getString(5);
				dto2.setNo(no);
				dto2.setType(type);
				dto2.setTitle(title);
				dto2.setWritter(writter);
				dto2.setDay(day);
				list.add(dto2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(QnADTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "update qna set type = ?, writter = ?, day = ? where title = ?"; // 3번
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getType());
			ps.setString(2, dto.getWritter());
			ps.setString(3, dto.getDay());
			ps.setString(4, dto.getTitle());
			
			ps.executeUpdate(); // 4번 전송

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(QnADTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "delete from qna where writter = ?"; // 3번
			PreparedStatement ps = con.prepareStatement(sql); // 4번
			ps.setString(1, dto.getWritter());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
