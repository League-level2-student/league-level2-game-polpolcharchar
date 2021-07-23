package game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	int x;
	int y;
	
	int speed;
	
	
	boolean up;
	boolean down;
	boolean left;
	boolean right;
	
	
	Player(int startX, int startY, int s){
		
		x = startX;
		y = startY;
		
		speed = s;
		
		
	}
	
	void update() {
		
		if(up) {
			y -= speed;
		}
		if(down) {
			y += speed;
		}
		if(left) {
			x -= speed;
		}
		if(right) {
			x += speed;
		}
		
	}
	
	
	void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x-10, y-10, 20, 20);
	}
	
	
	
	
	
}
