import com.sun.tools.sjavac.server.SysInfo;

public class Main {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		System.out.println("\n");
		
		System.out.println("Valor de [a]: "+ a);
		System.out.println("Valor de [b]: "+ b);
		System.out.println("Valor de [c]: "+ c+"\n");
		System.out.println("Raiz quadrada de [a]: "+ a);
		System.out.println("Raiz quadrada de [b]: "+ b);
		System.out.println("Raiz quadrada de  25: "+ c);
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		
		System.out.println("\n");
		
		System.out.println(x +" elevado à "+ y +" = "+ a);
		System.out.println(x +" elevado ao quadrado = "+ b);
		System.out.println("5.0 elevado ao quadrado = "+ c);
		

		System.out.println("\n");
		
		a = Math.abs(y);
		b = Math.abs(z);
		
		System.out.println("Valor absoluto de "+ y +" = "+ a);
		System.out.println("Valor absoluto de "+ z +" = "+ b);
		
		//  Para mais informações sobre funções matematicas em Java: java.lang.math
		//  link: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
	}

}
