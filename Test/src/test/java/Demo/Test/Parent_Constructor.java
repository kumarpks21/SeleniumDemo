package Demo.Test;

public class Parent_Constructor {
	public Parent_Constructor() {
		this(10,20,30);
		System.out.println(" Parent Default COnstructor");
	}
	public Parent_Constructor(int a) {
		this();
		System.out.println("Parent 1 Parametrized COnstructor");
	}
	public Parent_Constructor(int a,int b) {
		this(10);
		System.out.println("Parent 2 Parametrized COnstructor");
	}
	public Parent_Constructor(int a,int b, int c) {
		System.out.println("Parent 3 Parametrized COnstructor");
	}

}
