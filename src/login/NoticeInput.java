package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class NoticeInput {
	private static JTextField textField;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void noticeI() {
		
		String sign = login.Login.loginID;
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String now = date.format(time);
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(500, 500);
		f.setLocation(550, 200);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("공 지 사 항");
		lblNewLabel.setFont(new Font("궁서", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 160, 80);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("제   목");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 100, 81, 44);
		f.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(115, 100, 357, 44);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		

		JLabel lblNewLabel_1_1 = new JLabel("내   용");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(22, 154, 81, 44);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JTextArea textArea = new JTextArea(30, 20);
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(32, 208, 440, 243);
		f.getContentPane().add(textArea);

		JButton btnNewButton = new JButton("저장하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "저장 되었습니다.");
				String type = "공지";
				String title = textField.getText();
				String day = now;
				
				NoticeDTO dto = new NoticeDTO();
				dto.setType(type);
				dto.setTitle(title);
				dto.setWritter(sign);
				dto.setDay(day);
				
				NoticeDAO dao = new NoticeDAO();
				dao.insert(dto);
				
				try {
					File fi = new File("E:/phj/java_project/FirstProject/src/ui/notice/"+textField.getText()+".txt");
					FileWriter fw = new FileWriter(fi,false);
					fw.write(textArea.getText()+"\n");
					fw.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				f.dispose();
				Bbs.f2.dispose();
				Bbs b = new Bbs();
				b.bbs();
				
			}
		});
		btnNewButton.setBounds(375, 10, 97, 44);
		f.getContentPane().add(btnNewButton);	
		
		f.setVisible(true);
		
	}
}
