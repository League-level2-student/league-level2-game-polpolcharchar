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
	
	
	CircleManager(int w, int h) {
		width = w;
		height = h;
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(circles.size());
		addCircle();
		
		//g.setColor(Color.red);
		//g.drawLine(200, 200, 250, 250);
		updateCircles();
		
		destroyCircles();

	}
	
	
	void draw(Graphics g) {
		//c.draw(g);
		for(int i = 0; i < circles.size(); i++) {
			circles.get(i).draw(g);
		}
	}
	
	
	
	void addCircle() {
		circles.add(new Circle(r.nextInt(width), r.nextInt(height)));
	}
	
	void updateCircles() {
		for(int i = 0; i < circles.size(); i++) {
			circles.get(i).update();
			
		}
	}
	
	void destroyCircles() {
		for(int i = 0; i < circles.size(); i++) {
			if(circles.get(i).d > 200) {
				circles.remove(i);
				i++;
			}
			
		}
	}

}
