import java.util.Scanner;

public class uri1035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int A, B, C, D;
			
			A = input.nextInt();
			B = input.nextInt();
			C = input.nextInt();
			D = input.nextInt();
			
			
			
			if(B > C && D > A){
				System.out.println("Válido");
			}else if(C + D > A && C + D > B) {
				System.out.println("Válido");
			}

		input.close();
	}

}
