package org.javaturk.oofp.ch01.execution.shapedemo;

public class TestShape {

	public static void main(String[] args) {
		ShapeFactory factory= new ShapeFactory();
		Shape s= factory.createShape();
		s.draw(); 
		 s.erase();
		 /* System.out.println(s.calculateArea());
		 System.out.println(s.calculateCircimference());*/
		 
		 Shape s1 = new Rectangle(2,5);
		 s1.draw();
		 System.out.println(s1.calculateArea());
		 
		 
		 if (s instanceof Circle) {
			 System.out.println("Yarı Çap : " + s.edge);
		 }
		 
		 else if (s instanceof Rectangle) {
			 Rectangle r1 = (Rectangle) s;
			 System.out.println("Kenar Ölçüleri : " + s.edge +" - "+r1.edge2);
		 }
		 else if (s instanceof Square) {
			 System.out.println("Kenar Ölçüsü : " + s.edge);
		 }
		 
		 else if (s instanceof Triangle) {
			 Triangle t1 = (Triangle) s;
			 System.out.println("Kenar Ölçüsü: " + s.edge + " Yükseklik: " + t1.height);
		 }
	}

}
