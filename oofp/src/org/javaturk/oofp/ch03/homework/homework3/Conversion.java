package org.javaturk.oofp.ch03.homework.homework3;

public interface Conversion {
	
	void addConversion(ConversionType conversion);
	
	void listConversionType();
	
	double doConversion(String name,double arg,String conversionName);

}
