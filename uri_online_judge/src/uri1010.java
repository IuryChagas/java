import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int codPs1, numberPs1;
		int codPs2, numberPs2;
		
		double valueUnitPs1;
		double valueUnitPs2;
		
		codPs1 = input.nextInt();
		numberPs1 = input.nextInt();
		valueUnitPs1 = input.nextDouble();
		
		codPs2 = input.nextInt();
		numberPs2 = input.nextInt();
		valueUnitPs2 = input.nextDouble();
		
		System.out.printf("%nCod: %d%n Number: %d%n ValUnit: %.2f%n ", codPs1, numberPs1, valueUnitPs1);
		System.out.printf("%nCod: %d%n Number: %d%n ValUnit: %.2f%n ", codPs2, numberPs2, valueUnitPs2);
		
		input.close();
	}

}
