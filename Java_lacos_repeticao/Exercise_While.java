package Java_lacos_repeticao;

import java.util.Scanner;

public class Exercise_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somanumero=0,cont=0;
		float medianumero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		numero = leia.nextInt();
		
		while(numero!=0)
		{
			somanumero += numero;
			
			System.out.println("\nEntre com um pr�ximo n�mero: ");
			numero = leia.nextInt();
		}
		medianumero = somanumero / cont;
		System.out.printf("\nM�dia dos n�meros: %.2f", medianumero);
				
	}

}
