package homework.week3.kodlamaio.entities;

public class Course {
	
	private String courseName;
	private String instructorName;
	private double UnitPrice;
	private String description;
	private String categoryName;
	
	public Course() {
		super();
	}

	public Course(String courseName, String instructorName, double unitPrice, String description,
			String categoryName) {
		super();
		this.courseName = courseName;
		this.instructorName = instructorName;
		UnitPrice = unitPrice;
		this.description = description;
		this.categoryName = categoryName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	

}
