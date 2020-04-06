import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 

//		Calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		triangulo = A * C / 2.0 ;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("%nTRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		input.close();
	}

}
