package org.javaturk.oofp.ch03.homework.homework2;

public class CosFunction implements MathFunction {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Cos";
	}

	@Override
	public double calculate(double arg) {
		// TODO Auto-generated method stub
		return Math.cos(arg);
	}
	

}
