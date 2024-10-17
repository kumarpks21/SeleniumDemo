package JavaPackage;

public class Reverse_String_Arrey {

	public static void main(String[] args) {
		String s="My Name Is Prashant Kumar Singh";
		String[] s1=s.split(" ");
		int l=s1.length;
		String rev="";
		for (int i=l-1;i>=0;i--) {
			rev=rev+ " " +s1[i];
		}
System.out.println(rev);
	}

}
