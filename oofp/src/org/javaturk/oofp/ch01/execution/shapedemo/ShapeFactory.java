package org.javaturk.oofp.ch01.execution.shapedemo;

public class ShapeFactory {
	
	public Shape createShape() {
		Shape s = null;
		int i  = (int) (4*Math.random());
		
		switch(i) {
		case 0:
			s = new Circle(4);
			break;
		case 1:
			s = new Rectangle(2,3);
			break;
		case 2:
			s = new Square(7);
			break;
		case 3:
			s = new Triangle(4,6);
			break;
		
		}
		return s ;
	}

}
