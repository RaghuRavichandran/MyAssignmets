package week3.day2Assignment;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("15inches");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
