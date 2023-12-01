package org.javaturk.oofp.ch03.homework.homework2;

public class SinFunction implements MathFunction {

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}

	@Override
	public String getName() {
		return "SinFunction";
	}

}
