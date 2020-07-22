package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SizeDAO {
	String jdbc_url = "jdbc:mysql://localhost:3708/project01?characterEncoding=utf8&serverTimezone=UTC";
	// '3708/'와 '?character' 사이에 사용하는 데이터베이스의 이름을 넣어주어야 한다.
	String user = "root"; // 계정확인
	String password = "1234"; // 비밀번호 확인

	public void insert(SizeDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "insert into personal_size values (?,?,?,?,?,?,?,?,?)"; // 3번
			PreparedStatement ps = con.prepareStatement(sql); // 4번
			ps.setString(1, dto.getId());
			ps.setDouble(2, dto.top_length);
			ps.setDouble(3, dto.shoulder_width);
			ps.setDouble(4, dto.chest);
			ps.setDouble(5, dto.arm_length);
			ps.setDouble(6, dto.arm_circle);
			ps.setDouble(7, dto.waist_circle);
			ps.setDouble(8, dto.leg_length);
			ps.setDouble(9, dto.thigh_circle);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public SizeDTO select(SizeDTO dto) {
		SizeDTO dto2 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "select * from personal_size where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto2 = new SizeDTO();
				String id = rs.getString(1);
				double top_length = rs.getDouble(2);
				double shoulder_width = rs.getDouble(3);
				double chest = rs.getDouble(4);
				double arm_length = rs.getDouble(5);
				double arm_circle = rs.getDouble(6);
				double waist_circle = rs.getDouble(7);
				double leg_length = rs.getDouble(8);
				double thigh_circle = rs.getDouble(9);
				dto2.setId(id);
				dto2.setTop_length(top_length);
				dto2.setShoulder_width(shoulder_width);
				dto2.setChest(chest);
				dto2.setArm_length(arm_length);
				dto2.setArm_circle(arm_circle);
				dto2.setWaist_circle(waist_circle);
				dto2.setThigh_circle(thigh_circle);
				dto2.setLeg_length(leg_length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto2;
	}

	public void update(SizeDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "update personal_size set top_length = ?, shoulder_width = ?, chest = ?, "
										  + "arm_length =  ?, arm_circle = ?,"
										  + "waist_circle = ?, leg_length = ?,"
										  + "thigh_circle = ? where id = ?"; // 3번
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, dto.getTop_length());
			ps.setDouble(2, dto.getShoulder_width());
			ps.setDouble(3, dto.getChest());
			ps.setDouble(4, dto.getArm_length());
			ps.setDouble(5, dto.getArm_circle());
			ps.setDouble(6, dto.getWaist_circle());
			ps.setDouble(7, dto.getLeg_length());
			ps.setDouble(8, dto.getThigh_circle());
			ps.setString(9,dto.getId());
			ps.executeUpdate(); // 4번 전송

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(SizeDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1번
			Connection con = DriverManager.getConnection(jdbc_url, user, password); // 2번
			String sql = "delete from personal_size where id = ?"; // 3번
			PreparedStatement ps = con.prepareStatement(sql); // 4번
			ps.setString(1, dto.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
