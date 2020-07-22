package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import mainprogram.Main;



public class LeaveMember {
   private static JTextField tbecause; // txt 파일로 저장하기 위해 static 값 지정
   private static JTextField tpw;
   private static JTextField tpw2;
   static String pwc;

   public void leave() {
      
      JFrame f = new JFrame();
      f.setLocation(500,40);
      f.getContentPane().setBackground(Color.WHITE);
      f.setSize(600,800);
      f.getContentPane().setLayout(null);
      
      JLabel lblNewLabel_3 = new JLabel("회원 탈퇴 페이지");
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 40));
      lblNewLabel_3.setBackground(Color.YELLOW);
      lblNewLabel_3.setBounds(12, 35, 560, 125);
      f.getContentPane().add(lblNewLabel_3);
      
      JLabel lblNewLabel_1 = new JLabel("아 이 디");
      lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      f.getContentPane().add(lblNewLabel_1);
      
      JLabel id_label = new JLabel("");
      id_label.setBounds(163, 170, 307, 62);
      f.getContentPane().add(id_label);
      
      JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
      lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
      lblNewLabel_1_1.setBounds(40, 270, 100, 50);
      f.getContentPane().add(lblNewLabel_1_1);
      
      JLabel lblNewLabel_2_1 = new JLabel("(필수)");
      lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2_1.setBounds(482, 290, 57, 15);
      f.getContentPane().add(lblNewLabel_2_1);
      
      JLabel lblNewLabel_2_2 = new JLabel("(필수)");
      lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2_2.setBounds(482, 388, 57, 15);
      f.getContentPane().add(lblNewLabel_2_2);
      
      tpw = new JTextField();
      tpw.setColumns(10);
      tpw.setBounds(163, 270, 307, 50);
      f.getContentPane().add(tpw);
      
      JLabel lblNewLabel_1_2 = new JLabel("비밀번호 확인");
      lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 15));
      lblNewLabel_1_2.setBounds(40, 370, 100, 50);
      f.getContentPane().add(lblNewLabel_1_2);
      
      tpw2 = new JTextField();
      tpw2.setColumns(10);
      tpw2.setBounds(163, 370, 307, 50);
      f.getContentPane().add(tpw2);
      
      JLabel lblNewLabel_1_2_1 = new JLabel("탈퇴 사유");
      lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
      lblNewLabel_1_2_1.setBounds(40, 470, 100, 50);
      f.getContentPane().add(lblNewLabel_1_2_1);
            
      tbecause = new JTextField();
      tbecause.setColumns(10);
      tbecause.setBounds(163, 470, 307, 165);
      f.getContentPane().add(tbecause);
      
      // id label에 해당 id를 보여주기 위해 
      // static에 저장한 로그인된 아이디를 이용해  db에서 select해서 가져온다.
      String sign = login.Login.loginID;
      MemberDTO dto = new MemberDTO();
      dto.setId(sign);
      MemberDAO dao = new MemberDAO();
      MemberDTO dtoc = dao.select(dto);
      if (dtoc != null) {
         // 라벨에 출력
         id_label.setText(dtoc.getId());
         pwc = dtoc.getPw();
      }
      
      JButton btnNewButton_2_1_1 = new JButton("홈으로");
      btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
      btnNewButton_2_1_1.setBounds(271, 10, 97, 23);
      f.getContentPane().add(btnNewButton_2_1_1);
      
      JButton btnNewButton_2_1 = new JButton("MyPage");
      btnNewButton_2_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // 마이페이지로 이동
        	Mypage my = new Mypage();
            my.my();
            // 페이지 닫기
            f.dispose();
         }
      });
      btnNewButton_2_1.setBounds(373, 10, 97, 23);
      f.getContentPane().add(btnNewButton_2_1);
      
      JButton btnNewButton_2 = new JButton("로그아웃");
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	Login.main(null);
			f.dispose();
			Main.f.dispose();
         }
      });
      btnNewButton_2.setBounds(475, 10, 97, 23);
      f.getContentPane().add(btnNewButton_2);
      
      JButton btnNewButton = new JButton("취  소");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	Mypage my = new Mypage();
            my.my();
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
            } else if(tpw.getText().equals(pwc) && tpw2.getText().equals(pwc)) {
               // 다른 조건들 만족시
               JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.");
               try {
                  // 탈퇴 사유를 leaves 폴더에 사용자 이름으로 저장
                  File file = new File("E:/phj/java_project/FirstProject/src/ui/leaves/"+sign+".txt");
                  // 동일한 아이디가 탈퇴를 해서 이미 파일이 있을경우 아래 두번째 인자를 true로 하여 이어쓰기로 사용
                  // false를 하여 덮어쓰기를 사용하면 이전 사용자의 사유가 지워지므로
                  FileWriter fw = new FileWriter(file,true);
                  fw.write(tbecause.getText()+"\n");
                  fw.close();
               } catch (Exception e1) {
                  e1.printStackTrace();
               }
               
               // members db에 있는 회원 정보를 삭제
               MemberDTO dtom = new MemberDTO();
               dtom.setId(sign);
               MemberDAO daom = new MemberDAO();
               daom.delete(dtom);
               
               // size db에 있는 회원 정보를 삭제
               SizeDTO dtos = new SizeDTO();
               dtos.setId(sign);
               SizeDAO daos = new SizeDAO();
               daos.delete(dtos);
               
               // 완료 후 행동
               Login.main(null);
               f.dispose();
               Main.f.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요.");
            } 
         }
      });
      btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
      btnNewButton_1.setBounds(350, 680, 120, 50);
      f.getContentPane().add(btnNewButton_1);
      
      f.setVisible(true);
   }
}