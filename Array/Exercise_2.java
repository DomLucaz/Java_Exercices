package Array;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = new int[6];			// Vector
		int somapar=0, somaimpar=0, x;
		
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEntre com seis valores: ");
			number[x] = read.nextInt();
		}		
		for(x=0;x<6;x++)
		{
				if(number[x] % 2 == 0)
				{
					System.out.println("\n Valores pares: "+number[x]);
					somapar += number[x];	
				}
		}
				for(x=0;x<6;x++)
				{
				if(number[x] % 2 != 0 )
				{
					System.out.println("\nValores impares: " +number[x]);
					somaimpar++;
				}
				}
		System.out.printf("\nA soma dos valores pares: %d ", somapar); 
		System.out.printf("\nQuantidade de valores impares digitados: %d ", somaimpar);
		}
		
}


