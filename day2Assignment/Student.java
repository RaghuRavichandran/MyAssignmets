package week3.day2Assignment;

public class Student extends Department {

	public void studentName() {
		System.out.println("Raghu");
	}
	public void studentDept() {
		System.out.println("Mech");
	}
	public void studentId() {	
		System.out.println("6735");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
