
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);;
		Scanner input = new Scanner(System.in);
		
		String valueS;
		int valueInt;
		double  valueDoub;
		
		valueS = input.next();
		valueInt = input.nextInt();
		valueDoub = input.nextDouble();
		System.out.println("\nDados digitador:  \n");
		System.out.println("Palavra: "+ valueS);
		System.out.println("N° inteiro: "+ valueInt);
		System.out.println("N° Double: "+ valueDoub);
		
		input.close();
	}

}
