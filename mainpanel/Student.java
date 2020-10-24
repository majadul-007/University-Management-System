package mainpanel;
import interfacepart.*;
import transactionpart.*;

public class Student implements Notice, Notes{
	
	public String name;
	private String id;
	private String age;
	private String bloodGroup;
	private String phoneNumber;
	private String email;
	private String Address;
	Admin admin;
	//Bank receiver;
	Department department;
	Courses[] courses;
	Transaction[] transactions;
	Faculty[] faculties;
	//Result[] result;
	protected int balance;
//	Department department;
	int totalCourseCount;
	int totalFacultyCount;
	protected int totalTransactionCount;
	
	public Student(){
		courses = new Courses[200];
		transactions = new Transaction[100];
		//result = Result[10];
		//this.department = department;
		totalCourseCount = 0;
		totalTransactionCount = 0;
		totalFacultyCount = 0;
		//totalTransactionCount = 0;
		
	}
	public Student(String name, String id, String age, String email, String bloodGroup, String phoneNumber, String Address){
		
		
		//result = Result[10];
		//this.department = department;
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
		this.Address = Address;
		//transactions = new Transaction[100];
		courses = new Courses[200];
		totalCourseCount = 0;
		totalTransactionCount = 0;
		totalFacultyCount = 0;
	}
	
	
	//Admin admin;
	
	
	
	
	
	
	public void SetName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void SetId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	public void setAge(String age){
		this.age = age;
	}
	
	public String getAge(){
		return age;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	

	
	public void setAddress(String Address){
		this.Address = Address;
	}
	
	public String getAddress(){
		return Address;
	}
	
	
	
	
	
	
	
	public void SetBloodGroup(String bloodGroup){
		this.bloodGroup = bloodGroup;
	}
	
	public String getBloodGroup(){
		return bloodGroup;
	}
	
	public void SetDeparment(Department department){
		this.department = department;
	}
	public Department GetDeparment(){
		return department;
	}
	
	public void SetAdmin(Admin admin){
		this.admin = admin;
	}
	
	public Admin GetAdmin(){
		return admin;
	}
	
	public void addNewFaculty(Faculty fcs){
		faculties[totalFacultyCount++] = fcs;
		
	}
	
	
	
	
	
	public void addNewCourses(Courses crc){
		courses[totalCourseCount++] = crc;
		
	}
	
	
	
	
	
	public void deposit(int amount){
		//balance -= amount;
		System.out.println("You have paid: " + amount);
		
		System.out.println("Thank you");
		addNewTransaction(this, amount, "Semester-fee");
		
	}
	
	
	
	public void addNewTransaction(Student sender, int amount, String PaymetnDetails){
		
		Transaction tn = new Transaction(sender, amount, PaymetnDetails);
		transactions[totalTransactionCount++] = tn;
		
	}
	/*
	
	public void setResult(Result results){
		this.results = results;
	}
	public result getResult(){
		this.results = results;
	}
	*/
	
	
	
	
	public void ShowTransaction(){
			for(int i=0; i<=totalTransactionCount; i++){
				transactions[i].showInfo();
			}
	}
	
			
	public void AllCourseInfo(){
		for(int i=0; i<totalCourseCount; i++){
			courses[i].showInfo();
		}
		
	}
	
	public void showInfo(){
		department.showInfo();
		System.out.println("Student Name: " + name);
		System.out.println("Student Id: " + id);
		System.out.println("Student Age: " + age);
		System.out.println("Student BloodGroup: " + bloodGroup);
		System.out.println("Student Email: " + email);
		System.out.println("Student phoneNumber: " + phoneNumber);
		System.out.println("Student Address: " + Address);
		//courses.result(int gpa);
		//Department.showInfo();
		//System.out.println("Student Name: " + );
		//System.out.println("")
		
	}
	
	public void showResult(){
		for(int i=0; i<totalCourseCount; i++){
			courses[i].result(3);
		}
	}
	
	
	public void facultyMessage(String message){
		
		if(message == "notes"){
			System.out.println("New Notes uploaded by Faculty");
			
		}
		else{
			System.out.println("New Notice posted by Faculty");
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
