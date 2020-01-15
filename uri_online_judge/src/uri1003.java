import java.util.Scanner;

public class uri1003 {

	public static void main(String[] args) {
		int A, B, SOMA;
		
		Scanner input = new Scanner(System.in);
			A = input.nextInt();
			B = input.nextInt();
			
			SOMA = A + B;
			
			System.out.println("SOMA = "+ SOMA);
		input.close();
	}

}