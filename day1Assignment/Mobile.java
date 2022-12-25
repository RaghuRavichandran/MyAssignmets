package week1.day1Assignment;

public class Mobile {
	
	public void makeCall() {
		
		String mobileModel= "Samsung";
		float mobileWeight= 168.05f;		

		System.out.println(mobileModel);
		System.out.println(mobileWeight);
}
	
	public void sendMsg() {
		
		boolean isFullCharged= false;
		int     mobileCost= 65000;

		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}
	
	public static void main(String[] args) {
		
		Mobile obj=new Mobile();
		
		obj.makeCall();
		obj.sendMsg();
		
		System.out.println("This is my mobile");
	}
	
}

