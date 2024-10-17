package JavaPackage;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		int a=0, b=1, c;
		for (int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}

}
