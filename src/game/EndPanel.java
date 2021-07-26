package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class EndPanel extends JPanel implements ActionListener{

	
	

	int width;
	int height;
	
	int score;
	
	
	Timer frameDraw;
	
	Font titleFont;
	
	
	
	
	
	EndPanel(int w, int h, int s){
		width = w;
		height = h;
		score = s;
		
		
		frameDraw = new Timer(1000/60, this);
		frameDraw.start();
		
		titleFont = new Font("Arial", Font.PLAIN,65);
		
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.red);
		g.fillRect(0, 0, width, height);
		
		g.setFont(titleFont);
		g.setColor(Color.black);
		g.drawString("GAME OVER!", 10, 60);
		g.drawString("Your score was: " + (score/10) + "!", 10, 120);
		g.drawString("Try again! Press R to restart!", 10, 180);
		
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	
	
}
