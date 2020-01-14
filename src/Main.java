import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Products: \n");
		
		String product1 = "Computer";
		String product2 = "Office desk";
		String gender = "F";
		
		int age = 27;
		int code = 5290;
		
		double price1 = 2100.00;
		double price2 = 650.00;
		double measure = 53.234567;
		
		System.out.printf("%s, whitch price is $ %.2f%n", product1, price1);
		System.out.printf("%s, whitch price is $ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, %d and %s:%n%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n%n", measure);
	}

}
