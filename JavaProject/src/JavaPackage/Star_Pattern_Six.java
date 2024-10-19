package JavaPackage;

public class Star_Pattern_Six {

	public static void main(String[] args) {
		int r=5;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=r-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print( "*");
			}
			System.out.println();
		}

	}

}
