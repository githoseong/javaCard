package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Start extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	VO vvo = new VO();
	DAO dao = new DAO();
	int su=0;
	int hp=100;
	int cnt=0;
	int atk=0;
	int atk2=0;
	String 이렐리아 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 1.jpg";
	String 조이 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 2.jpg";
	String 유미 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 3.jpg";
	String 카타리나 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 4.jpg";
	String 베인 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 5.jpg";
	String 쉬바나 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 6.jpg";
	String 쓰레쉬 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 7.jpg";
	String 트위스트페이트 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 8.jpg";
	String 세주아니 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 9.jpg";
	String 리신 = "D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 10.jpg";
	int hp2=60,hp3=30,hp4=70,hp5=70,hp6=80,hp7=70,hp8=40,hp9=90,hp10=90;
	private JTextField txtname;
	private JTextField txtnameme;
	
	
	public Start(VO vo) {
		super("메인 게임");
		vvo = vo;
		setSize(731,554);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 715, 515);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		System.out.println(vvo.toString());
		
		JButton btnNewButton_3 = new JButton("나가기");
		btnNewButton_3.setForeground(new Color(255, 255, 204));
		btnNewButton_3.setToolTipText("");
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		btnNewButton_3.setBackground(new Color(0, 0, 102));
		btnNewButton_3.setBounds(583, 0, 120, 55);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 715, 44);
		lblNewLabel.setIcon(new ImageIcon("D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 16.jpg"));
		panel.add(lblNewLabel);
		
		JButton btnenemy = new JButton("?");
		btnenemy.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		btnenemy.setForeground(new Color(0, 0, 0));
		btnenemy.setToolTipText("");
		btnenemy.setBackground(new Color(153, 0, 0));
		btnenemy.setBounds(23, 65, 175, 347);
		panel.add(btnenemy);
		
		JButton btnme = new JButton("New button");
		btnme.setIcon(new ImageIcon(vo.getChamp()));
		btnme.setBounds(516, 65, 175, 347);
		panel.add(btnme);
		
		JButton btnattack = new JButton("공격");
		btnattack.setBounds(291, 436, 138, 69);
		btnattack.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		panel.add(btnattack);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 102));
		textField.setForeground(new Color(255, 0, 0));
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		textField.setText("상대방");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(34, 422, 149, 44);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("나");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(255, 255, 204));
		textField_1.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 0, 102));
		textField_1.setBounds(531, 422, 149, 44);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("VS");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(310, 218, 94, 69);
		panel.add(lblNewLabel_1);
		
		JTextPane txtenemy = new JTextPane();
		txtenemy.setBackground(new Color(0, 0, 51));
		txtenemy.setForeground(new Color(255, 0, 0));
		txtenemy.setFont(new Font("굴림", Font.BOLD, 22));
		txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
		txtenemy.setBounds(218, 65, 28, 266);
		panel.add(txtenemy);
		
		
		JTextPane txtme = new JTextPane();
		txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
		txtme.setForeground(Color.RED);
		txtme.setFont(new Font("굴림", Font.BOLD, 22));
		txtme.setBackground(new Color(0, 0, 51));
		txtme.setBounds(464, 65, 28, 266);
		panel.add(txtme);
		
		JLabel txtnameenemy = new JLabel("New label");
		txtnameenemy.setHorizontalAlignment(SwingConstants.CENTER);
		txtnameenemy.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		txtnameenemy.setForeground(new Color(255, 0, 0));
		txtnameenemy.setBounds(34, 470, 149, 35);
		
		JButton btnstart = new JButton("게임시작");
		btnstart.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnstart.setBounds(302, 276, 112, 44);
		panel.add(btnstart);
		
		txtname = new JTextField();
		txtname.setBackground(new Color(0, 0, 51));
		txtname.setForeground(new Color(255, 0, 0));
		txtname.setHorizontalAlignment(SwingConstants.CENTER);
		txtname.setFont(new Font("맑은 고딕", Font.PLAIN, 19));
		txtname.setBounds(34, 476, 148, 26);
		panel.add(txtname);
		txtname.setColumns(10);
		
		txtnameme = new JTextField();
		txtnameme.setHorizontalAlignment(SwingConstants.CENTER);
		txtnameme.setForeground(Color.RED);
		txtnameme.setFont(new Font("맑은 고딕", Font.PLAIN, 19));
		txtnameme.setColumns(10);
		txtnameme.setBackground(new Color(0, 0, 51));
		txtnameme.setBounds(531, 476, 148, 26);
		panel.add(txtnameme);
		
		JTextPane txtpnAa = new JTextPane();
		txtpnAa.setForeground(new Color(255, 0, 0));
		txtpnAa.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		txtpnAa.setText("100");
		txtpnAa.setBackground(new Color(0, 0, 51));
		txtpnAa.setBounds(214, 352, 53, 38);
		panel.add(txtpnAa);
		
		JTextPane txtpnAa_1 = new JTextPane();
		txtpnAa_1.setText("100");
		txtpnAa_1.setForeground(Color.RED);
		txtpnAa_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		txtpnAa_1.setBackground(new Color(0, 0, 51));
		txtpnAa_1.setBounds(451, 352, 53, 38);
		panel.add(txtpnAa_1);
		
		
		
		setVisible(true);
		
		//게임시작버튼
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				su = (int)((Math.random()*10)+1);
				if(su == 1 ) {
					btnenemy.setIcon(new ImageIcon(이렐리아));
					hp=100;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("이렐리아");
				}
				else if(su == 2) {
					btnenemy.setIcon(new ImageIcon(조이));
					hp=60;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("조이");
				}
				else if(su == 3) {
					btnenemy.setIcon(new ImageIcon(유미));
					hp=30;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■");
					txtname.setText("유미");
				}
				else if(su == 4) {
					btnenemy.setIcon(new ImageIcon(카타리나));
					hp=70;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("카타리나");
				}
				else if(su == 5) {
					btnenemy.setIcon(new ImageIcon(베인));
					hp=70;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("베인");
				}
				else if(su == 6) {
					btnenemy.setIcon(new ImageIcon(쉬바나));
					hp=80;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("쉬바나");
				}
				else if(su == 7) {
					btnenemy.setIcon(new ImageIcon(쓰레쉬));
					hp=70;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("쓰레쉬");
				}
				else if(su == 8) {
					btnenemy.setIcon(new ImageIcon(트위스트페이트));
					hp=40;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■");
					txtname.setText("트위스트페이트");
				}
				else if(su == 9) {
					btnenemy.setIcon(new ImageIcon(세주아니));
					hp=90;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("세주아니");
				}
				else if(su == 10) {
					btnenemy.setIcon(new ImageIcon(리신));
					hp=90;
					txtpnAa.setText(Integer.toString(hp));
					txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtname.setText("리신");
				}
				
				if(vo.getChamp().equals(이렐리아)) {
					hp=100;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("이렐리아");
				}
				else if(vo.getChamp().equals(조이)) {
					hp=60;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("조이");
				}
				else if(vo.getChamp().equals(유미)) {
					hp=30;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■");
					txtnameme.setText("유미");
				}
				else if(vo.getChamp().equals(카타리나)) {
					hp=70;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("카타리나");
				}
				else if(vo.getChamp().equals(베인)) {
					hp=70;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("베인");
				}
				else if(vo.getChamp().equals(쉬바나)) {
					hp=80;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("쉬바나");
				}
				else if(vo.getChamp().equals(쓰레쉬)) {
					hp=70;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("쓰레쉬");
				}
				else if(vo.getChamp().equals(트위스트페이트)) {
					hp=40;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■");
					txtnameme.setText("트위스트페이트");
				}
				else if(vo.getChamp().equals(세주아니)) {
					hp=90;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("세주아니");
				}
				else if(vo.getChamp().equals(리신)) {
					hp=90;
					txtpnAa_1.setText(Integer.toString(hp));
					txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■\r\n■");
					txtnameme.setText("리신");
				}
			}
		});
			
		//공격버튼
		btnattack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atk = (int)(Math.random()*20)+1;
				atk2 = (int)(Math.random()*20)+1;
				if(su==1) {
					hp -= atk;
					txtpnAa.setText(Integer.toString(hp));
					if(hp < 70) {
						txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp < 10) {
						txtenemy.setText("■");
					}
					if(hp <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==2) {
					hp2 -= atk;
					txtpnAa.setText(Integer.toString(hp2));
					if(hp2 < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp2 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp2 < 10) {
						txtenemy.setText("■");
					}
					if(hp2 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp2 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==3) {
					hp3 -= atk;
					txtpnAa.setText(Integer.toString(hp3));
					if(hp3 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp3 < 10) {
						txtenemy.setText("■");
					}
					if(hp3 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp3 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==4) {
					hp4 -= atk;
					txtpnAa.setText(Integer.toString(hp4));
					if(hp4 < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp4 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp4 < 10) {
						txtenemy.setText("■");
					}
					if(hp4 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp4 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==5) {
					hp5 -= atk;
					txtpnAa.setText(Integer.toString(hp5));
					if(hp5 < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp5 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp5 < 10) {
						txtenemy.setText("■");
					}
					if(hp5 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp5 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==6) {
					hp6 -= atk;
					txtpnAa.setText(Integer.toString(hp6));
					if(hp6 < 70) {
						txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp6 < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp6 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp6 < 10) {
						txtenemy.setText("■");
					}
					if(hp6 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp6 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==7) {
					hp7 -= atk;
					txtpnAa.setText(Integer.toString(hp7));
					if(hp7 < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp7 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp7 < 10) {
						txtenemy.setText("■");
					}
					if(hp7 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp7 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==8) {
					hp8 -= atk;
					txtpnAa.setText(Integer.toString(hp8));
					if(hp8 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp8 < 10) {
						txtenemy.setText("■");
					}
					if(hp8 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp8 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==9) {
					hp9-= atk;
					txtpnAa.setText(Integer.toString(hp9));
					if(hp9 < 70) {
						txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp9 < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp9 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp9 < 10) {
						txtenemy.setText("■");
					}
					if(hp9 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp9 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				else if(su==10) {
					hp10 -= atk;
					txtpnAa.setText(Integer.toString(hp10));
					if(hp10 < 70) {
						txtenemy.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp10 < 50) {
						txtenemy.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp10 < 30) {
						txtenemy.setText("■\r\n■");
					}
					if(hp10 < 10) {
						txtenemy.setText("■");
					}
					if(hp10 <= 0) {
						txtenemy.setText("");
						txtpnAa.setText("0");
						JOptionPane.showMessageDialog(null, "승리했습니다.\n**1승추가**");
						vo.setWin(vo.getWin()+1);
						vvo.setId(vo.getId());
						vvo.setWin(vo.getWin());
						dao.vic(vvo);
						vo.setWin(vvo.getWin());
						hp10 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
							if(aa == 0 ) {
								JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
								new Start(vo);
								dispose();
							}
							else {
								new Main (vo);
								dispose();
							}
						
					}
				}
				
				if(vo.champ.equals(이렐리아)) {
					hp -= atk2;
					txtpnAa_1.setText(Integer.toString(hp));
					if(hp < 70) {
						txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp < 10) {
						txtme.setText("■");
					}
					if(hp <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(조이)) {
					hp2 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp2));
					if(hp2 < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp2 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp2 < 10) {
						txtme.setText("■");
					}
					if(hp2 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp2 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(유미)) {
					hp3 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp3));
					if(hp3 < 10) {
						txtme.setText("■");
					}
					if(hp3 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp3 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(카타리나)) {
					hp4 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp4));
					if(hp4 < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp4 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp4 < 10) {
						txtme.setText("■");
					}
					if(hp4 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp4 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(베인)) {
					hp5 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp5));
					if(hp5 < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp5 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp5 < 10) {
						txtme.setText("■");
					}
					if(hp5 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp5 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(쉬바나)) {
					hp6 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp6));
					if(hp6 < 70) {
						txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp6 < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp6 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp6 < 10) {
						txtme.setText("■");
					}
					if(hp6 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp6 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(쓰레쉬)) {
					hp7 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp7));
					if(hp7 < 70) {
						txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp7 < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp7 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp7 < 10) {
						txtme.setText("■");
					}
					if(hp7 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp7 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(트위스트페이트)) {
					hp8 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp8));
					if(hp8 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp8 < 10) {
						txtme.setText("■");
					}
					if(hp8 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp8 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(세주아니)) {
					hp9 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp9));
					if(hp9 < 70) {
						txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp9 < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp9 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp9 < 10) {
						txtme.setText("■");
					}
					if(hp9 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp9 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
				
				else if(vo.champ.equals(리신)) {
					hp10 -= atk2;
					txtpnAa_1.setText(Integer.toString(hp10));
					if(hp10 < 70) {
						txtme.setText("■\r\n■\r\n■\r\n■\r\n■\r\n■");
					}
					if(hp10 < 50) {
						txtme.setText("■\r\n■\r\n■\r\n■");
					}
					if(hp10 < 30) {
						txtme.setText("■\r\n■");
					}
					if(hp10 < 10) {
						txtme.setText("■");
					}
					if(hp10 <= 0) {
						txtme.setText("");
						txtpnAa_1.setText("0");
						JOptionPane.showMessageDialog(null, "졌습니다 다시 도전하세요.\n**1패추가**");
						vo.setLose(vo.getLose()+1);
						vvo.setId(vo.getId());
						vvo.setLose(vo.getLose());
						dao.lose(vvo);
						vo.setLose(vvo.getLose());
						hp10 = 0;
						int aa = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?","진행메시지",JOptionPane.YES_NO_OPTION);
						if(aa == 0 ) {
							JOptionPane.showMessageDialog(null, "게임시작 버튼을 눌러주세요.");
							new Start(vo);
							dispose();
						}
						else {
							new Main(vo);
							dispose();
						}
					}
				}
			}
		});
		
		
		
		//나가기
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Main(vo);
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
	}
}
