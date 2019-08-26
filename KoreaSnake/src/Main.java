import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame();
		GamePlay gameplay= new GamePlay();
		
		obj.setBounds(10, 10, 720, 850);
		obj.setBackground(Color.BLACK);
		obj.setResizable(true);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
		
	}

}
