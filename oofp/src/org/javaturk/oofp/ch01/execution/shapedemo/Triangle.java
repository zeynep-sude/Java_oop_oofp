package org.javaturk.oofp.ch01.execution.shapedemo;

public class Triangle extends Shape {
	 double height ;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public Triangle() {
		
	}
	
public Triangle(double edge ,double height) {
		super(edge);
		this.height = height;
	}

@Override
public void draw() {
	System.out.println("Üçgen Çizildi");
}

@Override
public void erase() {
	System.out.println("Üçgen Silindi");
}

@Override
public double calculateArea() {
	return result =(edge*height)/2;

}

@Override
public double calculateCircimference() {
return	result =3*edge;

}

}
