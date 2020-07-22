package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ChangeMember {
	private static JTextField tpw;
	private static JTextField tpw2;
	private static JTextField temail;
	private static JTextField ttel;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void change() {

		JFrame f = new JFrame();
		f.setLocation(500, 40);
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(600, 800);
		f.getContentPane().setLayout(null);

		JLabel id_label = new JLabel("");
		id_label.setBounds(163, 170, 307, 50);
		f.getContentPane().add(id_label);

		JLabel name_label = new JLabel("");
		name_label.setBounds(163, 350, 307, 50);
		f.getContentPane().add(name_label);

		JLabel birth_label = new JLabel("");
		birth_label.setBounds(163, 410, 307, 50);
		f.getContentPane().add(birth_label);

		JLabel gender_label = new JLabel("");
		gender_label.setBounds(163, 470, 307, 50);
		f.getContentPane().add(gender_label);

		String sign = login.Login.loginID;
		MemberDTO dto = new MemberDTO();
		dto.setId(sign);
		MemberDAO dao = new MemberDAO();
		MemberDTO dtoc = dao.select(dto);
		if (dtoc != null) {
			id_label.setText(dtoc.getId());
			name_label.setText(dtoc.getName());
			birth_label.setText(dtoc.getBirth());
			gender_label.setText(dtoc.getGender());
		}

		JLabel lblNewLabel = new JLabel("회원정보 수정 페이지");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 35, 560, 125);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아 이 디");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(40, 170, 100, 50);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(40, 230, 100, 50);
		f.getContentPane().add(lblNewLabel_1_1);

		tpw = new JTextField();
		tpw.setColumns(10);
		tpw.setBounds(163, 230, 307, 50);
		f.getContentPane().add(tpw);

		JLabel lblNewLabel_1_2 = new JLabel("비밀번호 확인");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(40, 290, 100, 50);
		f.getContentPane().add(lblNewLabel_1_2);

		tpw2 = new JTextField();
		tpw2.setColumns(10);
		tpw2.setBounds(163, 290, 307, 50);
		f.getContentPane().add(tpw2);

		JLabel lblNewLabel_1_3 = new JLabel("이  름");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(40, 350, 100, 50);
		f.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("생년월일");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(40, 410, 100, 50);
		f.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("성  별");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(40, 470, 100, 50);
		f.getContentPane().add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("E-mail");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(40, 530, 100, 50);
		f.getContentPane().add(lblNewLabel_1_6);

		temail = new JTextField();
		temail.setColumns(10);
		temail.setBounds(163, 530, 307, 50);
		f.getContentPane().add(temail);

		JLabel lblNewLabel_1_7 = new JLabel("전화번호");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_7.setBounds(40, 590, 100, 50);
		f.getContentPane().add(lblNewLabel_1_7);

		ttel = new JTextField();
		ttel.setColumns(10);
		ttel.setBounds(163, 590, 307, 50);
		f.getContentPane().add(ttel);

		JLabel lblNewLabel_2_1 = new JLabel("(필수)");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(482, 247, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("(필수)");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(482, 307, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1_1);

		JButton btnNewButton = new JButton("취  소");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mypage my = new Mypage();
				my.my();;
				f.dispose();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setBounds(163, 680, 120, 50);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("확  인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tpw.getText().equals(tpw2.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다. 다시 입력해주세요.");
				} else if (tpw.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				} else if (tpw2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요.");
				} else {
					JOptionPane.showMessageDialog(null, "변경이 완료되었습니다.");
					String pw = tpw.getText();
					String email = temail.getText();
					String tel = ttel.getText();

					MemberDTO dto = new MemberDTO();
					dto.setPw(pw);
					dto.setEmail(email);
					dto.setTel(tel);
					dto.setId(sign);
					MemberDAO dao = new MemberDAO();
					dao.update(dto);

					Mypage my = new Mypage();
					my.my();;
					f.dispose();
				}
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(350, 680, 120, 50);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);

	}

}
