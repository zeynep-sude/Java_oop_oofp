package org.javaturk.oofp.ch03.newFeature.defaultMethods;

public interface Printable {
	
void view();
	
	void print();
	
	default void format(){
		System.out.println("Printable is being formatted.");
	}

}
