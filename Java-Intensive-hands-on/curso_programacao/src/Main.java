import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // para setar o tipo de sintax num�rica! exe US: 4.5 exe BR: 4,5 
		Scanner input = new Scanner(System.in);

//		String n;   // lendo string
//
//		n = input.next(); // para string
//		System.out.println("Voc� digitou: "+ n);

//		int x; // lendo inteiro
//
//		x = input.nextInt();
//
//		System.out.println("Voc� digitou: "+ x);


//		double y; // lendo double
//
//		y = input.nextDouble();
//		
//		System.out.println("Voc� digitou: "+ y);

//		char x;
//		x = input.next().charAt(0); // capturar o primeiro caractere da string
//		
//		System.out.println("Voc� digitou: "+ x);
//		

		// lendo v�rios dados na mesma linha

		String x;
		int y;
		double z;

		x = input.next();
		y = input.nextInt();
		z = input.nextDouble();

		System.out.println("	Dados Digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		input.close();
	}

}
