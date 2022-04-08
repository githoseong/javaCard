package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Root extends JFrame{
	private JTable table2;
	VO vo = new VO();
	DAO dao = new DAO();
	Vector vdata = new Vector();
	private JTextField txtsearch;
	
	
	public Root() {
		super("관리자");
		
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
		
		JLabel lblNewLabel = new JLabel("회원 관리");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 0, 215, 41);
		panel.add(lblNewLabel);
		
		JPanel pncontent = new JPanel();
		pncontent.setBounds(0, 147, 388, 240);
		panel.add(pncontent);
		pncontent.setLayout(null);
		
		JLabel asd = new JLabel("no");
		asd.setFont(new Font("굴림", Font.PLAIN, 15));
		asd.setBounds(31, 68, 22, 15);
		panel.add(asd);
		
		JButton btnsearch = new JButton("검색");
		btnsearch.setFont(new Font("굴림", Font.PLAIN, 14));
		btnsearch.setBounds(154, 51, 64, 40);
		panel.add(btnsearch);
		
		JButton btnNewButton_1 = new JButton("수정");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 14));
		btnNewButton_1.setBounds(230, 51, 64, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("삭제");
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(306, 51, 64, 40);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("전체회원");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 14));
		btnNewButton_2.setBounds(118, 99, 152, 40);
		panel.add(btnNewButton_2);
		
		Vector title = new Vector();
		title.add("번호");
		title.add("아이디");
		title.add("비밀번호");
		title.add("이메일");
		
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(vdata,title);
		
		table2 = new JTable(defaultTableModel);
		table2.setFont(new Font("굴림", Font.PLAIN, 12));
		
		JScrollPane scrollpane = new JScrollPane(table2);
		scrollpane.setBounds(12, 10, 364, 177);
		
		pncontent.add(scrollpane);
		
		JButton btnNewButton_3 = new JButton("나가기");
		btnNewButton_3.setBounds(0, 0, 91, 27);
		panel.add(btnNewButton_3);
		
		txtsearch = new JTextField();
		txtsearch.setBounds(53, 63, 91, 26);
		panel.add(txtsearch);
		txtsearch.setColumns(10);
		
		
		
		setVisible(true);
		
		table2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = table2.getSelectedRow();
				TableModel tdata = table2.getModel();
				String menu = (String) tdata.getValueAt(row, 1);
				txtsearch.setText(menu);
			}
		});
		
		
		
		
		//검색
//		btnsearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int idx = Integer.parseInt(txtsearch.getText()); 
////				int idx=1;
////				vo = dao.getSearch(idx);
////				vdata = dao.getSearch(idx);
//				vo.setIdx(idx);
//				dao.search(vo);
//				if(vo.getIdx() == idx) {
//					System.out.println(dao.search(vo));
//				}
//			}
//		});
		
		
		
		//전체회원
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vdata = dao.list();
//				DefaultTableModel defaultTableModel = new DefaultTableModel(vdata,title);
				defaultTableModel.setDataVector(vdata, title);
			}
		});
		
		//삭제하기
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao.delete(txtsearch.getText());
				JOptionPane.showMessageDialog(null, "회원이 삭제되었습니다.");
			}
		});
		
		
		
		
		
		
	//나가기
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		
	}
	public static void main(String[] args) {
		new Root();
	}
}
