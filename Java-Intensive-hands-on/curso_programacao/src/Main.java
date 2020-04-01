import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.321547;
		double z = 14.132564;
		
		System.out.printf("output do tipo formatado, imprimindo 2 casas decimais e adicionando uma nova linha: %.2f%n", x);
		System.out.printf("output do tipo formatado, imprimindo 5 casas decimais e adicionando uma nova linha: %.5f\n", z);
		System.out.println(x);
		System.out.println(y);
		System.out.println("etc!");
		
		System.out.println("\nPrinte com a formatação US:");
		Locale.setDefault(Locale.US);
		System.out.println(x);
	}

}
