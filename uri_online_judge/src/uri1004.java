import java.util.Scanner;

public class uri1004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int X, Y, PROD;
			
			X = input.nextInt();
			Y = input.nextInt();
			
			PROD = X * Y;
			
			System.out.println("PROD = "+ PROD);
			
		input.close();
	}

}
