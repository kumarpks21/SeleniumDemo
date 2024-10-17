package JavaPackage;

public class Palindrom_Num {

	public static void main(String[] args) {
		 int a=121, b,rev=0, rem=0;
		 b=a;
		 while(a!=0) {
			 rem=a%10;
			 rev=rev*10+rem;
			 a=a/10;
		 }
		 if (rev==b) {
			 System.out.println("A palindrome number");
		 }
		 else {
			 System.out.println("Not a palindrome number");
		 }
	}

}
