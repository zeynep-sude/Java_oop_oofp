package org.javaturk.oofp.ch03.homework.homework2;

public class Fiboniacci implements MathFunction {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Fiboniacci";
	}

	@Override
	public double calculate(double arg) {
		return calculateFibonacci(arg);

}
	
	private int calculateFibonacci(double arg) {
		int f0=0,f1=1,fibo=0,toplam =0;
		for(int i=0;i<=arg;i++) {
			fibo = f0+f1;
		    f0=f1;
		   f1=fibo;
		  }
		 
		 return fibo;
	}}
