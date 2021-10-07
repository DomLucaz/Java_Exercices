package Array;

import java.util.Scanner;

public class Array_second_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[][] = new int [2][3];
		int linha,coluna, contpar=0, contimpar=0;
		
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna] = read.nextInt();
			}
		}
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				if(numeros[linha][coluna] % 2 == 0)
				{
					System.out.println("\n"+numeros[linha][coluna]+" <-- Este número é par");
					contpar++;;
				}
				else
				{
					System.out.println("\n"+numeros[linha][coluna]+" <-- Este número é impar");
					contimpar++;
				}
			}
		}
		System.out.printf("\nTemos: %d números pares \nTemos: %d números impares ", contpar, contimpar);
	
	}

}
