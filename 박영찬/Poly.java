package com.ict.day14;


public class Poly {
	
	
	public static void main(String[] args) {
		drawShapes(new Ellipse());
		drawShapes(new Line());
		drawShapes(new Rectangle());
	}
		
	public static void drawShapes(Shape k) {
		k.draw();
	}
	
}

