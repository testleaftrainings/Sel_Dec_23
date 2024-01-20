package week7.day1;

public class EmployeeDetails {
	
	int empId;
	String empName;
	boolean empStatus;
	
	public EmployeeDetails(){
		//this(200, "Subraja", true);
		System.out.println("Default Constructor");
		empId=100;
	}
	
	public EmployeeDetails(int empId,String empName,boolean empStatus){
		this();
		System.out.println("Parameterized Constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
	}
	
	public static void main(String[] args) {
//		EmployeeDetails ed = new EmployeeDetails();
//		System.out.println(ed.empId+"\n"+ed.empName+"\n"+ed.empStatus);
		
		EmployeeDetails ed1 = new EmployeeDetails(400, "Subraja", true);
		System.out.println(ed1.empId+"\n"+ed1.empName+"\n"+ed1.empStatus);
		
		
	}

}
