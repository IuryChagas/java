import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			int NUMBER, workedHours;
			Double valuePerHour, SALARY;
			
			NUMBER = input.nextInt();
			workedHours = input.nextInt();
			valuePerHour = input.nextDouble();
			
			SALARY = workedHours * valuePerHour;
			
			System.out.println("NUMBER = "+ NUMBER);
			System.out.printf("SALARY = U$ %.2f%n", SALARY);
			
			
		input.close();

	}

}
