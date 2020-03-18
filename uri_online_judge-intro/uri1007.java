import java.util.Scanner;

public class uri1007 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B, C, D, DIFERENCA;
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENÇA = "+ DIFERENCA);
	}

}