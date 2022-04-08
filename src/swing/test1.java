package swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class test1 extends JFrame {
	private JPanel contentPane;
	int sw=0;
	JButton btn1;
	JButton btn11;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 frame = new test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test1() {
		setBackground(new Color(128, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		CardLayout card = new CardLayout();
		setResizable(false);  
		setLocationRelativeTo(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 668, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("챔프뽑기");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_5.setBounds(12, 0, 72, 28);
		panel_1.add(lblNewLabel_5);
		
		JButton btnde = new JButton("카드보기");
		btnde.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		btnde.setBackground(new Color(173, 216, 230));
		btnde.setBounds(146, 10, 97, 23);
		panel_1.add(btnde);
		
		JButton btnre = new JButton("다시하기");
		btnre.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		btnre.setBackground(new Color(176, 224, 230));
		btnre.setBounds(278, 10, 97, 23);
		panel_1.add(btnre);
		
		JButton btnsh = new JButton("섞기");
		btnsh.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		btnsh.setBackground(new Color(175, 238, 238));
		btnsh.setBounds(416, 10, 97, 23);
		panel_1.add(btnsh);
		
		JButton btnout = new JButton("나가기");
		btnout.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		btnout.setBackground(new Color(224, 255, 255));
		btnout.setBounds(547, 10, 97, 23);
		panel_1.add(btnout);
		
		JPanel sec2 = new JPanel();
		sec2.setBackground(SystemColor.textInactiveText);
		sec2.setBounds(128, 42, 134, 360);
		contentPane.add(sec2);
		sec2.setLayout(new CardLayout(0, 0));
		
		JButton btn2 = new JButton("랜덤챔프");
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("양재튼튼체B", Font.PLAIN, 15));
		btn2.setBackground(SystemColor.textInactiveText);
		sec2.add(btn2, "name_1676354911780000");
		
		JButton btn22 = new JButton("");
		btn22.setIcon(new ImageIcon("E:\\Javagreen(hoseong)\\html5_css3_javascript\\images\\lol 2.jpg"));
		sec2.add(btn22, "name_1677251731857900");
		
		JPanel sec3 = new JPanel();
		sec3.setBackground(SystemColor.textInactiveText);
		sec3.setBounds(264, 42, 134, 360);
		contentPane.add(sec3);
		sec3.setLayout(new CardLayout(0, 0));
		
		JButton btn3 = new JButton("랜덤챔프");
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("양재튼튼체B", Font.PLAIN, 15));
		btn3.setBackground(SystemColor.textInactiveText);
		sec3.add(btn3, "name_1676340554969000");
		
		JButton btn33 = new JButton("");
		btn33.setIcon(new ImageIcon("E:\\Javagreen(hoseong)\\html5_css3_javascript\\images\\lol 3.jpg"));
		sec3.add(btn33, "name_1677249299394000");
		
		JPanel sec4 = new JPanel();
		sec4.setBackground(SystemColor.textInactiveText);
		sec4.setBounds(399, 42, 134, 360);
		contentPane.add(sec4);
		sec4.setLayout(new CardLayout(0, 0));
		
		JButton btn4 = new JButton("랜덤챔프");
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("양재튼튼체B", Font.PLAIN, 15));
		btn4.setBackground(SystemColor.textInactiveText);
		sec4.add(btn4, "name_1676338610383300");
		
		JButton btn44 = new JButton("");
		btn44.setIcon(new ImageIcon("E:\\Javagreen(hoseong)\\html5_css3_javascript\\images\\lol 4.jpg"));
		sec4.add(btn44, "name_1677247175994900");
		
		JPanel sec5 = new JPanel();
		sec5.setBackground(SystemColor.textInactiveText);
		sec5.setBounds(534, 42, 134, 360);
		contentPane.add(sec5);
		sec5.setLayout(new CardLayout(0, 0));
		
		JButton btn5 = new JButton("랜덤챔프");
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("양재튼튼체B", Font.PLAIN, 15));
		btn5.setBackground(SystemColor.textInactiveText);
		sec5.add(btn5, "name_1676333901591200");
		
		JButton btn55 = new JButton("");
		btn55.setIcon(new ImageIcon("E:\\Javagreen(hoseong)\\html5_css3_javascript\\images\\lol 5.jpg"));
		sec5.add(btn55, "name_1677243756948400");
		
		JPanel sec1 = new JPanel();
		sec1.setBackground(SystemColor.textInactiveText);
		sec1.setBounds(0, 42, 127, 360);
		contentPane.add(sec1);
		sec1.setLayout(new CardLayout(0, 0));
		
		
		btn1 = new JButton("랜덤챔프");
		btn1.setSelectedIcon(new ImageIcon("C:\\JavaGreen\\html5_css3_javascript\\images\\1.jpg"));
		btn1.setForeground(UIManager.getColor("Button.highlight"));
		btn1.setBackground(UIManager.getColor("Button.disabledForeground"));
		btn1.setFont(new Font("양재튼튼체B", Font.PLAIN, 15));
		sec1.add(btn1, "name_1675971064723200");
		
		btn11 = new JButton("");
		btn11.setIcon(new ImageIcon("E:\\Javagreen(hoseong)\\html5_css3_javascript\\images\\lol 1.jpg"));
		sec1.add(btn11, "name_1682371718077400");
		
		
//		add(sec1);
		
		setVisible(true);
//		int sw=0;

		
		
		
		
		
		//결정버튼
		btnde.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int deci = JOptionPane.showConfirmDialog(null, "카드를 보시겠습니까?","챔프 보기",JOptionPane.YES_NO_OPTION);
				if(deci == 0 ) {	
//					card.next(sec1);
					btn1.setVisible(false);
					btn11.setVisible(true);
					sw=1;
				}
				
				
			}
		});
		
		
		//다시하기버튼
		btnre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		//섞기버튼
		btnsh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//나가기버튼
		btnout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
//	btn11
	btn11.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(sw==1) {
				int ans = JOptionPane.showConfirmDialog(null, "이 카드를 선택하시겠습니까?","선택창",JOptionPane.YES_NO_OPTION);
				if(ans ==0) {
					JOptionPane.showMessageDialog(null, "선택하신 챔프는 입니다." );
				}
			}
		}
	});
	}
}
