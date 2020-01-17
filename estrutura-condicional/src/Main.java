// Um plano básico de telefonia cobra R$50,00 por 100 minutos dentro da franquia. Cada minuto excedido custa +R$2.00.
// O script deve mostrar a quantidade de minutos consumido e também o valor a ser pago.
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			double valorFranquia, minutosFranquia, valorMinutoExcedente, minutoExcedente, totalMinutos, contaTotal;
			
			minutosFranquia = 100.0;
			valorFranquia = 50.0;
			valorMinutoExcedente = 2.0;
			
			System.out.println("Quantos minutos você utilizou? \n");
			totalMinutos = input.nextDouble();
			
			if(totalMinutos <= minutosFranquia) {
				System.out.println("Valor total à pagar: R$50,00 reais");
			}else {
				contaTotal = (totalMinutos - minutosFranquia) * valorMinutoExcedente;
				contaTotal += valorFranquia; // += é o mesmo que contaTotal = contaTotal + valorFranquia;
				minutoExcedente = totalMinutos - minutosFranquia;
				System.out.println("Você ultrapassou o valor da franquia! \n");
				System.out.printf("Minutos fora da franquia: %.0f min%n", minutoExcedente);
				System.out.printf("Total à pagar: R$%.2f", contaTotal);
			}
			
		input.close();
	}

}