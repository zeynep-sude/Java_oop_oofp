package org.javaturk.oofp.ch01.execution.homework1.copy;

public class RegistrationOffice {
	public RegistrationOffice() {
		
	}
	public Student getAStudent() {
		Student s = null;
int i = (int) (6 * Math.random());
		
		switch (i) {
		case 0:
			s = new GraduateStudent(7,"Sude",2020,"02.10.2023","maj2","Ali");
			break;
		case 1:
			s = new UndergraduateStudent(5,"Sude",2021,"02.10.2023","maj3","minor1");
			break;
		case 2:
			s = new VocationalStudent(4,"Sena",2022,"02.10.2023","major4");
			break;
		case 3:
			s = new MasterStudent(2,"Cansu",2023,"02.10.2023","major5","Elif");
			break;
		case 4:
			s= new PhStudent(3,"Sait",2024,"02.10.2023","major6","Melisa", false);
			break;
		}

		return s;
	
	}
	public void registerStudent(Student student) {
		student.register();
	}

}
