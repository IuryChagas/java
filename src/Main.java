
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char value;
		
		value = input.next().charAt(0);
		System.out.println("Valor digitador: "+ value);
		
		input.close();
	}

}
