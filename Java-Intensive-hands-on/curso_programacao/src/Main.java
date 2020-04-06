import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int A, B, C, D, DIFERENCA;
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();

		DIFERENCA = (A * B) - (C * D);

		System.out.printf("DIFERENCA = %d", DIFERENCA);
		input.close();
	}

}
