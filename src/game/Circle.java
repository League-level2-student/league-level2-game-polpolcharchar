package game;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {

	int x;
	int y;
	
	double d;
	
	boolean growing;
	
	Circle(int startX, int startY){
		x = startX;
		y = startY;
		d = 20;
		growing = true;
	}
	
	
	void update() {
		if(growing) {
			d += 0.8;
		}
		//System.out.println("update");
	}
	
	
	void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval((int)x-((int)d/2), (int)x-((int)d/2), (int)d, (int)d);
	}
	
	
	
}
