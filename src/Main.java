

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int z;
		String s1, s2, s3;
		
		 z = input.nextInt();
		
			 input.nextLine();
		s1 = input.nextLine();
		s2 = input.nextLine();
		s3 = input.nextLine();
		
		System.out.println("DADOS DIGITADOS: \n");
		
		System.out.println(z);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		input.close();
		
		//	### Observa��o! ###
		//
		// 							problema!
		//
		// Quando voc� usa um comando de leitura diferente do nextLine()
 		// e d� alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padr�o.
		// 
		// Se voc� ent�o fizer um nextLine(),
		// aquela quebra de linha pendente ser� absorvida pelo nextLine().
		// 
		//							Solu��o!
		//
		// Fa�a um nextLine() extra antes de fazer o nextLine() de seu interesse. 
		//

	}

}
