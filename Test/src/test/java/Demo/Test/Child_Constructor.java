package Demo.Test;

public class Child_Constructor extends Parent_Constructor {
	public Child_Constructor() {
		this(10,20);
		System.out.println(" Child Default COnstructor");
	}
	public Child_Constructor(int a) {
		this();
		System.out.println("Child 1 Parametrized COnstructor");
	}
	public Child_Constructor(int a,int b) {
		super(10,20);
		System.out.println("Child 2 Parametrized COnstructor");
	}
	public Child_Constructor(int a,int b, int c) {
		this(10);
		System.out.println("Child 3 Parametrized COnstructor");
	}
public static void main(String [] args) {
	Child_Constructor cc=new Child_Constructor(10,20,30);
}
}
