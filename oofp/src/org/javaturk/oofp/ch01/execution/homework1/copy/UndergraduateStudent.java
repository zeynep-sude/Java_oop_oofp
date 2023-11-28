package org.javaturk.oofp.ch01.execution.homework1.copy;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
	String minor;
	
	public UndergraduateStudent(int no,String name,int year,String dob,String major,String minor) {
		super(no,name,year,dob,major);
		this.minor = minor;
	}
	
	@Override
	public void study() {
		System.out.println(" UndergraduateStudent in class");
	}
	
	@Override
	public void register() {
		System.out.println("successful UndergraduateStudent registration");
	}
	
	@Override
	public String toString() {
		return "Undergraduate Student [Öğrenci No  "+ no +" Öğrenci İsmi " + name + "]";
	}

}
