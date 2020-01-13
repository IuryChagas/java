# Introdução à Syntax Java e exercícios

```
import java.util.Locale;

public class Main {
  public static void main(String[] args){
	// intro java syntax
	int y = 33;
	double x = 14.56436;

	string name = "Fulano";
	int age = 32;
	double income = 5000.0;

	System.out.println("Valor de Y: "+ y);
	System.out.printf("Ponto flutuante: %.4f%n", x);
	System.out.printf("Ponto flutuante: %.2f%n", x);
	Locale.setDefault(Locale.US);
	System.out.printf("Ponto Flutuante US: %.4f%n", x);
	System.out.printf("Ponto Flutuante US: %.2f%n", x);

	System.out.println("Resultado: = " + x + " metros");
	System.out.printf("Resultado = %.4f metros%n", x);
	System.out.printf(%s tem %d anos e ganha R$%.2f reais%n ", name, age, income);

	// ### Tipos de marcadores ###
	// %f = float "ponto flutuante"
	// %d = inteiro
	// %s = string "texto"
	// %n = quebra de linha
	
  }
}


```
