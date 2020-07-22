package manager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UiSelectBottom {
	private static JTextField t2;
	private static JTextField t1;
	private static JTextField t4;
	private static JTextField t3;
	private static JTextField t5;
	private static JTextField t6;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void selectBottom(BottomDTO dto) {
		JFrame f = new JFrame();
		f.setTitle("상품 상세 정보(하의)");
		f.setSize(700, 600);
		f.setLocation(500, 80);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("상품 상세 정보");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(197, 10, 270, 44);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2_1 = new JLabel("카테고리");
		lblNewLabel_2_1.setBounds(14, 158, 91, 39);
		f.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		
		// 카테고리 항목 뜨는 콤보박스 생성하기
		String[] category = { "선택", "면바지", "청바지", "트레이닝바지", "치마" };

		// 콤보박스 생성해서 category 배열을 내용으로 추가
		JComboBox cbox1 = new JComboBox(category);
		cbox1.setBounds(138, 158, 205, 32);
		f.getContentPane().add(cbox1);
		cbox1.setFont(new Font("굴림", Font.BOLD, 20));

		JLabel lblNewLabel = new JLabel("상품명");
		lblNewLabel.setBounds(14, 207, 91, 39);
		f.getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));

		t1 = new JTextField();
		t1.setBounds(138, 207, 205, 32);
		f.getContentPane().add(t1);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setColumns(10);

		JLabel lblNewLabel_1_4 = new JLabel("판매자");
		lblNewLabel_1_4.setBounds(14, 256, 91, 39);
		f.getContentPane().add(lblNewLabel_1_4);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("굴림", Font.BOLD, 20));

		t2 = new JTextField();
		t2.setBounds(138, 253, 205, 32);
		f.getContentPane().add(t2);
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);

		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("사이즈");
		lblNewLabel_1_2_1_2_1.setBounds(14, 295, 99, 48);
		f.getContentPane().add(lblNewLabel_1_2_1_2_1);
		lblNewLabel_1_2_1_2_1.setFont(new Font("굴림", Font.BOLD, 20));

		t3 = new JTextField();
		t3.setBounds(138, 303, 153, 32);
		f.getContentPane().add(t3);
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setColumns(10);

		JLabel lblNewLabel_1_1_3 = new JLabel("허리 둘레");
		lblNewLabel_1_1_3.setBounds(14, 339, 99, 48);
		f.getContentPane().add(lblNewLabel_1_1_3);
		lblNewLabel_1_1_3.setFont(new Font("굴림", Font.BOLD, 20));

		t4 = new JTextField();
		t4.setBounds(138, 347, 153, 32);
		f.getContentPane().add(t4);
		t4.setFont(new Font("굴림", Font.PLAIN, 20));
		t4.setColumns(10);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("cm");
		lblNewLabel_1_1_1_2.setBounds(303, 339, 35, 48);
		f.getContentPane().add(lblNewLabel_1_1_1_2);
		lblNewLabel_1_1_1_2.setFont(new Font("굴림", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_3_1 = new JLabel("총 길이");
		lblNewLabel_1_1_3_1.setBounds(14, 389, 99, 48);
		f.getContentPane().add(lblNewLabel_1_1_3_1);
		lblNewLabel_1_1_3_1.setFont(new Font("굴림", Font.BOLD, 20));

		t5 = new JTextField();
		t5.setBounds(138, 397, 153, 32);
		f.getContentPane().add(t5);
		t5.setFont(new Font("굴림", Font.PLAIN, 20));
		t5.setColumns(10);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("cm");
		lblNewLabel_1_1_1_1_2.setBounds(303, 389, 35, 48);
		f.getContentPane().add(lblNewLabel_1_1_1_1_2);
		lblNewLabel_1_1_1_1_2.setFont(new Font("굴림", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1_3_2 = new JLabel("허벅지 둘레");
		lblNewLabel_1_1_3_2.setBounds(14, 435, 125, 48);
		f.getContentPane().add(lblNewLabel_1_1_3_2);
		lblNewLabel_1_1_3_2.setFont(new Font("굴림", Font.BOLD, 20));

		t6 = new JTextField();
		t6.setBounds(138, 443, 153, 32);
		f.getContentPane().add(t6);
		t6.setFont(new Font("굴림", Font.PLAIN, 20));
		t6.setColumns(10);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("cm");
		lblNewLabel_1_1_2_1.setBounds(303, 435, 35, 48);
		f.getContentPane().add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("굴림", Font.PLAIN, 20));

		JLabel lblNewLabel_2 = new JLabel("상품번호");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 109, 91, 39);
		f.getContentPane().add(lblNewLabel_2);

		// 상품 일련번호
		JLabel l1 = new JLabel("");
		l1.setOpaque(true);
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		l1.setFont(new Font("굴림", Font.BOLD, 20));
		l1.setBackground(Color.GRAY);
		l1.setBounds(136, 109, 91, 39);
		f.getContentPane().add(l1);

		// 이전 화면 테이블에서 클릭한 행의 값 dto로 전달받음 -> 각 위치에 띄워줌
		// 모델명은 따로 변수에 저장해둠 -> 이미지 호출에 필요
		String target = dto.getModel();
		String no = Integer.toString(dto.getNo());
		l1.setText(no); // 상품 일련번호 수정 불가 -> 레이블에 띄움
		t1.setText(target);
		t2.setText(dto.getBrand());
		t3.setText(dto.getSize());
		t4.setText(dto.getWaist());
		t5.setText(dto.getLen());
		t6.setText(dto.getThigh());
		
		JLabel lbimg = new JLabel("");
		lbimg.setBounds(355, 109, 300, 300);
		f.getContentPane().add(lbimg);
		
		// 하의 모델명과 이미지 파일 매칭하기 위해 dao 호출
		BottomDAO dao = new BottomDAO();
		// 반환된 모델명 리스트 저장
		ArrayList<String> list = dao.selectBottomAll();

		// 이미지 파일명 = 모델명.jpg
		// 모델명과 같은 이름의 이미지 파일 lbimg에 띄움
		for (int i = 0; i < list.size(); i++) {
			// list(전체 모델명) 중 target 모델명 찾아 같은 이름의 이지미 파일 띄움
			if (list.get(i).contains(target)) {
				ImageIcon icon = new ImageIcon(list.get(i)+".jpg");
				lbimg.setIcon(icon);
			} // if
		} // for
		
		// 수정 버튼
		JButton b1 = new JButton("수정");
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBounds(350, 466, 155, 64);
		f.getContentPane().add(b1);
		// 수정 버튼 클릭하면
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 각 텍스트필드에 입력된 내용 변수에 저장
				int no2 = Integer.parseInt(l1.getText());
				String catego = cbox1.getSelectedItem().toString();
				String model = t1.getText();
				String brand = t2.getText();
				String size = t3.getText();
				String waist = t4.getText();
				String len = t5.getText();
				String thigh = t6.getText();
				
				if (catego.equals("선택")) { // 콤보박스에서 카테고리 선택하지 않은 상태라면
					JOptionPane.showMessageDialog(null, "카테고리를 선택해주세요.");
				}else { // 카테고리 선택되었으면 각각의 내용 dto에 담기
					BottomDTO dto2 = new BottomDTO();
					dto2.setNo(no2);
					dto2.setCatego(catego);
					dto2.setModel(model);
					dto2.setBrand(brand);
					dto2.setSize(size);
					dto2.setWaist(waist);
					dto2.setLen(len);
					dto2.setThigh(thigh);
					
					// updateBottom 메소드 호출
					BottomDAO dao = new BottomDAO();
					dao.updateBottom(dto2);
					f.dispose();
				} // else (수정 진행)
			} // actionPerformed
		}); // addActionListener
		
		// 삭제 버튼
		JButton b2 = new JButton("삭제");
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBounds(517, 466, 155, 64);
		f.getContentPane().add(b2);
		// 삭제 버튼 클릭하면
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 삭제하고 싶은 상품과 모든 정보 일치해야 삭제 진행 -> 수정사항 있거나 카테고리 선택 안되면 삭제 진행 X
				if (cbox1.getSelectedItem().toString().equals(dto.getCatego()) && t1.getText().equals(dto.getModel())
						&& t2.getText().equals(dto.getBrand()) && t3.getText().equals(dto.getSize())
						&& t4.getText().equals(dto.getWaist()) && t5.getText().equals(dto.getLen())
						&& t6.getText().equals(dto.getThigh())) {
					int no2 = Integer.parseInt(no); // 일련번호 int로 변환
					BottomDTO dto = new BottomDTO();
					dto.setNo(no2); // 일련번호 이용하여 삭제 진행 예정 -> dto에 set
					BottomDAO dao = new BottomDAO();
					dao.deleteBottom(dto);
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "일치하는 상품이 없습니다.\n상품 정보를 확인해 주세요.");
				}
			} // actionPerformed
		}); // addActionListener

		f.setVisible(true);
	}
}
