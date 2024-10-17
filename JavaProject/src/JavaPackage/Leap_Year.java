package JavaPackage;

public class Leap_Year {

	public static void main(String[] args) {
		int a=2001;
		if((a%4==0 && a%100!=0) || (a%400==0)) {
			System.out.println("Is a leap year");
		}
		else {
			System.out.println("Is not a leap year");
		}

	}

}
