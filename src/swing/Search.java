package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Search extends JFrame{
	private JTextField txtsearch;
	VO vo = new VO();
	DAO dao = new DAO();
 	@SuppressWarnings("rawtypes")
	Vector vdata = new Vector();
 	private JTable table;
	
	public Search() {
		super("아이디 찾기");
		
		System.out.println(vo.toString());
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
		
		JLabel lblNewLabel = new JLabel("아이디 찾기");
		lblNewLabel.setBounds(78, 0, 228, 61);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel pncontent = new JPanel();
		pncontent.setBounds(0, 190, 388, 197);
		pncontent.setBackground(new Color(255, 250, 240));
		panel.add(pncontent);
		pncontent.setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("이메일 주소를 입력해주세요.");
		lblNewLabel_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_1.setBounds(88, 52, 221, 38);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		panel.add(lblNewLabel_1);
		
		txtsearch = new JTextField();
		txtsearch.setBounds(82, 94, 210, 31);
		panel.add(txtsearch);
		txtsearch.setColumns(10);
		
		JButton btnsearch = new JButton("찾기");
		btnsearch.setBackground(Color.WHITE);
		btnsearch.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnsearch.setBounds(78, 149, 114, 31);
		panel.add(btnsearch);
		
		JButton btnexit = new JButton("나가기");
		btnexit.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnexit.setBackground(Color.WHITE);
		btnexit.setBounds(209, 149, 114, 31);
		panel.add(btnexit);
		
		JButton btnroot = new JButton("관리자권한");
		btnroot.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
		btnroot.setBackground(Color.WHITE);
		btnroot.setBounds(274, 0, 114, 31);
		panel.add(btnroot);
		
		
		Vector title = new Vector();
		title.add("번호");
		title.add("아이디");
		title.add("비밀번호");
		title.add("이메일");
		
//		vdata = dao.list();
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(vdata,title);
		
		table = new JTable(defaultTableModel);
		
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(12, 10, 364, 177);
		
		pncontent.add(scrollpane);
		
		
		setVisible(true);
		
		
		
		
		//아이디찾기
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = txtsearch.getText();
				if(search.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요");
					txtsearch.requestFocus();
					return;
				}
				vdata = dao.getSearch(search);
					defaultTableModel.setDataVector(vdata, title);
			}
		});
		
		
		//관리자
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passwo = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				if(passwo.equals("1234")) {
					JOptionPane.showMessageDialog(null, "관리자 화면으로 이동합니다.");
					new Root();
				}
				else {
					JOptionPane.showMessageDialog(null, "틀린 비밀번호입니다.");
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
		new Search();
	}
}
