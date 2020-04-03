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
		b = 2 * a; // b � do tipo double, portanto o output ser� convertido para: 10.0

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

		// 									Boa pr�tica:
		//
		// Sempre indique o tipo do n�mero, se a express�o for ponto flutuante (n�o inteira).
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

		resultado = i / j; // por i e j serem do tipo inteiro a compila��o convertera o resultado para inteiro.

		System.out.println("	RESULTADO: "+ resultado);

		resultado = (double) i / j; // para que o resultado seja do tipo double, � necess�rio fazer o CASTIN ou seja, adicionar (double) na express�o.
								   // resultado fica assim: resultado = (double) i / j; convers�o expl�cita!

		System.out.println("	RESULTADO: "+ resultado);

		System.out.println("\nExemplo: [5]\n");

		double k;
		int l;

		k = 5.0;
		l = (int) k; // N�o se importando com a perca de informa��o � poss�vel converter um double para inteiro realizando  casting "convers�o expl�cita".

		System.out.println("	K: "+ k);


	}

}
