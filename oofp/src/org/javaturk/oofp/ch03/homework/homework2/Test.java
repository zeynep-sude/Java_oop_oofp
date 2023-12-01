package org.javaturk.oofp.ch03.homework.homework2;

import java.util.Scanner;



public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		CalculatorT1 t1 = new CalculatorT1(3);
		t1.addFunction(new Fiboniacci());
		t1.addFunction(new Cubing());
		t1.addFunction(new SquaringUp());
		
		startCalculator(t1);
	

	}
	
	private static void startCalculator(CalculatorT1 calculator) {
		calculator.listMathFunction();
		
		System.out.println("Please enter the name of the function:");
		String functionName = in.next(); 
		if(functionName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.println("Please enter the argument of the function:");
		double functionArg = in.nextDouble(); 
		double result = calculator.doCalculation(functionName, functionArg);
		System.out.println(functionName + " of " + functionArg + " is " + result + "\n");
		
		startCalculator(calculator);

	}

}
