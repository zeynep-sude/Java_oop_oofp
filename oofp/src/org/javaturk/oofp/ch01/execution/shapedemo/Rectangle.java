package org.javaturk.oofp.ch01.execution.shapedemo;

public class Rectangle extends Shape {
	
	public double edge2;
	
	public double getEdge2() {
		return edge2;
	}

	public void setEdge2(double edge2) {
		this.edge2 = edge2;
	}

	public Rectangle() {
		
	}
	
    public Rectangle(double edge,double edge2) {
		super(edge);
		this.edge2 = edge2;
	}
    
    @Override
	public void draw() {
		System.out.println("Dikdörtgen Çizildi");
	}
	
	@Override
	public void erase() {
		System.out.println("Dikdörtgen Silindi");
	}
	
	@Override
	public double calculateArea() {
		return result =edge*edge2;

	}
	
	@Override
	public double calculateCircimference() {
	return	result = 2*(edge +edge2);
	
	}
	

}
