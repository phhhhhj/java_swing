package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MemberDAO {
	String jdbc_url = "jdbc:mysql://localhost:3708/project01?characterEncoding=utf8&serverTimezone=UTC";
	// '3708/'와 '?character' 사이에 사용하는 데이터베이스의 이름을 넣어주어야 한다.
	String user = "root"; // 계정확인
	String password = "1234"; // 비밀번호 확인

	public void insert(MemberDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql1 = "insert into members values (?,?,?,?,?,?,?)"; // 3번
			PreparedStatement ps1 = con.prepareStatement(sql1); // 4번
			ps1.setString(1, dto.getId());
			ps1.setString(2, dto.getPw());
			ps1.setString(3, dto.getName());
			ps1.setString(4, dto.getBirth());
			ps1.setString(5, dto.getGender());
			ps1.setString(6, dto.getEmail());
			ps1.setString(7, dto.getTel());
			ps1.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public MemberDTO select(MemberDTO dto) {
		MemberDTO dto2 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "select * from members where identification = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto2 = new MemberDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String birth = rs.getString(4);
				String gender = rs.getString(5);
				String email = rs.getString(6);
				String tel = rs.getString(7);
				dto2.setId(id);
				dto2.setPw(pw);
				dto2.setName(name);
				dto2.setBirth(birth);
				dto2.setGender(gender);
				dto2.setEmail(email);
				dto2.setTel(tel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto2;
	}

	public void update(MemberDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "update members set password = ?, email = ?, tel = ? where identification = ?"; // 3번
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getTel());
			ps.setString(4, dto.getId());
			ps.executeUpdate(); // 4번 전송

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(MemberDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "delete from members where identification = ?"; // 3번
			PreparedStatement ps = con.prepareStatement(sql); // 4번
			ps.setString(1, dto.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
