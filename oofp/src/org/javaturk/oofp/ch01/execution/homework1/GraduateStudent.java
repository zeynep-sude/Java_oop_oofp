package org.javaturk.oofp.ch01.execution.homework1;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {
	private String advisor;
	private String thesis;
	
public GraduateStudent(int no,String name,int year,String dob,String major,String advisor) {
		super(no,name,year,dob,major);
		this.advisor = advisor;
	}
   @Override
    public void study() {
	System.out.println("Graduate Student");
    }
   @Override
   public void register() {
	   System.out.println("successful graduate student registration");
   }
   
   public void writeThesis() {
	   System.out.println("graduate write thesis");
   }
   public void meetWithAdvisor() {
	   System.out.println("graduate student meet with advisor");
   }
	
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	

}
