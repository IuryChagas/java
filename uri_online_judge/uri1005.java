import java.util.Locale;
import java.util.Scanner;

public class uri1005 {

	public static void main(String[] args) {
		// média ponderada: somar os valores multiplicando por um peso e depois dividir pela soma dos pesos
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			double A = input.nextDouble();
			double B = input.nextDouble();
			
			double pesoA = 3.5;
			double pesoB = 7.5;
			double pesoAeB = pesoA + pesoB;
			
			double mediaPesoA = A * pesoA / pesoAeB;
			double mediaPesoB = B * pesoB / pesoAeB;
			
			double MEDIA = mediaPesoA + mediaPesoB;
			
			System.out.printf("MEDIA = %.5f%n", MEDIA);
		input.close();

	}

}