package org.javaturk.oofp.ch01.execution.shapedemo;

public abstract class Shape {
	protected double edge;
	protected double result;
	
	public Shape() {
		
	}
	
	public Shape(double edge) {
		this.edge = edge;
	}
	
	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void draw() {
		System.out.println("Şekil oluşturuldu");
	}
	
	public void erase() {
		System.out.println("Şekil Silindi");
	}
	
	public abstract double calculateArea();
		
	
	public abstract double calculateCircimference();
		

}
