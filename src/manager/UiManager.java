package manager;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import login.Bbs;
import login.Login;
import login.Mypage;
import mainprogram.Main;

public class UiManager {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;
	private static JTextField t7;
	private static JTextField t8;
	private static JTextField t44;
	private static JTextField t55;
	private static JTextField t66;
	private static JTextField t3;
	private static JTextField t33;
	private static JTextField t111;
	private static JScrollPane scrollPane;
	static String target;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void UiManager() {
		// 관리자모드 메인 페이지

		JFrame f = new JFrame();
		f.setTitle("관리자 모드");
		f.setSize(1250, 650);
		f.setLocation(200, 80);
		f.getContentPane().setLayout(null);

		// 오른쪽 메뉴 3개(상품 추가, 상품 검색, 공지사항) 버튼 포괄하는 패널
		JPanel panel = new JPanel();
		panel.setBounds(0, 153, 154, 141);
		f.getContentPane().add(panel);
		panel.setLayout(null);

		// 우측 화면 전체 포괄하는 패널
		JPanel p0 = new JPanel();
		p0.setBounds(166, 47, 1050, 554);
		f.getContentPane().add(p0);
		p0.setLayout(null);
		p0.setVisible(true); // 항상 보이게 해두고 오른쪽 메뉴 버튼 바뀔 때마다 removeall

		// 상품추가 버튼(b1) 클릭시 뜨는 패널
		JPanel p1 = new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setBounds(12, 10, 477, 183);
		p0.add(p1);
		p1.setLayout(null);
		p1.setVisible(false);

		// 상의 상세 정보 입력창
		JPanel p2 = new JPanel();
		p2.setBounds(12, 248, 835, 229);
		p0.add(p2);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setLayout(null);
		p2.setVisible(false); // 처음에는 뜨지 않음

		// 하의 상세 정보 입력창
		JPanel p3 = new JPanel();
		p3.setBounds(12, 248, 835, 229);
		p0.add(p3);
		p3.setLayout(null);
		p3.setBackground(Color.LIGHT_GRAY);
		p3.setVisible(false); // 처음에는 뜨지 않음

		// 상품 검색 버튼(b2) 클릭시 뜨는 패널
		JPanel p4 = new JPanel();
		p4.setBackground(Color.LIGHT_GRAY);
		p4.setBounds(12, 10, 490, 153);
		p0.add(p4);
		p4.setLayout(null);
		p4.setVisible(false); // 처음에는 뜨지 않음

		// p4에서 검색 버튼 누르면 해당 카테고리와 해당 판매자에 대한 상품 목록 뜨게할 패널
		JPanel p5 = new JPanel();
		p5.setBackground(Color.PINK);
		p5.setBounds(12, 203, 1000, 300);
		p0.add(p5);
		p5.setLayout(null);
		p5.setVisible(false); // 처음에는 뜨지 않음

		// 카테고리 항목 뜨는 콤보박스 생성하기
		// 카테고리 내용 배열에 저장(default는 선택, 그 뒤 4개는 상의류, 마지막 4개는 하의류)
		String[] category = { "선택", "티셔츠", "셔츠", "스웨터", "후드티", "면바지", "청바지", "트레이닝바지", "반바지" };

		// 콤보박스 생성해서 category 배열을 내용으로 추가
		JComboBox cbox1 = new JComboBox(category);
		cbox1.setBounds(153, 37, 205, 32);
		p1.add(cbox1);
		cbox1.setFont(new Font("굴림", Font.BOLD, 20));
		// 콤보박스에서 하나 선택하면 실행
		cbox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 콤보박스에서 선택된 값 String으로 변환하여 target에 대입
				target = cbox1.getSelectedItem().toString();
				for (int i = 1; i < 5; i++) {
					// target이 category 배열 중 선택 이후 앞의 4개 중 하나와 같다면 => 상의
					if (category[i].equals(target)) {
						// p2(상의 상세 정보 입력 panel) 띄우고 p3(하의 상세 정보 입력 panel)는 가림
						p0.add(p2);
						p2.setVisible(true);
						p3.setVisible(false);
						break;
					} // if
				} // for
				for (int i = 5; i < category.length; i++) {
					// target이 category 배열 중 마지막 4개 중 하나와 같다면 => 하의
					if (category[i].equals(target)) {
						// p3(하의 상세 정보 입력 panel) 띄우고 p2(상의 상세 정보 입력 panel)는 가림
						p0.add(p3);
						p3.setVisible(true);
						p2.setVisible(false);
						break;
					} // if
				} // for
			} // actionPerformed
		}); // ActionListener

		JLabel lblNewLabel_2 = new JLabel("카테고리");
		lblNewLabel_2.setBounds(50, 34, 91, 39);
		p1.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));

		JLabel lblNewLabel = new JLabel("상품명");
		lblNewLabel.setBounds(50, 79, 91, 39);
		p1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));

		t1 = new JTextField();
		t1.setBounds(153, 82, 283, 32);
		p1.add(t1);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("판매자");
		lblNewLabel_1.setBounds(50, 128, 91, 39);
		p1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));

		t2 = new JTextField();
		t2.setBounds(153, 128, 283, 32);
		p1.add(t2);
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("총 길이");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(368, 38, 99, 48);
		p2.add(lblNewLabel_1_1);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 20));
		t4.setColumns(10);
		t4.setBounds(466, 46, 143, 32);
		p2.add(t4);

		JLabel lblNewLabel_1_1_1 = new JLabel("cm");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(621, 38, 35, 48);
		p2.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("어깨 너비");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(55, 96, 99, 48);
		p2.add(lblNewLabel_1_2);

		t5 = new JTextField();
		t5.setFont(new Font("굴림", Font.PLAIN, 20));
		t5.setColumns(10);
		t5.setBounds(153, 104, 143, 32);
		p2.add(t5);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("cm");
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(308, 96, 35, 48);
		p2.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_3 = new JLabel("가슴 둘레");
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(368, 96, 99, 48);
		p2.add(lblNewLabel_1_3);

		t6 = new JTextField();
		t6.setFont(new Font("굴림", Font.PLAIN, 20));
		t6.setColumns(10);
		t6.setBounds(466, 104, 143, 32);
		p2.add(t6);

		JLabel lblNewLabel_1_1_2 = new JLabel("cm");
		lblNewLabel_1_1_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(621, 96, 35, 48);
		p2.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("팔 길이");
		lblNewLabel_1_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(55, 154, 99, 48);
		p2.add(lblNewLabel_1_2_1);

		t7 = new JTextField();
		t7.setFont(new Font("굴림", Font.PLAIN, 20));
		t7.setColumns(10);
		t7.setBounds(153, 162, 143, 32);
		p2.add(t7);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("cm");
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(308, 154, 35, 48);
		p2.add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("팔 둘레");
		lblNewLabel_1_2_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(368, 154, 99, 48);
		p2.add(lblNewLabel_1_2_1_1);

		t8 = new JTextField();
		t8.setFont(new Font("굴림", Font.PLAIN, 20));
		t8.setColumns(10);
		t8.setBounds(466, 162, 143, 32);
		p2.add(t8);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("cm");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(621, 154, 35, 48);
		p2.add(lblNewLabel_1_1_1_1_1_1);

		// p2에서 상의 정보 입력 후 저장
		JButton btnNewButton_4 = new JButton("저장");
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_4.setBounds(678, 79, 108, 79);
		p2.add(btnNewButton_4);
		// 상의 정보 입력 후 저장 클릭하면 실행
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// p2의 텍스트필드 중 하나라도 입력 안하면 추가안됨
				if (t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "상품명을 입력해주세요.");
				} else if (t2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "판매자를 입력해주세요.");
				} else if (t3.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "사이즈를 입력해주세요.");
				} else if (t4.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "총 길이를 입력해주세요.");
				} else if (t5.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "어깨 너비를 입력해주세요.");
				} else if (t6.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "가슴 둘레를 입력해주세요.");
				} else if (t7.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "팔 길이를 입력해주세요.");
				} else if (t8.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "팔 둘레를 입력해주세요.");
				} else { // 모두 입력 되었으면 저장 실행
					// 각 텍스트필드에 있는 값 모두 각각 변수에 저장
					String catego = target;
					String model = t1.getText();
					String brand = t2.getText();
					String size = t3.getText();
					String len = t4.getText();
					String width = t5.getText();
					String chest = t6.getText();
					String armlen = t7.getText();
					String armcircle = t8.getText();

					// 상품명 중복 검사를 위해 selectTopOverlap() 호출
					TopDAO dao = new TopDAO();
					// 반환된 result가 0이면 중복 없음, 1이면 중복 있음
					int result = dao.selectTopOverlap(model);
					if (result == 1) {
						JOptionPane.showMessageDialog(null, "동일한 상품명이 존재합니다.");
					} else {
						// 동일한 상품명이 없으면 저장 진행
						// dto 만들어서 각각 set
						TopDTO dto = new TopDTO();
						dto.setCatego(catego);
						dto.setModel(model);
						dto.setBrand(brand);
						dto.setSize(size);
						dto.setLen(len);
						dto.setWidth(width);
						dto.setChest(chest);
						dto.setArmlen(armlen);
						dto.setArmcircle(armcircle);

						// insert 메소드 호출
						TopDAO dao2 = new TopDAO();
						dao2.insertTop(dto);
					}
				} // else
			} // actionPerformed
		}); // ActionListener

		JLabel lblNewLabel_1_2_1_2 = new JLabel("사이즈");
		lblNewLabel_1_2_1_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2.setBounds(55, 38, 99, 48);
		p2.add(lblNewLabel_1_2_1_2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(153, 46, 143, 32);
		p2.add(t3);

		JLabel lblNewLabel_2_1 = new JLabel("카테고리");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(36, 87, 91, 39);
		p4.add(lblNewLabel_2_1);

		// 상품 검색 버튼 누르면 나오는 p4의 콤보박스
		JComboBox cbox2 = new JComboBox(category);
		cbox2.setFont(new Font("굴림", Font.BOLD, 20));
		cbox2.setBounds(139, 90, 205, 32);
		p4.add(cbox2);

		JLabel lblNewLabel_1_4 = new JLabel("판매자");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(36, 38, 91, 39);
		p4.add(lblNewLabel_1_4);

		t111 = new JTextField();
		t111.setFont(new Font("굴림", Font.BOLD, 20));
		t111.setColumns(10);
		t111.setBounds(139, 38, 205, 32);
		p4.add(t111);

		JButton btnNewButton = new JButton("검색");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(356, 43, 109, 70);
		p4.add(btnNewButton);
		// 검색버튼 누르면 실행
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 검색 데이터 테이블 뜨는 패널 초기화
				p5.removeAll();
				// 상품 검색 시 텍스트필드에 입력한 판매자 저장
				String brand = t111.getText();
				// 상품 검색 시 콤보박스에서 선택한 카테고리 저장
				String catego = cbox2.getSelectedItem().toString();
				// 초기화한 패널 띄움
				p0.add(p5);
				p5.setVisible(true);

				// 상의이면 UiSelectTop 창 띄움
				if (catego.equals("티셔츠") || catego.equals("셔츠") || catego.equals("스웨터") || catego.equals("후드티")) {
					// 검색 시 입력한 brand와 catego 참고하여 패널에 테이블 띄우기
					// selectTop 메소드 호출
					TopDAO dao = new TopDAO();
					ArrayList<TopDTO> list = dao.selectTop(catego, brand);
					// catego, model, brand, size, len, width, chest, armlen, armcircle
					// 열이름 배열
					Object[] title = { "상품번호", "카테고리", "상품명", "판매자", "사이즈", "총 길이", "어깨 너비", "가슴 둘레", "팔 길이", "팔 둘레" };
					// 인스턴스 들어갈 배열
					Object[][] contents = new Object[list.size()][];

					for (int i = 0; i < list.size(); i++) {
						// list에서 한 행씩 가져오기
						TopDTO dto = list.get(i);
						// 10개짜리 1차원 배열 만들기
						Object[] row = new Object[10];
						// row 배열에 dto 값 하나씩 넣어주기
						row[0] = dto.getNo();
						row[1] = dto.getCatego();
						row[2] = dto.getModel();
						row[3] = dto.getBrand();
						row[4] = dto.getSize();
						row[5] = dto.getLen();
						row[6] = dto.getWidth();
						row[7] = dto.getChest();
						row[8] = dto.getArmlen();
						row[9] = dto.getArmcircle();
						// 완성된 1차원 배열을 2차원 배열 i행에 끼워넣기
						contents[i] = row;
					}
					// jtable 생성
					DefaultTableModel dtm = new DefaultTableModel(contents, title);
					JTable table = new JTable(dtm);
					table = new JTable(contents, title);
					table.getColumnModel().getColumn(0).setPreferredWidth(50);
					table.getColumnModel().getColumn(1).setPreferredWidth(70);
					table.getColumnModel().getColumn(2).setPreferredWidth(100);
					table.getColumnModel().getColumn(3).setPreferredWidth(80);
					table.getColumnModel().getColumn(4).setPreferredWidth(80);
					table.getColumnModel().getColumn(5).setPreferredWidth(110);
					table.getColumnModel().getColumn(6).setPreferredWidth(110);
					table.getColumnModel().getColumn(7).setPreferredWidth(110);
					table.getColumnModel().getColumn(8).setPreferredWidth(110);
					table.getColumnModel().getColumn(9).setPreferredWidth(110);
					// 스크롤에 테이블 끼우기
					scrollPane = new JScrollPane(table);
					scrollPane.setBounds(10, 10, 930, 200);
					// 패널에 스크롤 띄우기
					p5.add(scrollPane);
					f.setVisible(true);
					// 결과 테이블에서 행 클릭시 새창 띄움
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (e.getButton() == 1) { // 테이블에서 한 행 클릭
								// 선택한 셀의 행 번호계산
								JTable table = (JTable) e.getSource();
								int row = table.getSelectedRow();

								// 선택된 행의 각각의 값 추출
								int no = (int) table.getValueAt(row, 0);
								String catego = (String) table.getValueAt(row, 1);
								String model = (String) table.getValueAt(row, 2);
								String brand = (String) table.getValueAt(row, 3);
								String size = (String) table.getValueAt(row, 4);
								String len = (String) table.getValueAt(row, 5);
								String width = (String) table.getValueAt(row, 6);
								String chest = (String) table.getValueAt(row, 7);
								String armlen = (String) table.getValueAt(row, 8);
								String armcircle = (String) table.getValueAt(row, 9);

								TopDTO dto = new TopDTO();

								// 추출한 값 dto에 set
								dto.setNo(no);
								dto.setCatego(catego);
								dto.setModel(model);
								dto.setBrand(brand);
								dto.setSize(size);
								dto.setLen(len);
								dto.setWidth(width);
								dto.setChest(chest);
								dto.setArmlen(armlen);
								dto.setArmcircle(armcircle);

								// 새 창을 띄우면서 dto객체를 넘기기
								UiSelectTop.selectTop(dto);

							} // if 클릭하면
						} // mouseClicked
					}); // addMouseListener
				} // if 상의의면
				else { // 하의이면 UiSelectBottom 창 띄움
						// 검색 시 입력한 brand와 catego 참고하여 패널에 테이블 띄우기
						// selectBottom 메소드 호출
					BottomDAO dao = new BottomDAO();
					ArrayList<BottomDTO> list = dao.selectBottom(catego, brand);

					// catego, model, brand, size, waist, len, thigh
					// 열이름 배열
					Object[] title = { "상품번호", "카테고리", "상품명", "판매자", "사이즈", "허리 둘레", "총 길이", "허벅지 둘레" };
					// 인스턴스 들어갈 배열
					Object[][] contents = new Object[list.size()][];

					for (int i = 0; i < list.size(); i++) {
						// list에서 한 행씩 가져오기
						BottomDTO dto = list.get(i);
						// 4개짜리 1차원 배열 만들기
						Object[] row = new Object[8];
						// row 배열에 dto 값 하나씩 넣어주기
						row[0] = dto.getNo();
						row[1] = dto.getCatego();
						row[2] = dto.getModel();
						row[3] = dto.getBrand();
						row[4] = dto.getSize();
						row[5] = dto.getWaist();
						row[6] = dto.getLen();
						row[7] = dto.getThigh();
						// 완성된 1차원배열을 2차원 배열 i행에 끼워넣기
						contents[i] = row;
					}
					// jtable 생성
					DefaultTableModel dtm = new DefaultTableModel(contents, title);
					JTable table = new JTable(dtm);
					table = new JTable(contents, title);
					table.getColumnModel().getColumn(0).setPreferredWidth(50);
					table.getColumnModel().getColumn(1).setPreferredWidth(70);
					table.getColumnModel().getColumn(2).setPreferredWidth(100);
					table.getColumnModel().getColumn(3).setPreferredWidth(80);
					table.getColumnModel().getColumn(4).setPreferredWidth(80);
					table.getColumnModel().getColumn(5).setPreferredWidth(110);
					table.getColumnModel().getColumn(6).setPreferredWidth(110);
					table.getColumnModel().getColumn(7).setPreferredWidth(110);
					// 스크롤에 테이블 끼우기
					scrollPane = new JScrollPane(table);
					scrollPane.setBounds(10, 10, 930, 200);
					// 패널에 테이블 띄우기
					p5.add(scrollPane);
					f.setVisible(true);
					// 결과 테이블에서 행 클릭시 새창 띄움
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (e.getButton() == 1) { // 테이블에서 한 행 클릭
								// 선택한 셀의 행 번호계산
								JTable table = (JTable) e.getSource();
								int row = table.getSelectedRow();

								// 선택된 행의 각각의 값 추출
								int no = (int) table.getValueAt(row, 0);
								String catego = (String) table.getValueAt(row, 1);
								String model = (String) table.getValueAt(row, 2);
								String brand = (String) table.getValueAt(row, 3);
								String size = (String) table.getValueAt(row, 4);
								String waist = (String) table.getValueAt(row, 5);
								String len = (String) table.getValueAt(row, 6);
								String thigh = (String) table.getValueAt(row, 7);

								BottomDTO dto = new BottomDTO();

								// 추출한 값 dto에 set
								dto.setNo(no);
								dto.setCatego(catego);
								dto.setModel(model);
								dto.setBrand(brand);
								dto.setSize(size);
								dto.setWaist(waist);
								dto.setLen(len);
								dto.setThigh(thigh);

								// 새 창을 띄우면서 dto객체를 넘기기
								UiSelectBottom.selectBottom(dto);

							} // if 클릭하면
						} // mouseClicked
					}); // addMouseListener
				} // else 하의이면
			} // actionPerformed
		}); // addActionListener

		JLabel lblNewLabel_1_1_3 = new JLabel("총 길이");
		lblNewLabel_1_1_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(52, 95, 99, 48);
		p3.add(lblNewLabel_1_1_3);

		t44 = new JTextField();
		t44.setFont(new Font("굴림", Font.PLAIN, 20));
		t44.setColumns(10);
		t44.setBounds(487, 45, 143, 32);
		p3.add(t44);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("cm");
		lblNewLabel_1_1_1_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(642, 37, 35, 48);
		p3.add(lblNewLabel_1_1_1_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("허리 둘레");
		lblNewLabel_1_2_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_2_2.setBounds(376, 37, 99, 48);
		p3.add(lblNewLabel_1_2_2);

		t55 = new JTextField();
		t55.setFont(new Font("굴림", Font.PLAIN, 20));
		t55.setColumns(10);
		t55.setBounds(163, 103, 143, 32);
		p3.add(t55);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("cm");
		lblNewLabel_1_1_1_1_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2.setBounds(318, 95, 35, 48);
		p3.add(lblNewLabel_1_1_1_1_2);

		JLabel lblNewLabel_1_3_1 = new JLabel("허벅지 둘레");
		lblNewLabel_1_3_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_3_1.setBounds(376, 95, 107, 48);
		p3.add(lblNewLabel_1_3_1);

		t66 = new JTextField();
		t66.setFont(new Font("굴림", Font.PLAIN, 20));
		t66.setColumns(10);
		t66.setBounds(487, 103, 143, 32);
		p3.add(t66);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("cm");
		lblNewLabel_1_1_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(642, 95, 35, 48);
		p3.add(lblNewLabel_1_1_2_1);

		// 하의 정보 입력 후 저장
		JButton btnNewButton_4_1 = new JButton("저장");
		btnNewButton_4_1.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_4_1.setBounds(696, 45, 108, 79);
		p3.add(btnNewButton_4_1);
		// 하의 정보 입력 후 저장 클릭하면 실행
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 하나라도 입력 안하면 추가안됨
				if (t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "상품명을 입력해주세요.");
				} else if (t2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "판매자를 입력해주세요.");
				} else if (t33.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "사이즈를 입력해주세요.");
				} else if (t44.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "허리 둘레를 입력해주세요.");
				} else if (t55.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "총 길이를 입력해주세요.");
				} else if (t66.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "허벅지 둘레를 입력해주세요.");
				} else { // 모두 입력 되었으면 저장 실행
					// 각 텍스트필드에 있는 값 모두 각각 변수에 저장
					String catego = target;
					String model = t1.getText();
					String brand = t2.getText();
					String size = t33.getText();
					String waist = t44.getText();
					String len = t55.getText();
					String thigh = t66.getText();

					// 상품명 중복 검사를 위해 selectBottomOverlap() 호출
					BottomDAO dao = new BottomDAO();
					// 반환된 result가 0이면 중복 없음, 1이면 중복 있음
					int result = dao.selectBottomOverlap(model);
					if (result == 1) {
						JOptionPane.showMessageDialog(null, "동일한 상품명이 존재합니다.");
					} else {
						// 동일한 상품명이 list에 없으면 저장 진행
						// dto 만들어서 각각 set
						BottomDTO dto = new BottomDTO();
						dto.setCatego(catego);
						dto.setModel(model);
						dto.setBrand(brand);
						dto.setSize(size);
						dto.setWaist(waist);
						dto.setLen(len);
						dto.setThigh(thigh);

						// 3. insert 메소드 호출
						BottomDAO dao2 = new BottomDAO();
						dao2.insertBottom(dto);
					}
				} // else
			} // actionPerformed
		}); // addActionListener

		JLabel lblNewLabel_1_2_2_1 = new JLabel("사이즈");
		lblNewLabel_1_2_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_2_2_1.setBounds(52, 37, 99, 48);
		p3.add(lblNewLabel_1_2_2_1);

		t33 = new JTextField();
		t33.setFont(new Font("굴림", Font.PLAIN, 20));
		t33.setColumns(10);
		t33.setBounds(163, 45, 143, 32);
		p3.add(t33);

		JButton b1 = new JButton("상품 추가");
		JButton b2 = new JButton("상품 검색");
		JButton b4 = new JButton("공지사항");

		b1.setFont(new Font("굴림", Font.BOLD, 18));
		b1.setBounds(12, 10, 125, 33);
		panel.add(b1);

		b2.setFont(new Font("굴림", Font.BOLD, 18));
		b2.setBounds(12, 53, 125, 33);
		panel.add(b2);

		b4.setFont(new Font("굴림", Font.BOLD, 18));
		b4.setBounds(12, 96, 125, 33);
		panel.add(b4);

		JLabel lblNewLabel_3 = new JLabel("관리자 모드");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_3.setBounds(12, 550, 143, 41);
		lblNewLabel_3.setOpaque(true); // Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		lblNewLabel_3.setBackground(Color.red);
		f.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("홈으로");
		btnNewButton_1.setBounds(820, 10, 111, 29);
		f.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 17));

		JButton btnNewButton_1_1 = new JButton("MY PAGE");
		btnNewButton_1_1.setBounds(943, 10, 111, 29);
		f.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mypage p = new Mypage();
				p.my();
				f.dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 17));

		JButton btnNewButton_1_2 = new JButton("로그아웃");
		btnNewButton_1_2.setBounds(1066, 10, 111, 29);
		f.getContentPane().add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				f.dispose();
				Main.f.dispose();
			}
		});
		btnNewButton_1_2.setFont(new Font("굴림", Font.BOLD, 17));

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p0.removeAll();
				p0.revalidate();
				p0.repaint();
				b1.setBackground(Color.LIGHT_GRAY);
				b2.setBackground(null);
				b4.setBackground(null);
				p0.add(p1);
				p1.setVisible(true);
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p0.removeAll();
				p0.revalidate();
				p0.repaint();
				b1.setBackground(null);
				;
				b2.setBackground(Color.LIGHT_GRAY);
				b4.setBackground(null);
				p0.add(p4);
				p4.setVisible(true);
			}
		});

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setBackground(null);
				b2.setBackground(null);
				b4.setBackground(Color.LIGHT_GRAY);

				Bbs b = new Bbs();
				b.bbs();
				f.dispose();
			}
		});

		f.setVisible(true);
	}
}
