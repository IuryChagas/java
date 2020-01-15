import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			double base, altura, area, perimetro, diagonal;
			
			base = input.nextDouble();
			altura = input.nextDouble();
			
			area = base * altura;
			perimetro = 2.0 * base + (2.0 * altura);
			diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
			
			System.out.printf("AREA = %.4f%n", area);
			System.out.printf("PERIMETRO = %.4f%n", perimetro);
			System.out.printf("DIAGONAL = %.4f%n", diagonal);
		input.close();
		
	}

}