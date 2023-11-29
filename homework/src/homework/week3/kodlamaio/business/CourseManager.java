package homework.week3.kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import homework.week3.kodlamaio.core.logging.Logger;
import homework.week3.kodlamaio.dataAccess.CourseDao;
import homework.week3.kodlamaio.entities.Course;

public class CourseManager  {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public List<Course> getAll() throws Exception {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("C#","Engin Demiroğ",0,"Sıfırdan Zirveye","Programlama"));
		courses.add(new Course());
		courses.add(new Course());
		return courses;
	}
	
	public void add(Course course) throws Exception {
		if(course.equals(course.getCourseName())) {
			throw new Exception("course names cannot be the same");
		}
		if(course.equals(course.getCategoryName())) {
			throw new Exception("category names cannot be the same");
		}
		if(course.getUnitPrice()<0) {
			throw new Exception("the price cannot be less than zero");
		}
		courseDao.add(course);
		System.out.println("Kurs Ekleme Başarılı");
		
		for(Logger logger: loggers) {
			logger.log(course.getCourseName());
		}
		
	}
	
	public String toString(Course course) {
		return "Course [CourseName:" + course.getCourseName() +"InstructorName: " + course.getInstructorName();
	}
	
	public void printInfo(Course course) {
		System.out.println("Kurs Adı: "+course.getCourseName());
	}
	

}
