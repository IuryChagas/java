// leia duas notas do aluno, mostre a nota final com observação se reprovado caso nota seja inferior à 60.0! 

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			double nota1, nota2, notaFinal;
			
			System.out.println("1° Nota do Aluno: \n");
			nota1 = input.nextDouble();
			
			System.out.println("2° Nota do Aluno: \n");
			nota2 = input.nextDouble();
			
			notaFinal = (nota1 + nota2);
			
			if (notaFinal > 60.0) {
				System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			} else {
				System.out.printf("NOTA FINAL = %.1f%nREPROVADO", notaFinal);
			}
		input.close();
	}

}