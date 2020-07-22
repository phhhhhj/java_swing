package mainprogram;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.BottomDAO;
import manager.TopDAO;



public class UiDown {

	static int turner = 0;
	
	public void chui(String clicktype) {
		
		JFrame f = new JFrame();
		f.setSize(1000,700);
		f.getContentPane().setLayout(null);
		f.setLocation(500, 100);

		JPanel panel = new JPanel();
		
		panel.setVisible(false);
		
		DownDAO dao = new DownDAO();
		dao.downmain(); // main<== DownDAO 를 public void 변수() {} 변경해서 main자리에 변수 이름을 써준다. 실행완료.
		
		ArrayList downlist =DownDAO.list;
		// main(ui)에서 입력된 clicktype에 입력된 값이 DAO로 넘어가서 원하는 값을 가져온다.
		
		String[] alldowndown = new String[downlist.size()];
		
		for (int i = 0; i < alldowndown.length; i++) {
			alldowndown[i] = (String)downlist.get(i);
			
		}
		
		JButton b1 = new JButton();
		
		// 전 페이지에서 클릭된 카테고리 입력 받음 -> DAO에서 이 값을 조건으로 select
		BottomDAO dao2 = new BottomDAO();
		ArrayList<String> list = dao2.selectCate(clicktype);
		ImageIcon icon = new ImageIcon(list.get(turner)+".jpg");
		b1.setIcon(icon);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				
				DownCompare dc = new DownCompare();
				
				String[] choicedown = alldowndown[turner].split("#");
				

				//choicedown[0] = 넘버
				//choicedown[1] = 종류
				//choicedown[2] = 모델명
				//choicedown[3] = 브랜드
				String[] downsize = choicedown[4].split(",");
				String[] downwaist = choicedown[5].split(",");
				String[] downlength = choicedown[6].split(",");
				String[] downthigh = choicedown[7].split(",");
				
				for (int i = 0; i < downsize.length; i++) { //임의로 3의 값을 넣고 db를 이용할 때 list값을 추출해서 쓸거야.알아둬.
					JButton sizebtn = new JButton(downsize[i]);
					int detect = i;
					sizebtn.setFont(new Font("굴림", Font.PLAIN, 30));
					sizebtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							
								
								Main.tf1_down.setText(choicedown[2]);
								Main.tf2_down.setText(downsize[detect]);
								Main.tf3_down.setText(choicedown[3]);
								
								Main.tf666_down.setText(downwaist[detect]);
								Main.tf444_down.setText(downlength[detect]);
								Main.tf888_down.setText(downthigh[detect]);
							
								
								dc.downcompare(); //*****************
								f.dispose();
						}
					});
					panel.add(sizebtn);
				}
				
			}
		});
		b1.setBounds(151, 10, 677, 499);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<<");
		b2.setFont(new Font("굴림", Font.PLAIN, 50));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turner--;
				if (turner < 0) {
					turner = alldowndown.length-1;
					panel.removeAll();
					panel.setVisible(false);
				} else {
					panel.removeAll();
					panel.setVisible(false);
				}
				ImageIcon icon = new ImageIcon(list.get(turner)+".jpg");
				b1.setIcon(icon);
			}
		});
		b2.setBounds(12, 10, 127, 499);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton(">>");
		b3.setFont(new Font("굴림", Font.PLAIN, 50));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turner++;
				if (turner >= alldowndown.length) {
					turner = 0;
					panel.removeAll();
					panel.setVisible(false);
				}else {
					panel.removeAll();
					panel.setVisible(false);
				}
				ImageIcon icon = new ImageIcon(list.get(turner)+".jpg");
				b1.setIcon(icon);
			}
		});
		b3.setBounds(840, 10, 127, 499);
		f.getContentPane().add(b3);
		
		panel.setBackground(Color.PINK);
		panel.setBounds(154, 532, 674, 101);
		f.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		f.setVisible(true);

	}

}
