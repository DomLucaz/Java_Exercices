package Java_lacos_repeticao;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, cont21 = 0, cont50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nPara interromper o programa digite -99 \n Informe sua idade: ");
		idade = leia.nextInt();
		
		while(idade!= -99)  //Contador de quantas pessoas possuem menos de 21 anos e mais de 50.
		{
			
			if(idade>50)
			{
				cont50++;
			}
			if(idade<21)
			{
				cont21++;
			}
			System.out.println("\n Informe sua idade: ");
			idade = leia.nextInt();
		}
		System.out.printf("\t\t\nPROGRAMA INTERROMPIDO!! \nPessoas com menos de 21 anos: %d", cont21);
		System.out.printf("\nPessoas com mais de 50 anos: %d", cont50);
	}

}
