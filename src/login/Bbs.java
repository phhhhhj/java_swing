package login;

import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import mainprogram.Main;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Bbs {
	static String ntitles;
	static String qtitles;
	private static JTable tablen;
	private static JTable tableq;
	static JFrame f2;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void bbs() {

		String sign = login.Login.loginID;

		f2 = new JFrame();

		f2.setSize(1100, 650);
		f2.setLocation(250, 80);
		f2.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("고객 센터");
		lblNewLabel.setFont(new Font("궁서체", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 220, 100);
		f2.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("홈으로");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f2.dispose();
			}
		});
		btnNewButton.setBounds(740, 10, 97, 23);
		f2.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("mypage");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mypage my = new Mypage();
				my.my();
				f2.dispose();
			}
		});
		btnNewButton_1.setBounds(849, 10, 114, 23);
		f2.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("로그아웃");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				f2.dispose();
				Main.f.dispose();
			}
		});
		btnNewButton_2.setBounds(975, 10, 97, 23);
		f2.getContentPane().add(btnNewButton_2);

		NoticeDAO daon = new NoticeDAO();
		ArrayList<NoticeDTO> listn = daon.select();
		Object[] titlen = { "no", "", "제목", "작성자", "작성일" };
		Object[][] coln = new Object[listn.size()][];
		for (int i = 0; i < listn.size(); i++) {
			NoticeDTO dto = listn.get(i);
			Object[] row = new Object[5];
			String num = Integer.toString(dto.getNo());
			row[0] = num;
			row[1] = dto.getType();
			row[2] = dto.getTitle();
			row[3] = dto.getWritter();
			row[4] = dto.getDay();
			coln[i] = row;
		}
		tablen = new JTable(coln, titlen);
		JScrollPane scrollPanen = new JScrollPane(tablen);
		scrollPanen.setBounds(32, 180, 1040, 194);
		f2.getContentPane().add(scrollPanen);
		DefaultTableCellRenderer dtcrn = new DefaultTableCellRenderer();
		dtcrn.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcmn = tablen.getColumnModel();
		for (int i = 0; i < tcmn.getColumnCount(); i++) {
			tcmn.getColumn(i).setCellRenderer(dtcrn);
		}

		if (sign.equals("manager")) {
			tablen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int idxr = tablen.getSelectedRow();
					int idx2 = 2;
					String location = String.valueOf(tablen.getValueAt(idxr, idx2));
					ntitles = location;
					NoticeChange ch = new NoticeChange();
					ch.NotiC();
				}
			});
		} else {
			tablen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int idx = tablen.getSelectedRow();
					int idx2 = 2;
					String location = String.valueOf(tablen.getValueAt(idx, idx2));
					ntitles = location;
					NoticeChange ch = new NoticeChange();
					ch.NotiC();
				}
			});
		}

		f2.setVisible(true);

		JLabel lblNewLabel_1 = new JLabel("공지사항");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 120, 150, 50);
		f2.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton_3 = new JButton("글쓰기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoticeInput input = new NoticeInput();
				input.noticeI();
			}
		});
		btnNewButton_3.setBounds(184, 145, 97, 25);
		f2.getContentPane().add(btnNewButton_3);

		if (sign.equals("manager")) {
			btnNewButton_3.setVisible(true);
			btnNewButton_3.setEnabled(true);
		} else {
			btnNewButton_3.setVisible(false);
			btnNewButton_3.setEnabled(false);
		}

		QnADAO daoq = new QnADAO();
		ArrayList<QnADTO> listq = daoq.select();
		Object[] titleq = { "no", "", "제목", "작성자", "작성일" };
		Object[][] colq = new Object[listq.size()][];
		for (int i = 0; i < listq.size(); i++) {
			QnADTO dto = listq.get(i);
			Object[] row = new Object[5];
			String num = Integer.toString(dto.getNo());
			row[0] = num;
			row[1] = dto.getType();
			row[2] = dto.getTitle();
			row[3] = dto.getWritter();
			row[4] = dto.getDay();
			colq[i] = row;
		}
		tableq = new JTable(colq, titleq);
		JScrollPane scrollPaneq = new JScrollPane(tableq);
		scrollPaneq.setBounds(32, 444, 1040, 157);
		f2.getContentPane().add(scrollPaneq);
		DefaultTableCellRenderer dtcrq = new DefaultTableCellRenderer();
		dtcrq.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcmq = tableq.getColumnModel();
		for (int i = 0; i < tcmq.getColumnCount(); i++) {
			tcmq.getColumn(i).setCellRenderer(dtcrq);
		}

		if (sign.equals("manager")) {
			tableq.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int idx = tableq.getSelectedRow();
					int idx2 = 2;
					String name = String.valueOf(tableq.getValueAt(idx, idx2));
					qtitles = name;
					QnaChange an = new QnaChange();
					an.QnAan();
				}
			});
		} else {
			tableq.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int idx = tableq.getSelectedRow();
					int idx2 = 2;
					String name = String.valueOf(tableq.getValueAt(idx, idx2));
					qtitles = name;
					QnaChange qu = new QnaChange();
					qu.QnAan();
				}
			});
		}

		f2.setVisible(true);

		JLabel lblNewLabel_2 = new JLabel("QnA");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 384, 150, 50);
		f2.getContentPane().add(lblNewLabel_2);

		JButton btnNewButton_4 = new JButton("글쓰기");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QnaInput qu = new QnaInput();
				qu.QnAqu();
			}
		});
		btnNewButton_4.setBounds(184, 409, 97, 25);
		f2.getContentPane().add(btnNewButton_4);

		if (sign.equals("manager")) {
			btnNewButton_4.setVisible(false);
			btnNewButton_4.setEnabled(false);
		} else {
			btnNewButton_4.setVisible(true);
			btnNewButton_4.setEnabled(true);
		}

		f2.setVisible(true);
	}
}
