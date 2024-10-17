package JavaPackage;

class Num_Swap_1{
	int a1=12,b1=13,c1;
	void method2(){
	c1=a1;
	a1=b1;
	b1=c1;
	System.out.println("Value of a1 is " +a1);
	System.out.println("Value of b1 is " +b1);
	
}}

public class Num_Swap extends Num_Swap_1 {
	int a=12, b=13;
	
	void method1() {
		a=a+b; //25
		b=a-b;
		a=a-b;
		System.out.println("Value of a is " +a);
		System.out.println("Value of b is " +b);
		
	}
	public static void main(String[] args) {
	Num_Swap swap=new Num_Swap();
	swap.method1();
	swap.method2();
		
	}

}
