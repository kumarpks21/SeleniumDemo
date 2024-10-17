package JavaPackage;

public class Reverse_String {

	public static void main(String[] args) {
		String s="Prashant";
		int l=s.length();
		String rev="";
		for(int i=l-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
System.out.println(rev);
	}

}
