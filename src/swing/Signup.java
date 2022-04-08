package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Signup extends JFrame{
	private JTextField txtid;
	private JTextField txtmail;
	VO vo = new VO();
	DAO dao = new DAO();
	private JPasswordField txtpwd;
	
	public Signup() {
		super(" 회원가입");
		
		setSize(404,426);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(0, 0, 388, 387);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 0, 259, 55);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(51, 65, 93, 35);
		panel.add(lblNewLabel_1);
		
		txtid = new JTextField();
		txtid.setBounds(156, 71, 161, 28);
		panel.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(51, 131, 93, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이메일");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(51, 199, 93, 35);
		panel.add(lblNewLabel_1_1_1);
		
		txtmail = new JTextField();
		txtmail.setColumns(10);
		txtmail.setBounds(156, 206, 161, 28);
		panel.add(txtmail);
		
		JButton btncom = new JButton("가입하기");
		btncom.setForeground(new Color(0, 0, 102));
		btncom.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btncom.setBackground(Color.WHITE);
		btncom.setBounds(65, 308, 118, 35);
		panel.add(btncom);
		
		JButton btnexit = new JButton("취소");
		btnexit.setForeground(new Color(0, 0, 102));
		btnexit.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnexit.setBackground(Color.WHITE);
		btnexit.setBounds(199, 308, 118, 35);
		panel.add(btnexit);
		
		txtpwd = new JPasswordField();
		txtpwd.setBounds(156, 138, 161, 28);
		panel.add(txtpwd);
		
		setVisible(true);
		
		//회원가입
		btncom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtid.getText();
				String pwd = txtpwd.getText();
				String mail = txtmail.getText();
				
				vo = dao.searchid(id);
				
				if(id.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
					txtid.requestFocus();
				}
				else if(pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtpwd.requestFocus();
				}
				else if(mail.equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 입력하세요.");
					txtmail.requestFocus();
				}
//				else if(vo.getId().equals(id)) {
//					JOptionPane.showMessageDialog(null, "이미 가입한 아이디입니다.");
//					txtid.requestFocus();
//					txtid.setText("");
//					txtpwd.setText("");
//					txtmail.setText("");
//				}
				else {
					vo.setId(id);
					vo.setPwd(pwd);
					vo.setMail(mail);
					dao.signup(vo);
					JOptionPane.showMessageDialog(null, "회원가입 되었습니다");
					txtid.setText("");
					txtpwd.setText("");
					txtmail.setText("");
				}
			}
		});
		
		//엔터회원가입
		btncom.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String id = txtid.getText();
				String pwd = txtpwd.getText();
				String mail = txtmail.getText();
				
				vo = dao.searchid(id);
				
				if(id.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
					txtid.requestFocus();
				}
				else if(pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtpwd.requestFocus();
				}
				else if(mail.equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 입력하세요.");
					txtmail.requestFocus();
				}
				else if(vo.getId().equals(id)) {
					JOptionPane.showMessageDialog(null, "이미 가입한 아이디입니다.");
					txtid.requestFocus();
					txtid.setText("");
					txtpwd.setText("");
					txtmail.setText("");
				}
				else {
					vo.setId(id);
					vo.setPwd(pwd);
					vo.setMail(mail);
					dao.signup(vo);
					JOptionPane.showMessageDialog(null, "회원가입 되었습니다");
					txtid.setText("");
					txtpwd.setText("");
					txtmail.setText("");
				}	
			}
		});
		
		
		
		//나가기
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new Signup();
	}
}
