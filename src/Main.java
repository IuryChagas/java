// Exerc�cio 01 //  Revis�o de c�digo
// Fazer um script para ler as medidas da largura e comprimento de um terro rerangular com uma casa decimal, bem como  o valor do metro quadrado do terreno com duas casas decimais.
// Em seguida, o script deve mostrar o valor da �rea do terreno, bem como o valor do pre�o, ambos com duas casas decimais: 
// 
// Exemplo de entrada:			|		Exemplo de Sa�da:
//								|
// Largura: 10.0				|	AREA: 300.00
// Comprimento: 30.0			|	PRE�O: 60000.00
// Valor Metro: 200.00			|	


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double largura = input.nextDouble();
		double comprimento = input.nextDouble();
		double valorMetroQuadrado = input.nextDouble();
				
		double area = comprimento * largura;
		double valorTotal = area * valorMetroQuadrado;
		
		Locale.setDefault(Locale.US);
		System.out.println("\n");
		
		System.out.printf("Largura: %.1f%n", largura);
		System.out.printf("Comprimento: %.1f%n", comprimento);
		System.out.printf("Valor por metro: %.2f%n%n", valorMetroQuadrado);
		System.out.printf("AREA: %.2fm%n", area);
		System.out.printf("PRE�O: R$ %.2f", valorTotal);
	}

}