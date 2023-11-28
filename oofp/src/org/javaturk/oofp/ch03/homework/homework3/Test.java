package org.javaturk.oofp.ch03.homework.homework3;

import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		ConversionT1 conversion = new ConversionT1(1);
		conversion.addConversion(new Celcius());
		
		startConversion(conversion);
		

	}
	
	private static void startConversion(ConversionT1 conversion) {
		conversion.listConversionType();
		
		System.out.println("please select a temperature unit");
		String typeName = in.next();
		System.out.println("Select the unit you want to convert to");
		String conversionName = in.next();
		if(conversionName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.println("Please enter the argument of the function:");
		double conversionArg = in.nextDouble();
		double result1 = conversion.doConversion(typeName, conversionArg,conversionName);
		System.out.println(typeName + " of " + conversionArg + " is " + result1 +" "+ conversionName+"\n");
		
		startConversion(conversion);
	}

}


