package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class CircleManager implements ActionListener{

	ArrayList <Circle> circles = new ArrayList<>();
	Random r = new Random();
	
	int width;
	int height;
	
	Graphics g;
	
	
	double playerX;
	double playerY;
	
	double circleDestroyDiameter;
	
	boolean gameEnd;
	
	
	CircleManager(int w, int h, int d) {
		width = w;
		height = h;
		circleDestroyDiameter = d;
		gameEnd = false;
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		
		addCircle();
		
		
		updateCircles();
		
		destroyCircles();
		checkPlayerCollision();

	}
	
	
	void draw(Graphics g) {
		//c.draw(g);
		for(int i = 0; i < circles.size(); i++) {
			circles.get(i).draw(g);
		}
	}
	
	
	
	void addCircle() {
		boolean correct = false;
		int spawnX = 0;
		int spawnY = 0;
		while (!correct) {
			spawnX = r.nextInt(width);
			spawnY = r.nextInt(height);
			if(!touching((int)playerX, (int)playerY, spawnX, spawnY, 30)) {
				correct = true;
			}
		}
		
		
		circles.add(new Circle(spawnX, spawnY));
	}
	
	void updateCircles() {
		for(int i = 0; i < circles.size(); i++) {
			circles.get(i).update();
			
		}
	}
	
	void destroyCircles() {
		for(int i = 0; i < circles.size(); i++) {
			if(circles.get(i).d > circleDestroyDiameter) {
				circles.remove(i);
				i++;
			}
			
		}
	}
	
	
	void checkPlayerCollision() {
		for(int i = 0; i<circles.size(); i++) {
			if(touching((int)playerX, (int)playerY, circles.get(i).x, circles.get(i).y, 10 + (circles.get(i).d/2))) {
				
				gameEnd = true;
				//System.out.println("hi");
				
				
			}
		}
	}
	
	
	boolean touching(int x1, int y1, int x2, int y2, double length) {
		double distance = Math.sqrt(Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2)));
		if(distance <= length){
			return true;
		}else {
			return false;
		}
	}

}
