import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		 x = input.nextInt();  // Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão.
		 	input.nextLine(); // Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().

		s1 = input.nextLine();
		s2 = input.nextLine();
		s3 = input.nextLine();

		System.out.println("	DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
