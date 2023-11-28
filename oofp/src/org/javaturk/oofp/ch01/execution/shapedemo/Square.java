package org.javaturk.oofp.ch01.execution.shapedemo;

public class Square extends Shape {
	
	public Square() {
		
	}
	
	public Square(double edge) {
		super(edge);
	}
	
	 @Override
		public void draw() {
			System.out.println("Kare Çizildi");
		}
		
		@Override
		public void erase() {
			System.out.println("Kare Silindi");
		}
		
		@Override
		public double calculateArea() {
			return result =edge*edge;

		}
		
		@Override
		public double calculateCircimference() {
		return	result =4*edge;
		
		}

}
