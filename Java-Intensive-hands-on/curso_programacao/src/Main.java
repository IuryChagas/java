import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. 

//		A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int Numero, Horas_trabalho;
		float Valor_hora, Salary;

		Numero = input.nextInt();
		Horas_trabalho = input.nextInt();
		Valor_hora = input.nextFloat();

		Salary = Valor_hora * Horas_trabalho;

		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", Numero, Salary);
		input.close();
	}

}
