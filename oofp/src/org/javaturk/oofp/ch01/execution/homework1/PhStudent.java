package org.javaturk.oofp.ch01.execution.homework1;

import java.util.Date;

public class PhStudent extends GraduateStudent {
	boolean qualifyingExamTaken;

	public PhStudent(int no,String name,int year,String dob,String major,String advisor,boolean qualifyingExamTaken) {
		super(no,name,year,dob,major,advisor);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	
	 @Override
	    public void study() {
		System.out.println("Ph Student");
	    }
	   @Override
	   public void register() {
		   System.out.println("successful Ph student registration");
	   }
	   
	   @Override
	   public void writeThesis() {
		   System.out.println("Ph Student write thesis");
	   }
	   
	   @Override
	   public void meetWithAdvisor() {
		   System.out.println("Ph student meet with advisor");
	   }
	
	   public void writePaper() {
		   System.out.println("Ph Student write paper");
	   }

}
