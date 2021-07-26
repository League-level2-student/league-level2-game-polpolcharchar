package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main implements KeyListener, ActionListener{

	JFrame frame;
	Panel panel;
	StartPanel sp;
	EndPanel ep;
	
	Timer endCheck;
	
	
	
	String currentState = "start";
	
	int width = 1000;
	int height = 800;
	
	
	Main(){
		frame = new JFrame();
		endCheck = new Timer(1000/60, this);
		endCheck.start();
		//panel = new Panel(width, height);
		sp = new StartPanel(width, height);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Main game = new Main();
		game.setup();
		
	}
	
	
	void setup() {
		frame.add(sp);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.addKeyListener(panel);
		frame.addKeyListener(this);
	
		
		
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		if(e.getKeyChar() == ' ' && currentState.equals("start")) {
			currentState = "game";
			
			frame.getContentPane().removeAll();
			sp = null;
			panel = new Panel(width, height);
			frame.add(panel);
			frame.pack();
			frame.setSize(width, height);
		}else if(e.getKeyChar() == 'r' && !currentState.equals("start")) {
			
			currentState = "start";
			
			frame.getContentPane().removeAll();
			panel = null;
			sp = new StartPanel(width, height);
			frame.add(sp);
			frame.pack();
			frame.setSize(width, height);
	
			
		}
		
		
		
		if(currentState.equals("game")) {
			if(e.getKeyChar() == 'a') {
				panel.p.left = true;
			}
			if(e.getKeyChar() == 's') {
				panel.p.down = true;
			}
			if(e.getKeyChar() == 'd') {
				panel.p.right = true;
			}
			if(e.getKeyChar() == 'w') {
				panel.p.up = true;
			}
		}
		
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(currentState.equals("game")) {
			if(e.getKeyChar() == 'a') {
				panel.p.left = false;
			}
			if(e.getKeyChar() == 's') {
				panel.p.down = false;
			}
			if(e.getKeyChar() == 'd') {
				panel.p.right = false;
			}
			if(e.getKeyChar() == 'w') {
				panel.p.up = false;
			}
		}
			
		
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState.equals("game") && panel.m.gameEnd == true) {
			int score = panel.score;
			
			
			currentState = "end";
			
			frame.getContentPane().removeAll();
			panel = null;
			ep = new EndPanel(width, height, score);
			frame.add(ep);
			frame.pack();
			frame.setSize(width, height);
	
			
		}
		
		
		
		
	}
	
}
