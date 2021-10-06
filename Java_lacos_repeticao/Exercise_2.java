package Java_lacos_repeticao;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,par=0,impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (n=1;n<=10;n++)
		{
			System.out.println("\nDigite dez números: ");
			x = leia.nextInt();
			
			if(x % 2 == 0)	
			{			
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("\nQuantidade de valores pares: %d \nQuantidade de valores impares: %d", par, impar);
	

	}
}
