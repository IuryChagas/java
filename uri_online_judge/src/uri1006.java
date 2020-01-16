import java.util.Locale;
import java.util.Scanner;

public class uri1006 {

	public static void main(String[] args) {
		
		// média ponderada: somar os valores multiplicando por um peso e depois dividir pela soma dos pesos
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double A, B, C, pesoA, pesoB, pesoC, pesoTotal, mediaA, mediaB, mediaC, MEDIA;
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		pesoA = 2.0;
		pesoB = 3.0;
		pesoC = 5.0;
		
		pesoTotal = pesoA + pesoB + pesoC;
		
		mediaA = A * pesoA / pesoTotal;
		mediaB = B * pesoB / pesoTotal;
		mediaC = C * pesoC / pesoTotal;
		
		MEDIA = mediaA + mediaB + mediaC;
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		input.close();
	}

}