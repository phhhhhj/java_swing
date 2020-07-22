package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JoinMember {
	private static JTextField tid;
	private static JTextField tpw;
	private static JTextField tpw2;
	private static JTextField tname;
	private static JTextField tbirth;
	private static JTextField tgender;
	private static JTextField temail;
	private static JTextField ttel;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void sign() {
		JFrame f = new JFrame();
		f.setLocation(500, 40);
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(600, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("회원 가입 페이지");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 560, 150);
		f.getContentPane().add(lblNewLabel);

		tid = new JTextField();
		tid.setBounds(163, 170, 307, 50);
		f.getContentPane().add(tid);
		tid.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("아 이 디");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(40, 170, 100, 50);
		f.getContentPane().add(lblNewLabel_1);

		tpw = new JTextField();
		tpw.setColumns(10);
		tpw.setBounds(163, 230, 307, 50);
		f.getContentPane().add(tpw);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(40, 230, 100, 50);
		f.getContentPane().add(lblNewLabel_1_1);

		tpw2 = new JTextField();
		tpw2.setColumns(10);
		tpw2.setBounds(163, 290, 231, 50);
		f.getContentPane().add(tpw2);

		JLabel lblNewLabel_1_2 = new JLabel("비밀번호 확인");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(40, 290, 100, 50);
		f.getContentPane().add(lblNewLabel_1_2);

		tname = new JTextField();
		tname.setColumns(10);
		tname.setBounds(163, 350, 307, 50);
		f.getContentPane().add(tname);

		JLabel lblNewLabel_1_3 = new JLabel("이  름");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(40, 350, 100, 50);
		f.getContentPane().add(lblNewLabel_1_3);

		tbirth = new JTextField();
		tbirth.setColumns(10);
		tbirth.setBounds(163, 410, 307, 50);
		f.getContentPane().add(tbirth);

		JLabel lblNewLabel_1_4 = new JLabel("생년월일");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(40, 410, 100, 50);
		f.getContentPane().add(lblNewLabel_1_4);

		tgender = new JTextField();
		tgender.setColumns(10);
		tgender.setBounds(163, 470, 307, 50);
		f.getContentPane().add(tgender);

		JLabel lblNewLabel_1_5 = new JLabel("성  별");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(40, 470, 100, 50);
		f.getContentPane().add(lblNewLabel_1_5);

		temail = new JTextField();
		temail.setColumns(10);
		temail.setBounds(163, 530, 307, 50);
		f.getContentPane().add(temail);

		JLabel lblNewLabel_1_6 = new JLabel("E-mail");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(40, 530, 100, 50);
		f.getContentPane().add(lblNewLabel_1_6);

		ttel = new JTextField();
		ttel.setColumns(10);
		ttel.setBounds(163, 590, 307, 50);
		f.getContentPane().add(ttel);

		JLabel lblNewLabel_1_7 = new JLabel("전화번호");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_7.setBounds(40, 590, 100, 50);
		f.getContentPane().add(lblNewLabel_1_7);

		JLabel lblNewLabel_2 = new JLabel("(필수)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(482, 190, 57, 15);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("(필수)");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(482, 247, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("(필수)");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(482, 307, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("(필수)");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(482, 367, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("(필수)");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setBounds(482, 427, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("(필수)");
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setBounds(482, 487, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1_1_1_1_1);

		JButton btnNewButton = new JButton("취  소");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				f.dispose();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setBounds(163, 680, 120, 50);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("확  인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tid.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
				} else if (tpw.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				} else if (!tpw.getText().equals(tpw2.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다.");
				} else if (tname.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 넣어주세요.");
				} else if (tbirth.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "생년월일을 넣어주세요.");
				} else if (tgender.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "성별을 넣어주세요.");
				} else {
					String id = tid.getText();
					String pw = tpw.getText();
					String name = tname.getText();
					String birth = tbirth.getText();
					String gender = tgender.getText();
					String email = temail.getText();
					String tel = ttel.getText();
			
					MemberDTO mdto = new MemberDTO();
					SizeDTO sdto = new SizeDTO();
					mdto.setId(id);
					mdto.setPw(pw);
					mdto.setName(name);
					mdto.setBirth(birth);
					mdto.setGender(gender);
					mdto.setEmail(email);
					mdto.setTel(tel);
					sdto.setId(id);
					MemberDAO mdao = new MemberDAO();
					MemberDTO dto2 = mdao.select(mdto);
					if (dto2 != null) {
						JOptionPane.showMessageDialog(null, "동일한 아이디가 있습니다.");
					} else {
						MemberDAO mdb = new MemberDAO();
						mdb.insert(mdto);
						SizeDAO sdb = new SizeDAO();
						sdb.insert(sdto);
						
						Login.main(null);
						f.dispose();
					}

				}

			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(350, 680, 120, 50);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("확인");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tpw.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요");
				} else if (tpw.getText().equals(tpw2.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호가 확인 되었습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
				}
			}
		});
		btnNewButton_2.setBounds(406, 290, 64, 50);
		f.getContentPane().add(btnNewButton_2);

		f.setVisible(true);

	}
}
