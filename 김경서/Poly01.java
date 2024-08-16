package com.ict.team01.poly;
// 김경서
// 00. 도형 클래스 생성
class Shape {
	void draw() {

	}
}
// [ Shape 클래스 ]
// 다른 도형 클래스들의 공통 메서드 정의

// [ draw 메서드 ]
// Shape 클래스에 정의된 메서드 (각 도형을 그리기 위한 기본 메서드)
// hape 클래스를 상속받는 각 도형 클래스에서 Overide ~ 구체적인 도형 그리기 기능을 구현

public class Poly01 {
	public static void main(String[] args) {
		drawShapes(new Rectangle());
		drawShapes(new Ellipse());
		drawShapes(new Line());
	}

	public static void drawShapes(Shape shape) {
		shape.draw();
	}
}

// 01. 사각형 그리기
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

// 02. 원 그리기
class Ellipse extends Shape {
	@Override
	void draw() {
		System.out.println("원을 그립니다.");
	}
}

// 03. 선 그리기
class Line extends Shape {
	@Override
	void draw() {
		System.out.println("선을 그립니다.");
	}
}
