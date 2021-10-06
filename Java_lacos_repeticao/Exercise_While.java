package Java_lacos_repeticao;

import java.util.Scanner;

public class Exercise_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somanumero=0,cont=0;
		float medianumero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();
		
		while(numero!=0)
		{
			somanumero += numero;
			
			System.out.println("\nEntre com um próximo número: ");
			numero = leia.nextInt();
		}
		medianumero = somanumero / cont;
		System.out.printf("\nMédia dos números: %.2f", medianumero);
				
	}

}
