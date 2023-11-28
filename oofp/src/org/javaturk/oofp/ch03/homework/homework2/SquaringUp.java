package org.javaturk.oofp.ch03.homework.homework2;

public class SquaringUp implements MathFunction {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Squaring Up";
	}

	@Override
	public double calculate(double arg) {
		// TODO Auto-generated method stub
		return Math.pow(arg, 2);
	}

}
