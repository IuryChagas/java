import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String value;
		
		value = input.next();
		System.out.println("Valor digitador: "+ value);
		
		input.close();
	}

}