package org.javaturk.oofp.ch01.execution.homework1.copy;

import java.util.Date;

public class MasterStudent extends GraduateStudent {
	public MasterStudent(int no,String name,int year,String dob,String major,String advisor) {
		super(no,name,year,dob,major,advisor);
	}
	
	 @Override
	    public void study() {
		System.out.println("Master Student");
	    }
	   @Override
	   public void register() {
		   System.out.println("successful Master student registration");
	   }
	   
	   @Override
	   public void writeThesis() {
		   System.out.println("Master Student write thesis");
	   }
	   
	   @Override
	   public void meetWithAdvisor() {
		   System.out.println("Master student meet with advisor");
	   }

}
