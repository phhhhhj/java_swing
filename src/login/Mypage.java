package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import mainprogram.Main;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mypage {

	/**
	 * @wbp.parser.entryPoint
	 */
	public void my() {
		JFrame f = new JFrame();
		f.setLocation(600,200);
		f.setSize(400,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My page");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 65, 331, 70);
		f.getContentPane().add(lblNewLabel);
		
		JButton login = new JButton("회원 정보 수정");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangeMember changee = new ChangeMember();
				changee.change();
				f.dispose();
			}
		});
		login.setFont(new Font("굴림", Font.PLAIN, 25));
		login.setBounds(90, 192, 198, 57);
		f.getContentPane().add(login);
		
		JButton membership = new JButton("치수 변경");
		membership.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SizeChange size = new SizeChange();
				size.main();
				f.dispose();
			}
		});
		membership.setFont(new Font("굴림", Font.PLAIN, 25));
		membership.setBounds(94, 288, 198, 52);
		f.getContentPane().add(membership);
		
		JButton btnNewButton_2_1_1 = new JButton("홈으로");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnNewButton_2_1_1.setBounds(176, 10, 97, 23);
		f.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2 = new JButton("로그아웃");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				f.dispose();
				Main.f.dispose();
			}
		});
		btnNewButton_2.setBounds(275, 10, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("회원 탈퇴");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeaveMember leavee = new LeaveMember();
				leavee.leave();
				f.dispose();
			}
		});
		btnNewButton.setBounds(275, 425, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}
}
