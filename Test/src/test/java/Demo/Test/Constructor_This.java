package Demo.Test;

public class Constructor_This {

	public Constructor_This() {
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	public Constructor_This(int a) {
		this(10,20,30,40);
		System.out.println("One Parametrized Constructor");
	}
	public Constructor_This(int a, int b) {
		this();
		System.out.println("Two Parametrized Constructor");
	}
	public Constructor_This(int a, int b, int c) {
		System.out.println("Three parametrized constructor");
	}
	public Constructor_This(int a, int b, int c, int d) {
		this(10,20);
		System.out.println("Four parametrized constructor");
	}
	public static void main (String [] args) {
		Constructor_This c=new Constructor_This(10);
	}
}
