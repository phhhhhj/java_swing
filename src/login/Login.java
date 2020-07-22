package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import mainprogram.UiSizeDaoTest;
import mainprogram.UiSizeMethodClass;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login { // 로그인 기본화면

	// 광역변수 설정 아이디 정보에 대한 변수 loginID는 직접 생성, 텍스트필드는 자동생성
	public static String loginID;
	private static JTextField tid;
	private static JTextField tpw;

	public static void main(String[] args) { // 가장 먼저 실행되므로 main으로
		JFrame f = new JFrame(); // ui창 생성
		f.setLocation(600, 200); // ui창 위치 조정
		f.setSize(400, 500); // ui창 크기 조정
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("이 옷 나한테 맞을까?");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 23, 324, 70);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(49, 165, 90, 60);
		f.getContentPane().add(lblNewLabel_1);

		tid = new JTextField();
		tid.setBounds(151, 165, 202, 60);
		f.getContentPane().add(tid);
		tid.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(50, 235, 90, 60);
		f.getContentPane().add(lblNewLabel_1_1);

		tpw = new JTextField();
		tpw.setColumns(10);
		tpw.setBounds(152, 235, 202, 60);
		f.getContentPane().add(tpw);

		JButton login = new JButton("로그인"); // 로그인 버튼
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭시 수행할 명령
				if (tid.getText().equals("") || tpw.getText().equals("")) { // textfield가 'id', 'pw' 둘 다 공백일 경우
					JOptionPane.showMessageDialog(null, "아이디, 비밀번호를 입력해주세요.");
				} else { // textfield가 공백이 아닐경우
					String id_check = tid.getText(); // 입력된 값을 변수에 저장(String으로)
					String pw_check = tpw.getText();
					MemberDTO dto = new MemberDTO(); // member_DTO와 dto로 연결
					dto.setId(id_check); // dto의 id변수를 textfield에서 입력받아 저장한 변수로 변경
					MemberDAO dao = new MemberDAO(); // DAO를 이용하기 위해 dao로 연결
					MemberDTO dto2 = dao.select(dto); // dto에 저장한 id변수를 이용하여 dao에서 select 수행하여 id에 대한 member정보를 dto2에
														// 저장
					if (dto2 != null) { // select의 결과 dto2를 이용하여 조건문 실행
						// null이 아니면 입력한 아이디와 동일한 id가 DB에 존재한다면 다음 조건문 실행
						// 가져온 dto2 중 pw와 입력받은 비밀번호를 확인 수행
						if (!dto2.getPw().equals(pw_check)) { // 비밀번호가 일치할 경우
							JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
						} else { // 비밀번호가 일치하지 않는 경우
							JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
							loginID = id_check; // id와 pw가 맞아서 로그인 되면 입력된 id값을 static변수에 저장

							mainprogram.Main ma = new mainprogram.Main();
							ma.kshstart();

							f.dispose(); // 로그인창 닫음

							mainprogram.UiSizeDaoTest cmcmchage = new UiSizeDaoTest();
							cmcmchage.sizechage();

							mainprogram.UiSizeMethodClass caller = new UiSizeMethodClass();
							caller.UiSizeMethod();

						}
					} else { // 입력된 아이디가 DB에 존재하지 않아 dto2값이 null일 경우
						JOptionPane.showMessageDialog(null, "아이디가 없습니다.");
					}

				}
			}
		});
		login.setFont(new Font("굴림", Font.PLAIN, 25));
		login.setBounds(214, 320, 140, 60);
		f.getContentPane().add(login);

		JButton membership = new JButton("회원 가입"); // 회원가입 버튼
		membership.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼 입력시 아래 명령문 실행
				JoinMember sign = new JoinMember(); // sign변수로 sign_mem class에 연결
				sign.sign(); // class 실행
				f.dispose(); // 로그인 창 ui 닫음
			}
		});
		membership.setBounds(152, 412, 97, 23);
		f.getContentPane().add(membership);
		
		JButton exitbt = new JButton("끝내기"); // 프로그램 전체 종료 버튼
		exitbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 종료 확인하는 창 띄움 -> 예/아니오 중 선택
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", null, JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) { // 사용자가 예를 클릭하면
					JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
					System.exit(0); // 프로그램 종료
				}
			}
		});
		exitbt.setBounds(257, 412, 97, 23);
		f.getContentPane().add(exitbt);
		
		JLabel lblNewLabel_2 = new JLabel("<치수 비교 시스템>");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(29, 76, 324, 70);
		f.getContentPane().add(lblNewLabel_2);

		f.setVisible(true); // ui창이 모니터 화면에 출력하기 위해
	}
}
