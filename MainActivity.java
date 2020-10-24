import java.util.Scanner;
import mainpanel.*;
import interfacepart.*;
//import transactionpart.*;

public class MainActivity{
    
	Scanner sc = new Scanner(System.in);
	Student[] student1 = new Student[2000];
	Faculty f1 = new Faculty("Kabir", "121", "12345");
	Student s2 = new Student("Haque", "151-2", "22", "haque@gmail.com", "b+", "01719***", "Dhanmondi");
	Courses cc1 = new Courses("pl-2", "141");
	Department dp = new Department("EEE", "11-2", 151);
	boolean check = true;
	//Student s2 = new Student()
        //Scanner sc = new Scanner(System.in);
        Admin a = new Admin("Admin", "1234");
	private void displayMainMenu() {
    
                System.out.println("**********Please Choose the task you want to perform****");
                System.out.println("1.Admin  Login");
                System.out.println("2.Faculty Login");
                System.out.println("3.Student Login");
                int input = sc.nextInt();
                sc.nextLine();

                switch (input) {
                case 1:
                                displayAdminLoginMenu();
                                break;
                case 2:
                                displayFacultyLoginMenu();
                                break;
                case 3:
                                displayStudentLoginMenu();
                                break;
                default:
                                // Display the main menu again if no option was successful.
                                // Can also handle possible errors here with feedback to the user.
                                displayMainMenu();
                                break;
                }
}

	private void displayAdminLoginMenu() {

                // Perform login operation here

                // After successful login display admin options menu
	Scanner ac = new Scanner(System.in);
			System.out.println("**********Welcome to Admin panel*******");
        
			System.out.println("Please enter the userName: ");
			String user = sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String password = sc.nextLine();
			
        
			do{
                if("Admin".equals(user) && "1234".equals(password)){
                displayAdminOptionsMenu();
				
			}else{
                System.out.println("Login Failed");
				check = false;
				break;
			}
				
			}while(true);
        
    
}
private void displayAdminOptionsMenu() {
                System.out.println("**** 1. add students and department *****");
                System.out.println("**** 2. remove students *****");
                System.out.println("**** 3. student Information *****");
                System.out.println("**** 4, return to main menu *****");
                System.out.println("**** 5, exit the system *****");
	            //boolean flag = true;
    
                int input = sc.nextInt();

    
                switch (input) {
                case 1:
                                // Call function for option 1.
        addNewStudentAndDept();
                                break;
                case 2:
                                // Call function for option 2.
        removeStudent();
                                break;
                case 3:
                                // Call function for option 3.
        showALlInfo();
                                break;
                case 4:
                                displayMainMenu();
                                break;
                case 5:
                                exitApplication();
                                break;
                default:
                                break;
                }
}

private void displayFacultyLoginMenu() {
	System.out.println("**********Welcome to Faculty panel*******");
        
			System.out.println("Please enter the userName: ");
			String facultyUser = sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String facultyPassword = sc.nextLine();
			do{
                if("Faculty".equals(facultyUser) && "1234".equals(facultyPassword)){
                displayFacultyOptionsMenu();
				
			}else{
                System.out.println("Login Failed");
				check = false;
				
			}
				
			}while(true);

}

private void displayFacultyOptionsMenu(){
	System.out.println("**** 1. See your information *****");
                System.out.println("**** 2. See your courses *****");
                System.out.println("**** 3. SetResult *****");
                System.out.println("**** 4, return to main menu *****");
                System.out.println("**** 5, exit the system *****");
	            //boolean flag = true;
    
                int input = sc.nextInt();

    
                switch (input) {
                case 1:
                                // Call function for option 1.
					facultyInformation();
                     break;
                case 2:
                                // Call function for option 2.
					seeCourses();
                                break;
                case 3:
                                // Call function for option 3.
                setResults();
                                break;
                case 4:
                                displayMainMenu();
                                break;
                case 5:
                                exitApplication();
                                break;
                default:
                                break;
                }
}
private void facultyInformation() {
	//Faculty f1 = new Faculty("Kabir", "121", "12345");
	f1.showInfo();
	//seeCourses(f1);
}
private void seeCourses() {
	//facultyInformation();
	Courses c1 = new Courses("Pl-1", "11");
	f1.SetCourse(c1);
	f1.showCourseInfo();
}
private void setResults() {
	cc1.result(3);
	
	
}
//Student part

private void displayStudentLoginMenu() {
	System.out.println("**********Welcome to Student panel*******");
        
			System.out.println("Please enter the userName: ");
			String studentUser = sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String studentPassword = sc.nextLine();
			do{
                if("Student".equals(studentUser) && "1234".equals(studentPassword)){
                displayStudentOptionsMenu();
				
			}else{
                System.out.println("Login Failed");
				check = false;
			}
				
			}while(true);

}

private void displayStudentOptionsMenu(){
	System.out.println("**** 1. See your information *****");
                System.out.println("**** 2. See your Courses *****");
                
                System.out.println("**** 3. AddTransaction *****");
				System.out.println("**** 4. SeeResults *****");
                System.out.println("**** 5, Display Main Menu*****");
                System.out.println("**** 6, exit the system *****");
	            //boolean flag = true;
    
                int input = sc.nextInt();

    
                switch (input) {
                case 1:
                                // Call function for option 1.
					studentInformation();
                     break;
                case 2:
                                // Call function for option 2.
					studentCourses();
                                break;
                case 3:
                                // Call function for option 3.
                       studentPayment();
					 
                                break;
                case 4:
						 studentResults();
                                break;
                case 5:
                                displayMainMenu();
                                break;
                case 6:
                                exitApplication();
                                break;
                default:
                                break;
                }
}

private void studentInformation() {
	s2.SetDeparment(dp);
	s2.addNewCourses(cc1);
	s2.showInfo();
	
	
}
private void studentCourses(){
	Courses s3 = new Courses("Database", "191");
	s2.addNewCourses(s3);
	s2.AllCourseInfo();
	
}
private void studentResults(){
	f1.SetcourseResult(3);
	
}
private void studentPayment(){
	s2.deposit(75000);
	s2.ShowTransaction();
}
//private void () {}




    



private void addNewStudentAndDept(){
	System.out.println("Enter the number of student you want to add: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<num; i++) {
                                                                                                                if (student1[i] == null) {
                                System.out.println("Enter the deptname: ");
        String depntName = sc.nextLine();
        System.out.println("Enter the deptId: ");
        String depntId = sc.nextLine();
        System.out.println("Enter the totalCredit: ");
        int totalCredit = sc.nextInt();
        sc.nextLine();
		
        Department cs = new Department(depntName, depntId, totalCredit);	
        Scanner mc = new Scanner(System.in);
        
	    System.out.println("Enter the StudentName: ");
            
        String StudentName = mc.nextLine();
		
        System.out.println("Enter the StudentId: ");
        String StudentId = mc.nextLine();
		
	    System.out.println("Enter the StudentAge: ");
        String StudentAge = mc.nextLine();
		
        System.out.println("Enter the email: ");
        String email = mc.nextLine();
		
        System.out.println("Enter the bloodGroup: ");
        String bloodGroup = mc.nextLine();
		
        System.out.println("Enter the phoneNumber: ");
        String phoneNumber = mc.nextLine();
		
        System.out.println("Enter the Address: ");
        String Address = mc.nextLine();
        mc.nextLine();
		
        Student s1 = new Student(StudentName,StudentId,StudentAge,email,bloodGroup,phoneNumber,Address);
                student1[i] = s1;
                a.addNewRegister(student1[i]);
                a.addNewDepartment(cs);
				
                student1[i].SetAdmin(a);
                student1[i].SetDeparment(cs);
                cs.addNewRegister(student1[i]);
								
                                break;
                                                                                                               
																											   }
																												
    
}
}
private void removeStudent() {
	
	//a.searchStudentInfo("12");
	//boolean isStudentRegistered = false;
	Scanner stdSc = new Scanner(System.in);
	boolean flag1 = true;
	System.out.println("Please Enter the Id you want to remove");
	String Id = stdSc.nextLine();
	for(int i=0; i<student1.length;i++){
		if(student1[i]== null){
		break;
		}
		if(student1[i]!=null && student1[i].getId().equals(Id)){
				System.out.println("student found");
				student1[i] = null;
					flag1 = true;
					//total = null;
					System.out.println("Student removed");
					studentInformation();
					
				
			}
			if(!flag1){
				System.out.println("student doesn't exist");
				
			}
		}
	}
	
	
    
    
    
	//System.exit(0);


private void showALlInfo() {
	for(int i=0; i<1; i++){
                a.showRegisteredInfo();
            
			}
    
    
    
	//System.exit(0);
}
private void exitApplication() {
                System.exit(0);
}
		
		
		
		
		
    
	public static void main(String args[]){
        MainActivity a1 = new MainActivity();
        a1.displayMainMenu();
		
		
	}
	}
    

		
		
		
		
		
		
		
        /*
    
		
        boolean flag = true;
        Student[] student1 = new Student[2000];
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin("Admin", "1234");
		
		
        System.out.println("**********Welcome to University Management*******");
        

   //do {	
        System.out.println("**********Please Choose the task you want to perform****");
        System.out.println("1.Adming  Login");
        System.out.println("2.Faculty Login");
        System.out.println("3.Student Login");
        int choose = sc.nextInt();
        sc.nextLine();
		
		
		
        if(choose == 1){
			Scanner ac = new Scanner(System.in);
			System.out.println("**********Welcome to Admin panel*******");
        
			System.out.println("Please enter the userName: ");
			String user = sc.nextLine();
        
			System.out.println("Please enter the password: ");
			String password = sc.nextLine();
        
			if("Admin".equals(user) && "1234".equals(password)){
                do{
                System.out.println("Login successful");
                System.out.println ( "**** 1. add students and department *****");
                                                                System.out.println ( "**** 2. remove students *****");
                                                                System.out.println ( "**** 3. student Information *****");
                                 //System.out.println ( "**** n 5, print student *****");
                                                                System.out.println ( "**** 4, exit the system *****");
				
                int sel = sc.nextInt();
        switch (sel){
        case 1:
		
        System.out.println("Enter the number of student you want to add: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<num; i++) {
                                                                                                                if (student1[i] == null) {
                                System.out.println("Enter the deptname: ");
        String depntName = sc.nextLine();
        System.out.println("Enter the deptId: ");
        String depntId = sc.nextLine();
        System.out.println("Enter the totalCredit: ");
        int totalCredit = sc.nextInt();
        sc.nextLine();
		
        Department cs = new Department(depntName, depntId, totalCredit);
		
		
        Scanner mc = new Scanner(System.in);
        
	    System.out.println("Enter the StudentName: ");
            
        String StudentName = mc.nextLine();
		
        System.out.println("Enter the StudentId: ");
        String StudentId = mc.nextLine();
		
	    System.out.println("Enter the StudentAge: ");
        String StudentAge = mc.nextLine();
		
        System.out.println("Enter the email: ");
        String email = mc.nextLine();
		
        System.out.println("Enter the bloodGroup: ");
        String bloodGroup = mc.nextLine();
		
        System.out.println("Enter the phoneNumber: ");
        String phoneNumber = mc.nextLine();
		
        System.out.println("Enter the Address: ");
        String Address = mc.nextLine();
        mc.nextLine();
		
        Student s1 = new Student(StudentName,StudentId,StudentAge,email,bloodGroup,phoneNumber,Address);
                                                                                                                                student1[i] = s1;
                                a.addNewRegister(student1[i]);
                                                                                                        a.addNewDepartment(cs);
                                student1[i].SetAdmin(a);
                                                                                                        student1[i].SetDeparment(cs);
                                cs.addNewRegister(student1[i]);
								
                                                                                                                                //break;
                                                                                                                }
                            
                                                                                                                else{
                                                                                                                                                System.out.println ( "Number of students in full");
                                                                                                                                break;
                                                                                                                }
                                                                                                }
        break;
		
        case 2:
		 boolean isStudentRegistered = false;
        System.out.println("Please Enter the Id you want to remove: ");
		
		
			Scanner newCheck = new Scanner(System.in);
			String stdId = newCheck.nextLine();
			for(Student total : student1){
                if(total != null){
                if(total.getId() == stdId){
					System.out.println("student found");
					isStudentRegistered = true;
					total = null;
					System.out.println("Student removed");
		 }
            
                }
				
			}if(!isStudentRegistered){
                System.out.println("No student found");
			}
		
		
        break;
		
        case 3:
			for(int i=0; i<1; i++){
                a.showRegisteredInfo();
					break;
			}
        break;
		
        case 4:
        System.exit(0);
        //flag = false;
        //break;
        //continue;
                                break;
        default:
                                break;
            
                }
			}while (true);

                                } else {
                                                //flag = true;
                                                System.out.println ( "Login failed please re-enter:");
                                }
        }
        else if(choose == 3){
			Scanner std = new Scanner(System.in);
        
			System.out.println ( "Welcome to Student Panel*******");
			System.out.println("Please enter the StudentId: ");
			String userId = std.nextLine();
        
			System.out.println("Please enter the password: ");
			String password = std.nextLine();
			do{
			for(Student total : student1){
			if(total != null){
                if(total.getId() == userId){
					System.out.println("*********Welcome to university Portal***");
					//isStudentRegistered = true;
					total.showInfo();
		 }else{
                System.out.println("You are not registered yet");
		 }
            
                }
				
        
        
                
                }
			}while(true);
        
            
            
        
        }
		
        else{
        System.out.println ( "Login failed please re-enter:");
        }
                /*} while (true);
        
	}*/
    
    
    

        
        
		
		
		
		
		
        /*
            
        //Department cs = new Department();
        //Student s1 = new Student();
				
		
		
        System.out.println("Enter the deptname: ");
        String depntName = sc.nextLine();
        System.out.println("Enter the deptId: ");
        String depntId = sc.nextLine();
        System.out.println("Enter the totalCredit: ");
        int totalCredit = sc.nextInt();
		
        Department cs = new Department(depntName, depntId, totalCredit);
		
		
        Scanner mc = new Scanner(System.in);
        
	    System.out.println("Enter the StudentName: ");
            
        String StudentName = mc.nextLine();
		
        //System.out.println("");
		
        System.out.println("Enter the StudentId: ");
        String StudentId = mc.nextLine();
		
	    System.out.println("Enter the StudentAge: ");
        String StudentAge = mc.nextLine();
		
        System.out.println("Enter the email: ");
        String email = mc.nextLine();
		
        System.out.println("Enter the bloodGroup: ");
        String bloodGroup = mc.nextLine();
		
        System.out.println("Enter the phoneNumber: ");
        String phoneNumber = mc.nextLine();
		
        System.out.println("Enter the Address: ");
        String Address = mc.nextLine();
		
        Student s1 = new Student(StudentName,StudentId,StudentAge,email,bloodGroup,phoneNumber,Address);
        
        
		
    

		
        Scanner cc = new Scanner(System.in);
            
        System.out.println("You can add upto 3 courses: ");
        for(int i=0; i<3; i++){
		
        System.out.println("Enter the courseName: ");
        String courseName = cc.nextLine();
        System.out.println("Enter the courseId: ");
        String courseId = cc.nextLine();
        
        }
		
		
        Bank
		
        System.out.println("Enter the amount of money you want to deposit: ");
    
        int amountT = sc.nextInt();
        s1.deposit(amountT);
		

		
        Courses  pl1 = new Courses("C", "11-2");
        a.addNewRegister(s1);
        a.addNewDepartment(cs);
        a.addNewCourse(pl1);
        pl1.SetAdmin(a);
		
        s1.SetAdmin(a);
        s1.SetDeparment(cs);
        s1.addNewCourses(pl1);
        pl1.addNewStudent(s1);
        pl1.setDepartment(cs);
        cs.addNewCourses(pl1);
		
        //Scanner sc = new Scanner(System.in);
        
	    System.out.println("Enter the FacultyName: ");
        String FacultyName = sc.nextLine();
        System.out.println("Enter the FacultyId: ");
        String FacultyId = sc.nextLine();
	    System.out.println("Enter the FacultyPassword: ");
        String FacultyPassword = sc.nextLine();
		
        Faculty f1 = new Faculty(FacultyName,FacultyId,FacultyPassword);
        f1.SetCourse(pl1);
        pl1.SetFaculty(f1);
        //f1.SetcourseResult(3);
		
        cs.SetAdmin(a);
		
        */
		
        /*
        Department cse = new Department("Cse", "121", 151);
        Student s2 = new Student("orin", "18-3", "22", "ab@gmail.com", "ab+", "0171", "basundhara");
        Courses  pl2 = new Courses("C++", "11-3");
        a.addNewRegister(s2);
        a.addNewDepartment(cse);
        s2.SetAdmin(a);
        s2.SetDeparment(cse);
        s2.addNewCourses(pl2);
		
        cse.SetAdmin(a);
        Bank b1 = new Bank("Dhaka-Bank", "Kuril");
        s2.deposit(5000, b1);
        //s2.transfer(7000, b1);
		
		
        Department eee = new Department("EEE", "171", 151);
        Student s3 = new Student("Sumon", "18-4", "22", "su@gmail.com", "ab+", "0176", "kuril");
        Courses  dc = new Courses("Dc", "11-4");
        Courses  ac = new Courses("Ac", "11-4");
        a.addNewRegister(s3);
        a.addNewDepartment(eee);
        s3.SetAdmin(a);
        s3.SetDeparment(eee);
        s3.addNewCourses(dc);
        s3.addNewCourses(ac);
        ac.addNewStudent(s3);
		
        eee.SetAdmin(a);
        s3.showResult();
		
        s3.AllCourseInfo();
        s3.showResult();
		
        a.showRegisteredInfo();
        s2.facultyMessage("notice");
        System.out.println("Searching student by their id");
        a.searchStudentInfo("18-4");
        */
		
		
    
    
    
    
