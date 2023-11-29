package homework.week3.kodlamaio;

import homework.week3.kodlamaio.business.*;
import homework.week3.kodlamaio.core.logging.*;
import homework.week3.kodlamaio.dataAccess.*;
import homework.week3.kodlamaio.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course("C#","Engin Demiroğ",0,"Sıfırdan Zirveye","Programlama");
		
		Logger[] loggers = {new DatabaseLogger()};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course1);
		courseManager.printInfo(course1);

	}

}
