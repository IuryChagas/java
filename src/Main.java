import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String name = "Marciano";
		int age = 31;
		double income = 5000;
		
		System.out.printf("%s tem %d anos e seu salário atual é: R$%.2f%n", name, age, income);
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e seu salário atual é: R$%.2f%n", name, age, income);
		System.out.println("\n Nome: "+name+"\n Idade: "+age+"\n Salário: "+income);
	}

}
