package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener, KeyListener{

	int width;
	int height;
	
	Circle c = new Circle(100, 100);
	CircleManager m;
	
	Timer frameDraw;
	
	Player p;
	
	
	Panel(int w, int h){
		width = w;
		height = h;
		m = new CircleManager(width, height);
		frameDraw = new Timer(1000/60, this);
		frameDraw.start();
		startGrow();
		
		
		p = new Player(300, 300, 8);
	}
	
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		//g.drawLine(100, 100, 200, 200);
		
		//for(int i = 0; i<10; i++) {
			
			g.setColor(Color.black);
			g.fillRect(0, 0, width, height);
			//m.g = g;
			
			//c.update();
			//c.draw(g);
			m.draw(g);
			p.update();
			p.draw(g);
			
			
			
			
		
	}

	
	
	
	
	
	void startGrow() {
		
		Timer test = new Timer(100, m);
		test.start();
		
		
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("a");
		repaint();
	}









	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 'a') {
			p.left = true;
		}
		if(e.getKeyChar() == 's') {
			p.down = true;
		}
		if(e.getKeyChar() == 'd') {
			p.right = true;
		}
		if(e.getKeyChar() == 'w') {
			p.up = true;
		}
	}









	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyChar() == 'a') {
			p.left = false;
		}
		if(e.getKeyChar() == 's') {
			p.down = false;
		}
		if(e.getKeyChar() == 'd') {
			p.right = false;
		}
		if(e.getKeyChar() == 'w') {
			p.up = false;
		}
		
		
		
		
		
		
	}









	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
