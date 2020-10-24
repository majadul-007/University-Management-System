package mainpanel;

public class Courses{
	 protected String courseName;
	 protected String courseId;
	Admin admin;
	Department department;
	Student[] students;
	Faculty faculty;
	 int totalStudentsCount;
	
	
	
	public Courses(){
		
		students = new Student[200];
		totalStudentsCount = 0;
	}
	
	public Courses(String courseName, String courseId){
		this.courseName = courseName;
		this.courseId = courseId;
		students = new Student[200];
		totalStudentsCount = 0;
		
	}
	
	public void SetAdmin(Admin admin){
		this.admin = admin;
	}
	
	public Admin GetAdmin(){
		return admin;
	}
	public void SetFaculty(Faculty faculty){
		this.faculty = faculty;
	}
	
	public Faculty getFaculty(){
		return faculty;
	}
	
	
	
	
	public void setDepartment(Department dept){
		this.department = dept;
	}
	
	public Department getDepartment(){
		return department;
	}
	
	
	public void addNewStudent(Student std){
		students[totalStudentsCount++] = std;
	}
	
	public void result(int gpa){
		System.out.println("CourseName: " + courseName);
		System.out.println("CourseGrade: " + gpa);
		
	}
	public void showInfo(){
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Id: " + courseId);
		
		
	}
	
	
	
	
	
	
	
	
	
}