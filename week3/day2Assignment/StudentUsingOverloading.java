package week3.day2Assignment;

public class StudentUsingOverloading {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("id : "+ id + " , "+" name : "+ name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email : "+ email + " , "+" PhoneNumber : "+ phoneNumber);
	}
	public static void main(String[] args) {
		StudentUsingOverloading obj=new StudentUsingOverloading();
		obj.getStudentInfo(6735);
		obj.getStudentInfo(6735, "Raghu");
		obj.getStudentInfo("raghu1812mech.be@gmail.com", 7708757503l);
}
}
//Class: Students
//Methods: getStudentInfo()

//Description: 
//Create multiple getStudentInfo() 
		//method by passing id argument alone, 
		//by id & name, 
		//by email & phoneNumber
