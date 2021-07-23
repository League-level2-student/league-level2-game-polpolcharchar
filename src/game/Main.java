package game;

import javax.swing.JFrame;

public class Main {

	JFrame frame;
	Panel panel;
	
	int width = 1000;
	int height = 800;
	
	
	Main(){
		frame = new JFrame();
		panel = new Panel(1000, 800);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Main game = new Main();
		game.setup();
		
	}
	
	
	void setup() {
		frame.add(panel);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addKeyListener(panel);
	
		
		
		
	}
	
}
