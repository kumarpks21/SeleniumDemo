package JavaPackage;

public class Star_Pattern_Three {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)  // i=1,2
			{
			for(int j=5; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
