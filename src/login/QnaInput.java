package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import java.awt.Color;

public class QnaInput {

	private static JTextField textField_title;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void QnAqu() {
		
	
		String sign = login.Login.loginID;

		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String now = date.format(time);

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 500);
		f.setLocation(550, 200);
		f.getContentPane().setLayout(null);

		JLabel lblQNA = new JLabel("Q n A");
		lblQNA.setBackground(Color.LIGHT_GRAY);
		lblQNA.setHorizontalAlignment(SwingConstants.CENTER);
		lblQNA.setFont(new Font("Script MT Bold", Font.PLAIN, 30));
		lblQNA.setBounds(12, 10, 160, 80);
		f.getContentPane().add(lblQNA);

		JLabel Label_title = new JLabel("제   목");
		Label_title.setHorizontalAlignment(SwingConstants.CENTER);
		Label_title.setFont(new Font("굴림", Font.PLAIN, 15));
		Label_title.setBounds(22, 100, 81, 44);
		f.getContentPane().add(Label_title);

		textField_title = new JTextField();
		textField_title.setColumns(10);
		textField_title.setBounds(115, 100, 357, 44);
		f.getContentPane().add(textField_title);

		JLabel Label_Q = new JLabel("Q");
		Label_Q.setHorizontalAlignment(SwingConstants.CENTER);
		Label_Q.setFont(new Font("굴림", Font.BOLD, 25));
		Label_Q.setBounds(22, 154, 81, 44);
		f.getContentPane().add(Label_Q);

		JTextArea textArea_Question = new JTextArea(30, 20);
		textArea_Question.setBackground(Color.WHITE);
		textArea_Question.setBounds(32, 208, 440, 120);
		f.getContentPane().add(textArea_Question);

		JLabel Label_A = new JLabel("A");
		Label_A.setHorizontalAlignment(SwingConstants.CENTER);
		Label_A.setFont(new Font("굴림", Font.BOLD, 25));
		Label_A.setBounds(22, 338, 81, 44);
		f.getContentPane().add(Label_A);

		JTextArea textArea_Answer = new JTextArea(30, 20);
		textArea_Answer.setBackground(Color.WHITE);
		textArea_Answer.setBounds(32, 392, 440, 59);
		f.getContentPane().add(textArea_Answer);

		JButton Button_A = new JButton("답변하기");
		
		Button_A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "저장 되었습니다.");
				String type = "QnA";
				String title = textField_title.getText();
				String day = now;

				QnADTO dto = new QnADTO();
				dto.setType(type);
				dto.setTitle(title);
				dto.setWritter(sign);
				dto.setDay(day);

				QnADAO dao = new QnADAO();
				dao.update(dto);

				try {
					File fi = new File(
							"E:/phj/java_project/FirstProject/src/ui/QnA/" + textField_title.getText() + ".txt");
					FileWriter fw = new FileWriter(fi, true);
					fw.write(textArea_Answer.getText() + "\n");
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
		Button_A.setBounds(375, 10, 97, 44);
		f.getContentPane().add(Button_A);

		JButton Button_Q = new JButton("저장하기");
		Button_Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "저장 되었습니다.");
				String type = "Q";
				String title = textField_title.getText();
				String day = now;

				QnADTO dto = new QnADTO();
				dto.setType(type);
				dto.setTitle(title);
				dto.setWritter(sign);
				dto.setDay(day);

				QnADAO dao = new QnADAO();
				dao.insert(dto);

				try {
					File fi = new File(
							"E:/phj/java_project/FirstProject/src/ui/QnA/" + textField_title.getText() + ".txt");
					FileWriter fw = new FileWriter(fi, false);
					fw.write(textArea_Question.getText() + "\n");
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
		Button_Q.setBounds(375, 10, 97, 44);
		f.getContentPane().add(Button_Q);

		if (sign.equals("manager")) {
			Button_A.setVisible(true);
			Button_Q.setVisible(false);
			textArea_Answer.setEditable(true);

		} else {
			textArea_Answer.setEditable(false);
			Button_Q.setVisible(true);
			Button_A.setVisible(false);
			
		}

		f.setVisible(true);

	}
}
