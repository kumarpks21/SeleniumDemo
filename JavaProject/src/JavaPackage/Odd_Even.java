package JavaPackage;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find the Even_Odd");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a + " is an even number");
		}
		else {
			System.out.println(a + " is not an even number");
		}
	}

}
