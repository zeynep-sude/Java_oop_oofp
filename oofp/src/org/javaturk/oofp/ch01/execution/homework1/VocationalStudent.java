package org.javaturk.oofp.ch01.execution.homework1;

import java.util.Date;

public class VocationalStudent extends AbstractStudent {
	
	public VocationalStudent(int no,String name,int year,String dob,String major) {
		super(no,name,year,dob,major);
	}
	
	@Override
	public void study() {
		System.out.println("Vocational Student in class");
	}
	
	@Override
	public void register() {
		System.out.println("successful vocational student registration");
	}
	
	@Override
	public String toString() {
		return "Vocational Student [Öğrenci No  "+ no +" Öğrenci İsmi " + name + "]";
	}

}
