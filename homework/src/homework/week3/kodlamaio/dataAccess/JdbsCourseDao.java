package homework.week3.kodlamaio.dataAccess;

import homework.week3.kodlamaio.entities.Course;

public class JdbsCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbs ile course eklendi");
		
	}

	

}
