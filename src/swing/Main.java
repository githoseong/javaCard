package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Main extends JFrame{
	VO vvo = new VO();
	DAO dao = new DAO();
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

	
	private JTextField txtid;
	public Main(VO vo) {
		super("메인화면");
		
		setSize(731,554);
		setLocationRelativeTo(null);
		setResizable(false);
		
		System.out.println(vo.toString());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 715, 515);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnexit_1 = new JButton("종 료");
		btnexit_1.setForeground(new Color(255, 255, 102));
		btnexit_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnexit_1.setBackground(new Color(0, 0, 51));
		btnexit_1.setBounds(12, 448, 149, 57);
		panel.add(btnexit_1);
		
		JButton btnexit = new JButton("로그인 화면");
		btnexit.setForeground(new Color(255, 255, 102));
		btnexit.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnexit.setBackground(new Color(0, 0, 51));
		btnexit.setBounds(12, 376, 149, 57);
		panel.add(btnexit);
		
		JButton mychamp = new JButton();
		
		mychamp.setIcon(new ImageIcon(vo.getChamp()));
		mychamp.setFont(new Font("맑은 고딕", Font.PLAIN, 42));
		mychamp.setBackground(new Color(0, 0, 51));
		mychamp.setBounds(262, 80, 181, 368);
		panel.add(mychamp);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 13.jpg"));
		lblNewLabel_1.setBounds(0, 70, 715, 445);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 51));
		panel_1.setBounds(0, 0, 715, 78);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnstart = new JButton("게임시작");
		btnstart.setForeground(new Color(255, 255, 102));
		btnstart.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnstart.setBackground(new Color(0, 0, 102));
		btnstart.setBounds(560, 10, 143, 45);
		panel_1.add(btnstart);
		
		JButton btncard = new JButton("챔프선택");
		btncard.setForeground(new Color(255, 255, 102));
		btncard.setBackground(new Color(0, 0, 102));
		btncard.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btncard.setBounds(406, 10, 143, 45);
		panel_1.add(btncard);
		
		txtid = new JTextField();
		txtid.setEnabled(false);
		txtid.setText(vo.getId());
		txtid.setBackground(new Color(0, 0, 51));
		txtid.setForeground(new Color(0, 0, 102));
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setFont(new Font("맑은 고딕", Font.PLAIN, 19));
		txtid.setBounds(12, 10, 168, 35);
		panel_1.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("님 환영합니다!!");
		lblNewLabel.setForeground(new Color(255, 255, 102));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel.setBounds(192, 20, 112, 28);
		panel_1.add(lblNewLabel);
		
		JTextPane txtwin = new JTextPane();
		txtwin.setText(Integer.toString(vo.getWin())+"승");
		txtwin.setBackground(new Color(0, 0, 51));
		txtwin.setForeground(new Color(0, 204, 255));
		txtwin.setFont(new Font("맑은 고딕", Font.PLAIN, 19));
		txtwin.setBounds(303, 10, 56, 35);
		panel_1.add(txtwin);
		
		JTextPane txtlose = new JTextPane();
		txtlose.setText(Integer.toString(vo.getLose())+"패");
		txtlose.setForeground(Color.RED);
		txtlose.setFont(new Font("맑은 고딕", Font.PLAIN, 19));
		txtlose.setBackground(new Color(0, 0, 51));
		txtlose.setBounds(357, 10, 62, 35);
		panel_1.add(txtlose);
		
		
		setVisible(true);
		
		//메인게임
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Start(vo);
				dispose();
			}
		});
		
		
		//가운데카드
		mychamp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vo.champ.equals(이렐리아))	{
				JOptionPane.showMessageDialog(null, "이 카드는 이렐리아입니다.\n***체력***\n100");
				}
				else if(vo.champ.equals(조이)) {
					JOptionPane.showMessageDialog(null, "이 카드는 조이입니다.\n***체력***\n60");
				}
				else if(vo.champ.equals(유미)) {
					JOptionPane.showMessageDialog(null, "이 카드는 유미입니다.\n***체력***\n30");
				}
				else if(vo.champ.equals(카타리나)) {
					JOptionPane.showMessageDialog(null, "이 카드는 카타리나입니다.\n***체력***\n70");
				}
				else if(vo.champ.equals(베인)) {
					JOptionPane.showMessageDialog(null, "이 카드는 베인입니다.\n***체력***\n70");
				}
				else if(vo.champ.equals(쉬바나)) {
					JOptionPane.showMessageDialog(null, "이 카드는 쉬바나입니다.\n***체력***\n80");
				}
				else if(vo.champ.equals(쓰레쉬)) {
					JOptionPane.showMessageDialog(null, "이 카드는 쓰레쉬입니다.\n***체력***\n70");
				}
				else if(vo.champ.equals(트위스트페이트)) {
					JOptionPane.showMessageDialog(null, "이 카드는 트위스트페이트입니다.\n***체력***\n40");
				}
				else if(vo.champ.equals(세주아니)) {
					JOptionPane.showMessageDialog(null, "이 카드는 세주아니입니다.\n***체력***\n90");
				}
				else if(vo.champ.equals(리신)) {
					JOptionPane.showMessageDialog(null, "이 카드는 리신입니다.\n***체력***\n90");
				}
			}
		});
		
		
		
	//챔프선택
		btncard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Card(vo);
				dispose();
			}
		});
		
		
		//로그인화면
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); 
				new Login();
			}
		});
		
		
		//종료
		btnexit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
	}
}
