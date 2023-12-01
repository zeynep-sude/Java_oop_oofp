package org.javaturk.oofp.ch03.homework.homework2;

public class Cubing implements MathFunction{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Cubing";
	}

	@Override
	public double calculate(double arg) {
		// TODO Auto-generated method stub
		return Math.pow(arg,3);
	}

}
