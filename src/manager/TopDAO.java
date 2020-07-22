package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TopDAO {

	String url = "jdbc:mysql://localhost:3708/project01?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	// 모델명 중복 검사
	public int selectTopOverlap(String model) {
		int result = 0; // 초기화
		try { // 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");

			// 2) db 연결
			con = DriverManager.getConnection(url, user, password);

			// 3) sql문 결정
			// top 테이블에 저장되어 있는 모델명 중 입력받은 모델명과 같은 것이 있는지 select
			String sql = "select model from top where model = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, model);

			// 4) sql문 전송
			rs = ps.executeQuery();

			if (rs.next()) {
				result = 1; // 동일한 모델명이 존재하면 result에 1 대입
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		// result 리턴
		return result;
	} // selectTopOverlap
	
	// 카테고리에 맞는 모델명 list 생성 -> 메인페이지에 카테고리 클릭시 뜨는 이미지 매칭
	public ArrayList<String> selectCate(String catego) {
		ArrayList<String> list = new ArrayList<>();

		try { // 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");

			// 2) db 연결
			con = DriverManager.getConnection(url, user, password);

			// 3) sql문 결정
			// top 테이블에 저장되어 있는 모델명 전체 select
			String sql = "select model from top where category = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, catego);

			// 4) sql문 전송
			rs = ps.executeQuery();

			while (rs.next()) {
				// DB에서 select된 모델명 받아서 저장
				String model = rs.getString(1);
				// list에 붙임
				list.add(model);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		// ArrayList<String> 리턴
		return list;
	} // selectCate
	
	// 상의 수정
	public void updateTop(TopDTO dto) {
		try { // 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");

			// 2) db 연결
			con = DriverManager.getConnection(url, user, password);

			// 3) sql문 결정
			// 일련번호 일치하는 DB의 행 모든 값 수정
			String sql = "update top set category = ? , model =? , brand =? ,"
					+ "size =? , length =? , width =? , chest =? , armlength =? ,"
					+ "armcircle = ? where no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getCatego());
			ps.setString(2, dto.getModel());
			ps.setString(3, dto.getBrand());
			ps.setString(4, dto.getSize());
			ps.setString(5, dto.getLen());
			ps.setString(6, dto.getWidth());
			ps.setString(7, dto.getChest());
			ps.setString(8, dto.getArmlen());
			ps.setString(9, dto.getArmcircle());
			ps.setInt(10, dto.getNo());

			// 4) sql문 전송
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "수정 완료.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
			} catch (Exception e2) {
			}
		}
	} // updateTop

	// 상의 검색 -> 리스트 리턴(테이블)
	public ArrayList<TopDTO> selectTop(String catego, String brand) {
		ArrayList<TopDTO> list = new ArrayList<>();

		try { // 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");

			// 2) db 연결
			con = DriverManager.getConnection(url, user, password);

			// 3) sql문 결정
			// 카테고리와 브랜드 일치하는 모든 행 검색
			String sql = "select * from top where category = ? and brand = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, catego);
			ps.setString(2, brand);

			// 4) sql문 전송
			// 검색되는 테이블 ResultSet으로 반환 받아서 rs에 저장
			rs = ps.executeQuery();

			while (rs.next()) { // rs에 몇 행이 있는지 모르니까 next()로 체크하면서 반복
				// dto 생성
				TopDTO dto = new TopDTO();

				// DB에서 select된 값들을 받아서 변수에 저장
				int no = rs.getInt(1);
				String catego2 = rs.getString(2);
				String model = rs.getString(3);
				String brand2 = rs.getString(4);
				String size = rs.getString(5);
				String len = rs.getString(6);
				String width = rs.getString(7);
				String chest = rs.getString(8);
				String armlen = rs.getString(9);
				String armcircle = rs.getString(10);
				
				// 변수에 저장돼 있는 값들 dto에 담기
				dto.setNo(no);
				dto.setCatego(catego2);
				dto.setModel(model);
				dto.setBrand(brand2);
				dto.setSize(size);
				dto.setLen(len);
				dto.setWidth(width);
				dto.setChest(chest);
				dto.setArmlen(armlen);
				dto.setArmcircle(armcircle);
				
				// dto 하나를 list에 각각 붙임
				list.add(dto);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		// ArrayList<TopDTO> 리턴
		return list;
	} // selectTop
	
	// 상의 전체 모델명 arraylist 생성 -> 이미지 파일 매칭하기 위해
		public ArrayList<String> selectTopAll() {
			ArrayList<String> list = new ArrayList<>();

			try { // 1) 커넥터 설정
				Class.forName("com.mysql.jdbc.Driver");

				// 2) db 연결
				con = DriverManager.getConnection(url, user, password);

				// 3) sql문 결정
				// top 테이블에 저장되어 있는 모델명 전체 select
				String sql = "select model from top";
				ps = con.prepareStatement(sql);

				// 4) sql문 전송
				rs = ps.executeQuery();

				while (rs.next()) {
					// DB에서 select된 모델명 받아서 저장
					String model = rs.getString(1);
					// list에 붙임
					list.add(model);
				} // while
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
					ps.close();
					rs.close();
				} catch (Exception e2) {
				}
			}
			// ArrayList<String> 리턴
			return list;
		} // selectTopAll

	// 상의 삭제
	public void deleteTop(TopDTO dto) {
		try { // 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");

			// 2) db 연결
			con = DriverManager.getConnection(url, user, password);

			// 3) sql문 결정
			// 일련번호에 해당하는 행 삭제
			String sql = "delete from top where no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getNo());

			// 4) sql문 전송
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "삭제 완료.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
			} catch (Exception e2) {
			}
		}
	} // deleteTop

	// 상의 추가
	public void insertTop(TopDTO dto) {
		try { // 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");

			// 2) db 연결
			con = DriverManager.getConnection(url, user, password);

			// 3) sql문 결정
			// top 테이블에 행 추가
			String sql = "insert into top values (?,?,?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, null); // 일련번호는 db에서 자동생성되므로 null 전송
			ps.setString(2, dto.getCatego());
			ps.setString(3, dto.getModel());
			ps.setString(4, dto.getBrand());
			ps.setString(5, dto.getSize());
			ps.setString(6, dto.getLen());
			ps.setString(7, dto.getWidth());
			ps.setString(8, dto.getChest());
			ps.setString(9, dto.getArmlen());
			ps.setString(10, dto.getArmcircle());

			// 4) sql문 전송
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "추가 완료.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
			} catch (Exception e2) {
			}
		}
	} // insertTop

} // class
