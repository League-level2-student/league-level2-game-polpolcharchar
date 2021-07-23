package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener, KeyListener{

	int width;
	int height;
	
	
	Panel(int w, int h){
		width = w;
		height = h;
	}
	
	
	Circle c = new Circle(100, 100);
	
	
	@Override
	public void paintComponent(Graphics g) {
		//g.drawLine(100, 100, 200, 200);
		
		for(int i = 0; i<10; i++) {
			
			g.setColor(Color.black);
			g.fillRect(0, 0, width, height);
			
			
			c.update();
			c.draw(g);
			
			
											try {
			Thread.sleep(100);
											} catch (InterruptedException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
		}
	}

	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
