package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener{

	int width;
	int height;
	
	Circle c = new Circle(100, 100);
	CircleManager m;
	
	Timer frameDraw;
	
	Player p;
	
	int score;
	
	
	Panel(int w, int h){
		width = w;
		height = h;
		m = new CircleManager(width, height, 100);
		frameDraw = new Timer(1000/60, this);
		frameDraw.start();
		startGrow();
		score = 0;
		
		
		p = new Player(300, 300, 8, width - 5, height - 35);
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
			score++;
			
			
			
			
		
	}

	
	
	
	
	
	void startGrow() {
		
		Timer test = new Timer(100, m);
		test.start();
		
		
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("a");
		m.circleDestroyDiameter += 0.02;
		m.playerX = p.x;
		m.playerY = p.y;
		repaint();
	}





















	
}
