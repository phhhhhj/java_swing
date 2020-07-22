package login;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import mainprogram.DownCompare;
import mainprogram.Main;
import mainprogram.UiSizeDaoTest;
import mainprogram.UiSizeMethodClass;
import mainprogram.UpCompare;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SizeChange {
	private static JTextField t_length;
	private static JTextField shoulder;
	private static JTextField chest;
	private static JTextField a_length;
	private static JTextField a_circle;
	private static JTextField waist;
	private static JTextField thigh;
	private static JTextField l_length;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void main() {
		
		JFrame f = new JFrame();
		f.setLocation(500, 40);
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("치수 입력 페이지");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(12, 43, 560, 125);
		f.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(22, 247, 261, 350);
		f.getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(295, 247, 261, 350);
		f.getContentPane().add(panel_1);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("상체 길이");
		lblNewLabel_1.setBounds(0, 25, 80, 35);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblNewLabel_1);

		t_length = new JTextField();
		t_length.setBounds(85, 25, 116, 35);
		panel.add(t_length);
		t_length.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("cm");
		lblNewLabel_3.setBounds(231, 25, 18, 35);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_1_1 = new JLabel("어깨 넓이");
		lblNewLabel_1_1.setBounds(0, 85, 80, 35);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblNewLabel_1_1);

		shoulder = new JTextField();
		shoulder.setBounds(85, 85, 116, 35);
		shoulder.setColumns(10);
		panel.add(shoulder);

		JLabel lblNewLabel_3_1 = new JLabel("cm");
		lblNewLabel_3_1.setBounds(231, 85, 18, 35);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3_1);

		JLabel lblNewLabel_1_2 = new JLabel("가슴 둘레");
		lblNewLabel_1_2.setBounds(0, 145, 80, 35);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblNewLabel_1_2);

		chest = new JTextField();
		chest.setBounds(85, 145, 116, 35);
		chest.setColumns(10);
		panel.add(chest);

		JLabel lblNewLabel_3_1_1 = new JLabel("cm");
		lblNewLabel_3_1_1.setBounds(231, 145, 18, 35);
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3_1_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("팔 길이");
		lblNewLabel_1_2_1.setBounds(0, 205, 80, 36);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblNewLabel_1_2_1);

		a_length = new JTextField();
		a_length.setBounds(85, 205, 116, 36);
		a_length.setColumns(10);
		panel.add(a_length);

		JLabel lblNewLabel_3_1_2 = new JLabel("cm");
		lblNewLabel_3_1_2.setBounds(231, 214, 18, 36);
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3_1_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("윗 팔 둘레");
		lblNewLabel_1_2_2.setBounds(0, 265, 80, 40);
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblNewLabel_1_2_2);

		a_circle = new JTextField();
		a_circle.setBounds(85, 265, 116, 40);
		a_circle.setColumns(10);
		panel.add(a_circle);

		JLabel lblNewLabel_3_1_2_1 = new JLabel("cm");
		lblNewLabel_3_1_2_1.setBounds(231, 265, 18, 40);
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3_1_2_1);

		JLabel lblNewLabel_1_3 = new JLabel("허리 둘레");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_3.setBounds(0, 85, 85, 40);
		panel_1.add(lblNewLabel_1_3);

		waist = new JTextField();
		waist.setColumns(10);
		waist.setBounds(97, 85, 124, 40);
		panel_1.add(waist);

		JLabel lblNewLabel_3_1_3 = new JLabel("cm");
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setBounds(220, 25, 41, 40);
		panel_1.add(lblNewLabel_3_1_3);

		JLabel lblNewLabel_1_1_1 = new JLabel("허리 높이");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1_1.setBounds(0, 25, 85, 40);
		panel_1.add(lblNewLabel_1_1_1);

		l_length = new JTextField();
		l_length.setColumns(10);
		l_length.setBounds(97, 25, 124, 40);
		panel_1.add(l_length);

		JLabel lblNewLabel_3_1_4 = new JLabel("cm");
		lblNewLabel_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_4.setBounds(220, 85, 41, 40);
		panel_1.add(lblNewLabel_3_1_4);

		JLabel lblNewLabel_1_2_3 = new JLabel("허벅지 둘레");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_2_3.setBounds(0, 145, 85, 40);
		panel_1.add(lblNewLabel_1_2_3);

		thigh = new JTextField();
		thigh.setColumns(10);
		thigh.setBounds(97, 145, 124, 40);
		panel_1.add(thigh);

		JLabel lblNewLabel_3_1_5 = new JLabel("cm");
		lblNewLabel_3_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_5.setBounds(220, 145, 41, 40);
		panel_1.add(lblNewLabel_3_1_5);

		JLabel lblNewLabel_2 = new JLabel("상의");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 178, 102, 59);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("하의");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(454, 178, 102, 59);
		f.getContentPane().add(lblNewLabel_2_1);
		f.setSize(600, 800);
				
		String sign = login.Login.loginID;
		
		SizeDTO dto = new SizeDTO();
		dto.setId(sign);		
		
		SizeDAO dao = new SizeDAO();
		SizeDTO dto2 = dao.select(dto);
		
		if (dto2 != null) {
			String tl = Double.toString(dto2.getTop_length());
			String sh = Double.toString(dto2.getShoulder_width());
			String ch = Double.toString(dto2.getChest());
			String al = Double.toString(dto2.getArm_length());
			String ac = Double.toString(dto2.getArm_circle());
			String wa = Double.toString(dto2.getWaist_circle());
			String th = Double.toString(dto2.getThigh_circle());
			String ll = Double.toString(dto2.getLeg_length());
			
			t_length.setText(tl);
			shoulder.setText(sh);
			chest.setText(ch);
			a_length.setText(al);
			a_circle.setText(ac);
			waist.setText(wa);
			thigh.setText(th);
			l_length.setText(ll);
		}

		JButton btnNewButton_3 = new JButton("취  소");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mypage my = new Mypage();
				my.my();
				f.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_3.setBounds(163, 701, 120, 50);
		f.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_1_1 = new JButton("확  인");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t_length.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "상체 길이를 입력해주세요");
				} else if (shoulder.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "어깨 넓이를 입력해주세요");
				} else if (chest.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "가슴 둘레를 입력해주세요");
				} else if (a_length.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "팔 길이를 입력해주세요");
				} else if (a_circle.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "윗 팔 둘레를 입력해주세요");
				} else if (waist.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "허리 둘레를 입력해주세요");
				} else if (thigh.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "다리 길이를 입력해주세요");
				} else if (l_length.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "허벅지 둘레를 입력해주세요");
				} else {
					double top_length = Double.parseDouble((String) t_length.getText());
					double shoulder_width = Double.parseDouble((String) shoulder.getText());
					double chest_width = Double.parseDouble((String) chest.getText());
					double arm_length = Double.parseDouble((String) a_length.getText());
					double arm_circle = Double.parseDouble((String) a_circle.getText());
					double waist_circle = Double.parseDouble((String) waist.getText());
					double thigh_circle = Double.parseDouble((String) thigh.getText());
					double leg_length = Double.parseDouble((String) l_length.getText());
					SizeDTO dto = new SizeDTO();
					dto.setTop_length(top_length);
					dto.setShoulder_width(shoulder_width);
					dto.setChest(chest_width);
					dto.setArm_length(arm_length);
					dto.setArm_circle(arm_circle);
					dto.setWaist_circle(waist_circle);
					dto.setThigh_circle(thigh_circle);
					dto.setLeg_length(leg_length);
					dto.setId(sign);
					JOptionPane.showMessageDialog(null, "치수가 입력되었습니다.");
					SizeDAO dao = new SizeDAO();
					dao.update(dto);
					
					f.dispose();
					
					mainprogram.UiSizeDaoTest cmcmchage = new UiSizeDaoTest();
					cmcmchage.sizechage();

					mainprogram.UiSizeMethodClass caller = new UiSizeMethodClass();
					caller.UiSizeMethod();
					
					UpCompare uprest = new UpCompare();
					DownCompare downreset = new DownCompare();
					
					try {
						if (!Main.tf444_up.getText().equals(null)) {
							uprest.upcompare();
						}if (!Main.tf444_down.getText().equals(null)) {
							downreset.downcompare();
						}
					} catch (Exception e2) {
					}
					
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(350, 701, 120, 50);
		f.getContentPane().add(btnNewButton_1_1);

		f.setVisible(true);
	}
}
