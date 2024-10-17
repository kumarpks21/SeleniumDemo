package Demo.Test;

public class Arithmatic {
//((((10+2)-2)+2)*2)/2)
	
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Sum is : " +c);
		return c;
	}
	
	public int sub(int d, int e) {
		int f;
		f=d-e;
		System.out.println("Substraction is : " +f);
		return f;
	}
	public int mult(int g, int h) {
		int i;
		i=g*h;
		System.out.println("Multiplication is : " +i);
		return i;
	}
	public void div(int j, int k) {
		int l;
		l=j/k;
		System.out.println("division is : " +l);
	}
	public static void main (String [] args) {
		Arithmatic ar=new Arithmatic();
		int sum1=ar.sum(10, 2);
		int sub=ar.sub(sum1, 2);
		int sum2=ar.sum(sub,2);
		int mult=ar.mult(sum2, 2);
		ar.div(mult, 2);
		
	}
}
