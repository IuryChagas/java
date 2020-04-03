import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int x, y;

		x = 5;
		y = 2 * x;

		System.out.println("Exemplo: [1]\n");
		System.out.println("	X: "+ x);
		System.out.println("	Y: "+ y);

		int a;
		double b;

		a = x;
		b = 2 * a; // b é do tipo double, portanto o output será convertido para: 10.0

		System.out.println("\nExemplo: [2]\n");
		System.out.println("	A: "+ a);
		System.out.println("	B: "+ b);

		double c, d, e, area;

		c = 6.0;
		d = 8.0;
		e = 5.0;

		area = (c + d) / 2.0 * e;

		System.out.println("\nExemplo: [3]\n");
		System.out.println("	AREA: "+ area);

		// 									Boa prática:
		//
		// Sempre indique o tipo do número, se a expressão for ponto flutuante (não inteira).
		//
		//  Para double use: .0
		//	Para float use: f

		float f, g, h, area2;

		f = 9f;
		g = 7f;
		h = 5f;

		area2 = (f + g) / 2f * h;

		System.out.println("	AREA2: "+ area2);

		System.out.println("\nExemplo: [4]\n");

		int i, j;
		double resultado;

		i = 5;
		j = 2;

		resultado = i / j; // por i e j serem do tipo inteiro a compilação convertera o resultado para inteiro.

		System.out.println("	RESULTADO: "+ resultado);

		resultado = (double) i / j; // para que o resultado seja do tipo double, é necessário fazer o CASTIN ou seja, adicionar (double) na expressão.
								   // resultado fica assim: resultado = (double) i / j; conversão explícita!

		System.out.println("	RESULTADO: "+ resultado);

		System.out.println("\nExemplo: [5]\n");

		double k;
		int l;

		k = 5.0;
		l = (int) k; // Não se importando com a perca de informação é possível converter um double para inteiro realizando  casting "conversão explícita".

		System.out.println("	K: "+ k);


	}

}
