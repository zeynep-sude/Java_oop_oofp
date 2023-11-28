package org.javaturk.oofp.ch03.newFeature.staticMethods;

public class TestStaticMethod {

	public static void main(String[] args) {
		Printable printable = new Document();
		printable.print();
		printable.format();
		
		Printable.startPrinting();
		
//		Document.startPrinting();  		// Can't do this!
		SubPrintable.startPrinting(); 	// Can't do this!

	}

}
