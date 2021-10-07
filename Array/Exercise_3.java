package Array;

import java.util.Scanner;

/* Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = new int [3][3];	//Array is that ridiculous chart in excel
		int linha,coluna, maior=0;
		
		Scanner read = new Scanner(System.in);
	
		for(linha=0;linha<3;linha++)
				{
					for(coluna=0;coluna<3;coluna++)
					{
						System.out.printf("\nInsira o valor na linha[%d]e na coluna[%d]:",linha, coluna);
						array[linha][coluna] = read.nextInt();
						
						if(array[linha][coluna] > 10)
						{
							maior++; 
						}
						
					}	
				}
		System.out.printf("\nHá %d valores maiores que 10", maior);
	}		
}
