// leia três números inteiros. Mostre qual é o menor dentre os três números lidos.
// Em caso de empate mostre apenas uma vez.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int n1, n2, n3, menor = 0;
			
			n1 = input.nextInt();
			n2 = input.nextInt();
			n3 = input.nextInt();
			
			if(n1 < n2 && n1 < n3){
				menor = n1;
			}else if(n2 < n1 && n2 < n3){
				menor = n2;
			}else {
				menor = n3;
			}
			
			System.out.printf("MENOR = %d%n", menor);
		input.close();
	}

}