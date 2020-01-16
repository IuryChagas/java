import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
	
		int codPs1 = input.nextInt();
		int qtdPs1 = input.nextInt();
		Double valueUnitPs1 = input.nextDouble();
		
		int codPs2 = input.nextInt();
		int qtdPs2 = input.nextInt();
		Double valueUnitPs2 = input.nextDouble();
		
		double totPs1 = qtdPs1 * valueUnitPs1;
		double totPs2 = qtdPs2 * valueUnitPs2;
		
		double total = totPs1 + totPs2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		input.close();
	}

}