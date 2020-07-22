package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;

public class NoticeChange {

	public void NotiC() {

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

		JLabel ttitle = new JLabel("");
		ttitle.setBounds(115, 100, 357, 44);
		f.getContentPane().add(ttitle);
		ttitle.setText(Bbs.ntitles);

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

		try {
			List<String> retStr = new ArrayList<String>();
			File file = new File("E:/phj/java_project/FirstProject/src/ui/notice/" + Bbs.ntitles + ".txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = null;
			while ((str = br.readLine()) != null) {
				retStr.add(str);
			}
			for (int i = 0; i < retStr.size(); i++) {
				textArea.append(retStr.get(i) + "\n");
			}
			br.close();

		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		JButton btnNewButton = new JButton("변경하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "저장 되었습니다.");
				String day = now;

				NoticeDTO dto = new NoticeDTO();
				dto.setDay(day);

				NoticeDAO dao = new NoticeDAO();
				dao.update(dto);

				try {
					File fi = new File("E:/phj/java_project/FirstProject/src/ui/notice/" + Bbs.ntitles + ".txt");
					FileWriter fw = new FileWriter(fi, false);
					fw.write(textArea.getText() + "\n");
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

		if (!sign.equals("manager")) {
			textArea.setEditable(false);
			btnNewButton.setVisible(false);
		}

	}
}
