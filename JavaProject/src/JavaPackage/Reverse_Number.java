package JavaPackage;

public class Reverse_Number {

	public static void main(String[] args) {
	int a=1234, rev=0,rem=0;
	while(a!=0) {
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
	}
	
	System.out.println(rev);

	}

}
