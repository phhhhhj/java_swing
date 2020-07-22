package mainprogram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import login.Bbs;
import login.Login;
import login.Mypage;
import manager.TopDAO;
import manager.TopDTO;
import manager.UiManager;


public class Main {
	
	static JTextField tf1_up,tf2_up,tf3_up,tf4_up,tf5_up,tf6_up,tf7_up,tf8_up;
	static JTextField tf44_up,tf55_up,tf66_up,tf77_up,tf88_up;
	static JTextField tf555_up,tf666_up,tf777_up,tf888_up;
			
	static JTextField tf1_down,tf2_down,tf3_down,tf4_down,tf6_down,tf8_down;
	static JTextField tf44_down,tf66_down,tf88_down;
	static JTextField tf666_down,tf888_down;
	
	public static JTextField tf444_up,tf444_down;
	
	static JLabel l_img_up,l_img_down  ;
	static ImageIcon imgUpChage, imgDownChage;
	
	public static String clicktype;
	
	public static JFrame f;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void kshstart() {
		
		String sign = login.Login.loginID;
		
		f = new JFrame();
		f.setSize(1083,783);
		f.getContentPane().setLayout(null);
		f.setLocation(50, 50);
		
		UiUp cmtest = new UiUp();
		UiDown cmtest2 = new UiDown();
		
		
		JButton b1 = new JButton("게시판");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bbs b = new Bbs();
				b.bbs();
			}
		});
		b1.setBounds(585, 10, 127, 37);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("내페이지");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Mypage mypa = new Mypage();
				mypa.my();
				
			}
		});
		b2.setBounds(740, 10, 127, 37);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("로그아웃");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이용해주셔서 감사합니다용!!");
				f.dispose();
				Login.main(null);
				
			}
		});
		b3.setBounds(895, 10, 127, 37);
		f.getContentPane().add(b3);
		
		JButton bmanager = new JButton("관리자");
		bmanager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UiManager n = new UiManager();
				n.UiManager();
				
			}
		});
		bmanager.setBounds(429, 10, 127, 37);
		f.getContentPane().add(bmanager);
		
		if (!sign.equals("manager")) {
			bmanager.setVisible(false);
			bmanager.setEnabled(false);
		}
		
		
		
		JPanel panel_down = new JPanel();
		panel_down.setLayout(null);
		panel_down.setBackground(Color.PINK);
		panel_down.setBounds(29, 147, 973, 481);
		f.getContentPane().add(panel_down);
		
		l_img_down = new JLabel("New label");
		imgDownChage = new ImageIcon(DownCompare.sizeimg);
		l_img_down.setIcon(imgDownChage);
		l_img_down.setBounds(12, 37, 335, 423);
		panel_down.add(l_img_down);
		
		tf1_down = new JTextField();
		tf1_down.setColumns(10);
		tf1_down.setBounds(407, 37, 155, 38);
		panel_down.add(tf1_down);
		
		tf2_down = new JTextField();
		tf2_down.setColumns(10);
		tf2_down.setBounds(586, 37, 155, 38);
		panel_down.add(tf2_down);
		
		tf3_down = new JTextField();
		tf3_down.setColumns(10);
		tf3_down.setBounds(766, 37, 155, 38);
		panel_down.add(tf3_down);
		
		JLabel meLimg_1 = new JLabel("    나");
		meLimg_1.setFont(new Font("굴림", Font.BOLD, 30));
		meLimg_1.setBounds(417, 85, 134, 46);
		panel_down.add(meLimg_1);
		
		JLabel clothLimg_1 = new JLabel("    옷");
		clothLimg_1.setFont(new Font("굴림", Font.BOLD, 30));
		clothLimg_1.setBounds(776, 85, 134, 46);
		panel_down.add(clothLimg_1);
		
		JLabel meCloth1_down = new JLabel("New label");
		ImageIcon icon_down1 = new ImageIcon("총길이.png");
		meCloth1_down.setIcon(icon_down1);
		meCloth1_down.setBounds(407, 141, 166, 23);
		panel_down.add(meCloth1_down);
		
		tf4_down = new JTextField();
		tf4_down.setColumns(10);
		tf4_down.setBounds(407, 161, 166, 30);
		panel_down.add(tf4_down);
		
		JLabel meCloth3_down = new JLabel("New label");
		ImageIcon icon_down3 = new ImageIcon("허리둘레.png");
		meCloth3_down.setIcon(icon_down3);
		meCloth3_down.setBounds(407, 260, 166, 23);
		panel_down.add(meCloth3_down);
		
		tf6_down = new JTextField();
		tf6_down.setColumns(10);
		tf6_down.setBounds(407, 280, 166, 30);
		panel_down.add(tf6_down);
		
		JLabel meCloth5_down = new JLabel("New label");
		ImageIcon icon_down5 = new ImageIcon("허벅지둘레.png");
		meCloth5_down.setIcon(icon_down5);
		meCloth5_down.setBounds(407, 380, 166, 23);
		panel_down.add(meCloth5_down);
		
		tf8_down = new JTextField();
		tf8_down.setColumns(10);
		tf8_down.setBounds(407, 400, 166, 30);
		panel_down.add(tf8_down);
		
		JLabel clothSize1_down = new JLabel("New label");
		clothSize1_down.setIcon(icon_down1);
		clothSize1_down.setBounds(766, 141, 166, 23);
		panel_down.add(clothSize1_down);
		
		tf444_down = new JTextField();
		tf444_down.setColumns(10);
		tf444_down.setBounds(766, 161, 166, 30);
		panel_down.add(tf444_down);
		
		JLabel clothSize3_down = new JLabel("New label");
		clothSize3_down.setIcon(icon_down3);
		clothSize3_down.setBounds(766, 260, 166, 23);
		panel_down.add(clothSize3_down);
		
		tf666_down = new JTextField();
		tf666_down.setColumns(10);
		tf666_down.setBounds(766, 280, 166, 30);
		panel_down.add(tf666_down);
		
		JLabel clothSize5_down = new JLabel("New label");
		clothSize5_down.setIcon(icon_down5);
		clothSize5_down.setBounds(766, 380, 166, 23);
		panel_down.add(clothSize5_down);
		
		tf888_down = new JTextField();
		tf888_down.setColumns(10);
		tf888_down.setBounds(766, 400, 166, 30);
		panel_down.add(tf888_down);
		
		tf44_down = new JTextField();
		tf44_down.setColumns(10);
		tf44_down.setBounds(588, 161, 166, 30);
		panel_down.add(tf44_down);
		
		tf66_down = new JTextField();
		tf66_down.setColumns(10);
		tf66_down.setBounds(586, 280, 166, 30);
		panel_down.add(tf66_down);
		
		tf88_down = new JTextField();
		tf88_down.setColumns(10);
		tf88_down.setBounds(588, 400, 166, 30);
		panel_down.add(tf88_down);
		
		JPanel panel_up = new JPanel();
		panel_up.setBounds(29, 147, 973, 481);
		f.getContentPane().add(panel_up);
		panel_up.setBackground(Color.PINK);
		panel_up.setLayout(null);
		
		l_img_up = new JLabel("New label");
		imgUpChage = new ImageIcon(UpCompare.sizeimg);
		l_img_up.setIcon(imgUpChage);
		l_img_up.setBounds(12, 37, 335, 423);
		
		panel_up.add(l_img_up);
		
		tf1_up = new JTextField();
		tf1_up.setBounds(407, 37, 155, 38);
		panel_up.add(tf1_up);
		tf1_up.setColumns(10);
		
		tf2_up = new JTextField();
		tf2_up.setColumns(10);
		tf2_up.setBounds(586, 37, 155, 38);
		panel_up.add(tf2_up);
		
		tf3_up = new JTextField();
		tf3_up.setColumns(10);
		tf3_up.setBounds(766, 37, 155, 38);
		panel_up.add(tf3_up);
		
		JLabel meLimg = new JLabel("    나");
		meLimg.setFont(new Font("굴림", Font.BOLD, 30));
		meLimg.setBounds(417, 85, 134, 46);
		panel_up.add(meLimg);
		
		JLabel clothLimg = new JLabel("    옷");
		clothLimg.setFont(new Font("굴림", Font.BOLD, 30));
		clothLimg.setBounds(776, 85, 134, 46);
		panel_up.add(clothLimg);
		
		JLabel meCloth1_up = new JLabel("New label");
		ImageIcon icon_up1 = new ImageIcon("전체길이.png");
		meCloth1_up.setIcon(icon_up1);
		meCloth1_up.setBounds(407, 141, 166, 23);
		panel_up.add(meCloth1_up);
		
		tf4_up = new JTextField();
		tf4_up.setBounds(407, 161, 166, 30);
		panel_up.add(tf4_up);
		tf4_up.setColumns(10);
		
		JLabel meCloth2_up = new JLabel("New label");
		ImageIcon icon_up2 = new ImageIcon("어깨너비.png");
		meCloth2_up.setIcon(icon_up2);
		meCloth2_up.setBounds(407, 202, 166, 23);
		panel_up.add(meCloth2_up);
		
		tf5_up = new JTextField();
		tf5_up.setColumns(10);
		tf5_up.setBounds(407, 222, 166, 30);
		panel_up.add(tf5_up);
		
		JLabel meCloth3_up = new JLabel("New label");
		ImageIcon icon_up3 = new ImageIcon("가슴둘레.png");
		meCloth3_up.setIcon(icon_up3);
		meCloth3_up.setBounds(407, 260, 166, 23);
		panel_up.add(meCloth3_up);
		
		tf6_up = new JTextField();
		tf6_up.setColumns(10);
		tf6_up.setBounds(407, 280, 166, 30);
		panel_up.add(tf6_up);
		
		JLabel meCloth4_up = new JLabel("New label");
		ImageIcon icon_up4 = new ImageIcon("팔길이.png");
		meCloth4_up.setIcon(icon_up4);
		meCloth4_up.setBounds(407, 320, 166, 23);
		panel_up.add(meCloth4_up);
		
		tf7_up = new JTextField();
		tf7_up.setColumns(10);
		tf7_up.setBounds(407, 340, 166, 30);
		panel_up.add(tf7_up);
		
		JLabel meCloth5_up = new JLabel("New label");
		ImageIcon icon_up5 = new ImageIcon("윗팔둘레.png");
		meCloth5_up.setIcon(icon_up5);
		meCloth5_up.setBounds(407, 380, 166, 23);
		panel_up.add(meCloth5_up);
		
		tf8_up = new JTextField();
		tf8_up.setColumns(10);
		tf8_up.setBounds(407, 400, 166, 30);
		panel_up.add(tf8_up);
		
		JLabel clothSize1_up = new JLabel("New label");
		clothSize1_up.setIcon(icon_up1);
		clothSize1_up.setBounds(766, 141, 166, 23);
		panel_up.add(clothSize1_up);
		
		tf444_up = new JTextField();
		tf444_up.setColumns(10);
		tf444_up.setBounds(766, 161, 166, 30);
		panel_up.add(tf444_up);
		
		JLabel clothSize2_up = new JLabel("New label");
		clothSize2_up.setIcon(icon_up2);
		clothSize2_up.setBounds(766, 202, 166, 23);
		panel_up.add(clothSize2_up);
		
		tf555_up = new JTextField();
		tf555_up.setColumns(10);
		tf555_up.setBounds(766, 222, 166, 30);
		panel_up.add(tf555_up);
		
		JLabel clothSize3_up = new JLabel("New label");
		clothSize3_up.setIcon(icon_up3);
		clothSize3_up.setBounds(766, 260, 166, 23);
		panel_up.add(clothSize3_up);
		
		tf666_up = new JTextField();
		tf666_up.setColumns(10);
		tf666_up.setBounds(766, 280, 166, 30);
		panel_up.add(tf666_up);
		
		JLabel clothSize4_up = new JLabel("New label");
		clothSize4_up.setIcon(icon_up4);
		clothSize4_up.setBounds(766, 320, 166, 23);
		panel_up.add(clothSize4_up);
		
		tf777_up = new JTextField();
		tf777_up.setColumns(10);
		tf777_up.setBounds(766, 340, 166, 30);
		panel_up.add(tf777_up);
		
		JLabel clothSize5_up = new JLabel("New label");
		clothSize5_up.setIcon(icon_up5);
		clothSize5_up.setBounds(766, 380, 166, 23);
		panel_up.add(clothSize5_up);
		
		tf888_up = new JTextField();
		tf888_up.setColumns(10);
		tf888_up.setBounds(766, 400, 166, 30);
		panel_up.add(tf888_up);
		
		tf44_up = new JTextField();
		tf44_up.setColumns(10);
		tf44_up.setBounds(588, 161, 166, 30);
		panel_up.add(tf44_up);
		
		tf55_up = new JTextField();
		tf55_up.setColumns(10);
		tf55_up.setBounds(586, 222, 166, 30);
		panel_up.add(tf55_up);
		
		tf66_up = new JTextField();
		tf66_up.setColumns(10);
		tf66_up.setBounds(586, 280, 166, 30);
		panel_up.add(tf66_up);
		
		tf77_up = new JTextField();
		tf77_up.setColumns(10);
		tf77_up.setBounds(586, 340, 166, 30);
		panel_up.add(tf77_up);
		
		tf88_up = new JTextField();
		tf88_up.setColumns(10);
		tf88_up.setBounds(588, 400, 166, 30);
		panel_up.add(tf88_up);
		
		JButton bup1 = new JButton("티셔츠");
		bup1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(true);
				panel_down.setVisible(false);
				
				clicktype = "티셔츠";
				cmtest.chui(clicktype);
			}
		});
		bup1.setBounds(29, 65, 97, 53);
		f.getContentPane().add(bup1);
		
		JButton bup2 = new JButton("셔츠");
		bup2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(true);
				panel_down.setVisible(false);
				
				clicktype = "셔츠";
				
				cmtest.chui(clicktype);
			}
		});
		bup2.setBounds(138, 65, 97, 53);
		f.getContentPane().add(bup2);
		
		JButton bup3 = new JButton("스웨터");
		bup3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(true);
				panel_down.setVisible(false);
				
				clicktype = "스웨터";
				
				cmtest.chui(clicktype);
			}
		});
		bup3.setBounds(247, 65, 97, 53);
		f.getContentPane().add(bup3);
		
		JButton bup4 = new JButton("후드티");
		bup4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(true);
				panel_down.setVisible(false);
				
				clicktype = "후드티";
				
				cmtest.chui(clicktype);
			}
		});
		bup4.setBounds(356, 65, 97, 53);
		f.getContentPane().add(bup4);
		
		JButton bdown1 = new JButton("면바지");
		bdown1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(false);
				panel_down.setVisible(true);
				
				clicktype = "면바지";
				
				cmtest2.chui(clicktype);
			}
		});
		bdown1.setBounds(523, 65, 97, 53);
		f.getContentPane().add(bdown1);
		
		JButton bdown2 = new JButton("청바지");
		bdown2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(false);
				panel_down.setVisible(true);
				
				clicktype = "청바지";
				
				cmtest2.chui(clicktype);
			}
		});
		bdown2.setBounds(632, 65, 97, 53);
		f.getContentPane().add(bdown2);
		
		JButton bdown3 = new JButton("운동바지");
		bdown3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(false);
				panel_down.setVisible(true);
				
				clicktype = "트레이닝바지";
				
				cmtest2.chui(clicktype);
			}
		});
		bdown3.setBounds(740, 65, 97, 53);
		f.getContentPane().add(bdown3);
		
		JButton bdown4 = new JButton("반바지");
		bdown4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_up.setVisible(false);
				panel_down.setVisible(true);
				
				clicktype = "반바지";
				
				cmtest2.chui(clicktype);
			}
		});
		bdown4.setBounds(850, 65, 97, 53);
		f.getContentPane().add(bdown4);
		
		panel_up.setVisible(false);
		panel_down.setVisible(false);
		
		f.setVisible(true);

	}
}
