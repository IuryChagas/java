import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			int N, module, segundos, minutos, horas;
			
			
			N = input.nextInt();
			
			horas = N / 3600;
			module = N % 3600;
			minutos = module / 60;
			segundos = module % 60;
			
			
			System.out.printf("Minutos: %d:%d:%d%n", horas, minutos, segundos);
		input.close();
	}	

}
