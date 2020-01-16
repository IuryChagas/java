import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			int KM, Lit, tempoGasto, velocidadeMedia;
			double litros;
			
			tempoGasto = input.nextInt();
			velocidadeMedia = input.nextInt();
			
			litros = tempoGasto * velocidadeMedia / 12.0;
			
			System.out.printf("%.3f%n", litros);
			
		input.close();
	}

}