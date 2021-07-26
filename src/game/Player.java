package game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	int x;
	int y;
	
	int speed;
	
	int width;
	int height;
	
	
	boolean up;
	boolean down;
	boolean left;
	boolean right;
	
	
	Player(int startX, int startY, int s, int w, int h){
		
		width = w;
		height = h;
		
		x = startX;
		y = startY;
		
		speed = s;
		
		
	}
	
	void update() {
		
		if(up) {
			if(y - speed < 0) {
				y = 0;
			}else {
				y -= speed;
			}
		}
		if(down) {
			if(y + speed > height) {
				y = height;
			}else {
				y += speed;
			}
		}
		if(left) {
			if(x - speed < 0) {
				x = 0;
			}else {
				x -= speed;
			}
		}
		if(right) {
			if(x + speed > width) {
				x = width;
			}else {
			x += speed;
			}
		}
		
	}
	
	
	void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x-10, y-10, 20, 20);
	}
	
	
	
	
	
}
