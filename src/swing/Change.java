package swing;

import javax.swing.JFrame;

public class Change extends JFrame{
	public Change() {
		super(" 수정");
		
		setSize(400,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
		
		setVisible(true);
		

		
		
		
	}
	public static void main(String[] args) {
		new Change();
	}
}
