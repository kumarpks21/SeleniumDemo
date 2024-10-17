package JavaPackage;

public class Palindrome_Using_String {

	public static void main(String[] args) {
		int a=12321;
		String rev="";
		String s=Integer.toString(a);
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
