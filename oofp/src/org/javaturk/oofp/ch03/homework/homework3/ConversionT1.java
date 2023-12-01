package org.javaturk.oofp.ch03.homework.homework3;

public class ConversionT1 implements Conversion {
	
	private int conversionCount;
	private int currentCount = 0;
	
	private ConversionType[] conversions;
	private double argument;
	
	public ConversionT1(int conversionCount) {
		this.conversionCount = conversionCount;
		conversions = new ConversionType[conversionCount];
		
	}

	@Override
	public void addConversion(ConversionType conversion) {
		conversions[currentCount] = conversion;
		currentCount++;
		
	}

	@Override
	public void listConversionType() {
		System.out.println("Available Functions:");
		for(ConversionType conversion : conversions)
			System.out.println(conversion.getName());
		
	}

	@Override
	public double doConversion(String typeName, double arg,String conversionName) {
		double result1 = 0.0;
		double result2  =0.0;
		boolean isFunctionFound = false;
	for(ConversionType conversion : conversions) {
			if(typeName.equalsIgnoreCase(conversion.getName())) {
				result1 = conversion.fahrenheit(arg);
				result2 = conversion.conversion2(arg);
				isFunctionFound = true;
				
				}

	}
	if(!isFunctionFound)
		System.out.println("No such function found!");

	return result1 ;

	}
	}
