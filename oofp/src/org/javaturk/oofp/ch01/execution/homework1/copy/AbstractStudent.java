package org.javaturk.oofp.ch01.execution.homework1.copy;

public abstract class AbstractStudent implements Student {
	
	protected int no;
	protected String name;
	private int year;
	protected String dob;
	private String major;
	
  public AbstractStudent(int no,String name,int year,String dob,String major) {
		
		this.no  = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major  =major;
		
	}

}
