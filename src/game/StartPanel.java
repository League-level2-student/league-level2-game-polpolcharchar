package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class StartPanel extends JPanel implements ActionListener{

	
	int width;
	int height;
	
	
	Timer frameDraw;
	
	Font titleFont;
	Font smallFont;
	
	
	
	
	StartPanel(int w, int h){
		width = w;
		height = h;
		
		
		frameDraw = new Timer(1000/60, this);
		frameDraw.start();
		
		titleFont = new Font("Arial", Font.PLAIN,70);
		smallFont = new Font("Arial", Font.PLAIN, 20);
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillRect(0, 0, width, height);
		
		
		g.setColor(Color.RED);
		g.setFont(titleFont);
		g.drawString("Welcome to Circle Dodger!", 10, 60);
		
		g.setFont(smallFont);
		g.drawString("Dodge red circles as difficulty increases!", 10, 150);
		g.drawString("Use WASD to control you, the blue circle!", 10, 200);
		g.drawString("Press SPACE to start!", 10, 250);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	
}
