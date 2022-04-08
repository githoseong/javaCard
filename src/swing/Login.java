package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	private JTextField txtid;
	VO vo = new VO();
	DAO dao = new DAO();
	private JPasswordField txtpwd;
	
	
	public Login() {
		super("로그인 창");
		
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
		
		JButton btnexit = new JButton("종 료");
		btnexit.setForeground(new Color(255, 255, 102));
		btnexit.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		btnexit.setBackground(new Color(0, 0, 51));
		btnexit.setBounds(575, 453, 128, 52);
		panel.add(btnexit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(37, 54, 279, 370);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setToolTipText("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(12, 41, 103, 31);
		panel_1.add(lblNewLabel_1_1);
		
		txtid = new JTextField();
		txtid.setBounds(24, 79, 184, 31);
		panel_1.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1_1.setToolTipText("");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(12, 138, 103, 31);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("LEAGUE of LEGENDS");
		lblNewLabel_1_1_2.setToolTipText("");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 102));
		lblNewLabel_1_1_2.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_1_1_2.setBounds(50, 0, 196, 31);
		panel_1.add(lblNewLabel_1_1_2);
		
		JButton btnlogin = new JButton("로그인");
		btnlogin.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		btnlogin.setBackground(SystemColor.controlHighlight);
		btnlogin.setBounds(24, 222, 97, 31);
		panel_1.add(btnlogin);
		
		JButton btnsignup = new JButton("회원가입");
		btnsignup.setBackground(SystemColor.controlHighlight);
		btnsignup.setForeground(new Color(51, 102, 255));
		btnsignup.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnsignup.setBounds(22, 285, 109, 33);
		panel_1.add(btnsignup);
		
		JButton btnsearch = new JButton("아이디찾기");
		btnsearch.setForeground(new Color(51, 102, 255));
		btnsearch.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnsearch.setBackground(SystemColor.controlHighlight);
		btnsearch.setBounds(143, 285, 109, 33);
		panel_1.add(btnsearch);
		
		txtpwd = new JPasswordField();
		txtpwd.setBounds(24, 171, 184, 31);
		panel_1.add(txtpwd);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 715, 515);
		lblNewLabel.setIcon(new ImageIcon("D:\\JavaGreen(hoseong)\\html5_css3_javascript\\images\\lol 12.jpg"));
		panel.add(lblNewLabel);
		
		setVisible(true);
		
		
		//로그인
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				VO vo = new VO();
				String id = txtid.getText();
				String pwd = txtpwd.getText();
				vo = dao.login(id,pwd);
				if(id.equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
					txtid.requestFocus();
					return;
				}
				else if(pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtpwd.requestFocus();
					return;
				}
				
				if(vo.getId().equals(id) && vo.getPwd().equals(pwd)) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
					new Main(vo);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "아이디가 없습니다.");
				}
			}
		});
		
		//엔터로그인
		btnlogin.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String id = txtid.getText();
				String pwd = txtpwd.getText();
				vo = dao.login(id,pwd);
				if(id.equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
					txtid.requestFocus();
					return;
				}
				else if(pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtpwd.requestFocus();
					return;
				}
				
				if(vo.getId().equals(id) && vo.getPwd().equals(pwd)) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
					new Main(vo);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "아이디가 없습니다.");
				}
			}
		});
		
		
		
		//회원가입
		btnsignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Signup();
			}
		});
		
		
		//아이디찾기
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Search();
			}
		});
		
		
		//종료
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		new Login();
	}
}
