package org.javaturk.oofp.ch03.homework.homework2;

public class LogFunction implements MathFunction {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "LogFunction";
	}

	@Override
	public double calculate(double arg) {
		// TODO Auto-generated method stub
		return Math.log(arg);
	}

}
