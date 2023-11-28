package org.javaturk.oofp.ch03.flyer.animal;

public class Eagle extends Bird implements Hunter{

	public Eagle(String name) {
		super(name);
		
	}

	@Override
	public void hunter() {
		System.out.println("Eagle is hunting");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Eagle is eating.");
	}

	@Override
	public void takeOff() {
		System.out.println("Eagle is taking off.");
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying.");
	}

	@Override
	public void land() {
		System.out.println("Eagle is landing.");
	}


}
