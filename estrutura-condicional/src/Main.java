// Leia valores inteiros dos quais representam cada dia da semana.
// ex: 1 = Domingo, 2 = Segunda, ...
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int nDia = input.nextInt();
		String dia;
		
			 if(nDia == 1) dia = "Domingo";
		else if(nDia == 2) dia = "Segunda";
		else if(nDia == 3) dia = "Terça";
		else if(nDia == 4) dia = "Quarta";
		else if(nDia == 5) dia = "Quinta";
		else if(nDia == 6) dia = "Sexta";
		else if(nDia == 7) dia = "Sabado";
		else 			   dia = "Valor inválido";

		System.out.println("Dia da semana: "+ dia);

		input.close();
	}

}