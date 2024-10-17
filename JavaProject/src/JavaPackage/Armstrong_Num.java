package JavaPackage;

public class Armstrong_Num {

	public static void main(String[] args) {
		int a=153;int b=a;
		int rev=0, rem=0;
		while(a!=0) {
			rem=a%10;
			rev+=Math.pow(rem,3);
			a=a/10;
		}
if(rev==b) {
	System.out.println("Armstrong");
}
else {
	System.out.println("Not Armstrong");
}
	}

}
