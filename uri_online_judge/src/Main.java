import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String name1 = input.next();
		int age1 = input.nextInt();
		String name2 = input.next();
		int age2 = input.nextInt();
		
		double media = (double)(age1 + age2) / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos %n ", name1, name2, media);
		
		
		input.close();
	}	

}
