
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double value;
		
		value = input.nextDouble();
		System.out.println("Valor digitador: "+ value);
		
		input.close();
		// obs: java pega a localidade do sistema ou seja, se for BR: a declação devera ser utilizando virgulas!
		// obs: para considerar o separador de decimais como ponto, ANTES da declacação do Scanner, faça:
		// Locale.setDefault(locale.US);
	}

}
