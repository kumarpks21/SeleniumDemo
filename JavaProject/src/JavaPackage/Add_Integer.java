package JavaPackage;

public class Add_Integer {

	public static void main(String[] args) {
		int a=1230;
		int sum=0, rem=0;
		while(a!=0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
System.out.println(sum);
System.out.println("Hello World");
	}

}
