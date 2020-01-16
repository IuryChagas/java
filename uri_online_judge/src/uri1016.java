import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int distancia, tempo;
		
			distancia = input.nextInt();
			
			tempo = distancia * 2;
			
			System.out.printf("%d minutos%n", tempo);
		input.close();
	}

}