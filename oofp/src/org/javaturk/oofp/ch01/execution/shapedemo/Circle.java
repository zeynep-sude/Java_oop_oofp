package org.javaturk.oofp.ch01.execution.shapedemo;

public class Circle extends Shape {
	
	public Circle() {
		
	}
	public Circle(double edge) {
		super(edge);
	}
	


	@Override
	public void draw() {
		System.out.println("Daire Çizildi");
	}
	
	@Override
	public void erase() {
		System.out.println("Daire Silindi");
	}
	
	@Override
	public double calculateArea() {
		return result =edge*edge* Math.PI;
//	System.out.println("Alan: " + result);
	}
	
	@Override
	public double calculateCircimference() {
	return	result = 2*edge*Math.PI;
	//	System.out.println("Çevre: " + result);
	}
	

}
