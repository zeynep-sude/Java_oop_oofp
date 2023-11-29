package homework.week3.kodlamaio.dataAccess;

import homework.week3.kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile course eklendi");
		
	}

	

}
