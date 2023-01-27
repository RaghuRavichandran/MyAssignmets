package week4.day1Assignment;

public class Automation extends MultipleLangauge implements TestTool,Language{

	@Override
	public void ruby() {
		
		System.out.println("ruby from Abstact Class MultipleLangauge ");
	}

	public void Java() {
		
		System.out.println("Java from Interface Language");
	}

	public void Selenium() {
		
		System.out.println("Selenium from Interface TestTool");
		
	}
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.ruby();
		obj.Java();
		obj.Selenium();
		obj.python();
	}
}
/* Interface :Language
Methods   :Java()
Interface :TestTool
Methods   :Selenium()
AbstractClass :MultipleLangauge
Methods   :python() and un implemented method as ruby()
Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class */