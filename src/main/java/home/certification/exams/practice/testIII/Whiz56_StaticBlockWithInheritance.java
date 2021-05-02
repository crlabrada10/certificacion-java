package home.certification.exams.practice.testIII;

class MainClass {
	MainClass() {
		System.out.println("MainClass");
	}
}

class SubClass extends MainClass {

	{
		System.out.print("I ");
	}

	static {
		System.out.println("S ");
	}
	
	public SubClass(int i) {
		this();
		System.out.println("SubClass");
	}
	
	public SubClass() {
		super();
		System.out.println("SubClass");
	}

}

public class Whiz56_StaticBlockWithInheritance extends SubClass {

	
	public Whiz56_StaticBlockWithInheritance(String i) {
		super();
		System.out.println("SubSubClass");
	}

	public static void main(String[] args) {
		new Whiz56_StaticBlockWithInheritance("ABC");

	}

}
