import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 

//		Calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int cod1, cod2, n_peca1, n_peca2;
		double v_unitario1, v_unitario2, valor_total1, valor_total2, valor_total_pecas;

		cod1 = input.nextInt();
		n_peca1 = input.nextInt();
		v_unitario1 = input.nextDouble();

		valor_total1 = n_peca1 * v_unitario1;

		cod2 = input.nextInt();
		n_peca2 = input.nextInt();
		v_unitario2 = input.nextDouble();

		valor_total2 = n_peca2 * v_unitario2;

		valor_total_pecas = valor_total1 + valor_total2;


		System.out.printf("VALOR A PAGAR = R$ %.2f\n", valor_total_pecas);
		input.close();
	}

}
