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
		
		switch (nDia) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3:
				dia = "Terça";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "Sabado";
				break;
			default:
				dia = "Valor invalido!";
				break;
		}
		
		System.out.println("Dia da semana: "+ dia);
		input.close();
	}

}