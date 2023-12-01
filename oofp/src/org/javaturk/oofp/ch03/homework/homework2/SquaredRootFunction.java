package org.javaturk.oofp.ch03.homework.homework2;

public class SquaredRootFunction implements MathFunction {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "SquaredRootFunction";
	}

	@Override
	public double calculate(double arg) {
		// TODO Auto-generated method stub
		return Math.sqrt(arg);
	}

}
