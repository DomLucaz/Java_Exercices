package Exercise__java_day2;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		double resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0)
		{
			resultado = Math.sqrt(numero);
		}
		else
		{
			resultado = Math.pow(numero, 2);
		}
		
		System.out.println("\nResultado: "+resultado);
	}

}
