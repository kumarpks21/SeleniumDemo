package JavaPackage;

public class Prime_Number {

	public static void main(String[] args) {
		int a=4, temp=0;
	if(a<=1){
		System.out.println(a + " is not a prime number");
		
	}
	else {	
		for(int i=2; i<=a-1;i++) {
		if(a%i==0) {
			temp=temp+1;
		}
	}
	if(temp>0) {
		System.out.println(a + " is not a prime number");
	}
	else {
		System.out.println(a + " is a prime number");
	}
	}
	}
}
