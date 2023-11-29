package homework.week3.kodlamaio.entities;

public class Instructor {
	
	private String firstName;
	private String lastName;
	private Course courseName;
	public Instructor() {
		super();
	}
	public Instructor(String firstName, String lastName, Course courseName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseName = courseName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Course getCourseName() {
		return courseName;
	}
	public void setCourseName(Course courseName) {
		this.courseName = courseName;
	}
	
	

}
