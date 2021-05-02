package home.certification.study.block_static;

class Person {

	static {
		System.out.println("SP");
	}

	public Person() {
		System.out.println("CP");
	}

	{
		System.out.println("Person");
	}
}

class Student extends Person {

	public Student() {
		System.out.println("CS");
	}

	static {
		System.out.println("Student");
	}

	{
		System.out.println("StudentX");
	}
}

public class BlockStatic extends Student {
	
	{
		System.out.println("BlockStatic bloque ");
	}
	
	static {
		System.out.println("bloque inicialicion ");
	}

	public BlockStatic() {
		System.out.println("Constructor BlockStatic");
	}

	public static void main(String[] args) {
		new BlockStatic();
	}
}
