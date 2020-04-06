import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos.
//
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double area, pi, raio;
		
		pi = 3.14159;
		
		raio = input.nextDouble();
		area = pi * (raio * raio);
		
		System.out.printf("A = %.4f\n", area);
		input.close();
	}

}
