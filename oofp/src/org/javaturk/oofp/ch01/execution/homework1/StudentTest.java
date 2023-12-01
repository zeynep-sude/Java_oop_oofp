package org.javaturk.oofp.ch01.execution.homework1;

public class StudentTest {

	public static void main(String[] args) {
		RegistrationOffice register1 = new RegistrationOffice();
		Student s1 = register1.getAStudent();
		//System.out.println(s1.toString());
		//s1.register();
		//register1.registerStudent(s1);
		
	
		if(s1 instanceof MasterStudent) {
			s1.register();
		MasterStudent ms1 = (MasterStudent) s1;
		ms1.meetWithAdvisor();
         
		}
		else if(s1 instanceof PhStudent){
			s1.register();
			PhStudent ph1  = (PhStudent) s1;
			ph1.writePaper();
		}
		else if(s1 instanceof VocationalStudent) {
			s1.register();
			VocationalStudent vs1 = (VocationalStudent) s1;
			System.out.println(vs1.toString());		}
		else if(s1 instanceof UndergraduateStudent) {
			s1.register();
		}
		else if(s1 instanceof GraduateStudent) {
			s1.register();
		}
		else {
			s1.register();
		}
		

	}

}
