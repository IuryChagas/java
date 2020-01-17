import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int hours;
			
			System.out.println("Quantas horas?\n ");
			hours = input.nextInt();
			
			if(hours < 12) System.out.println("Bom dia!");
			else if (hours >= 12 && hours <= 18) System.out.println("Boa tarde!");
			else System.out.println("Boa noite!");
			
		input.close();
	}

}
