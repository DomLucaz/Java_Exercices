package Java_lacos_repeticao;

/*
Desenvolver um sistema para saber a caracter�stica psicol�gica dos indiv�duos de uma regi�o. 
Para tanto a cada pessoa era perguntado idade, sexo (1-feminino/ 2-masculino), 
e as opcoes (1- se a pessoa era calma; 2- se a pessoa era nervosa; 3- se a pessoa era agressiva).
pede-se elaborar um sistema que permita ler os dados de 150 pessoas calcule e mostre. 
- N�mero de pessoas calmas;
- N�mero de mulheres nervosas;
- N�mero de homens agressivos;
- N�mero de outros calmos;
- N�mero de pessoas nervosas com mais de 40 anos;
- N�umero de pessoas calmas com menos de 18 anos;
*/

import java.util.Scanner;		

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		int  age =0, gender =0, psico =0, pCalm = 0, wMad = 0, manAggr = 0, othersCalm = 0, pMad40 = 0, pCalm18 = 0, people = 0;
	
			System.out.print("\n Digite a sua idade: "); 
			age = read.nextInt();
			
			System.out.println("\nSelecione o seu g�nero: ");
			System.out.println("\n 1) Feminino\n 2) Masculino\n 3) Outros\n Op��o: "); 
			gender = read.nextInt();
			while(gender<1 || gender>3)
			{
				System.out.println("G�nero inv�lido, digite-o novamente");
				gender = read.nextInt();
			}
			System.out.print("\n Selecione a caracter�stica que mais se assemelha a voc�: ");
			System.out.println("\n 1) Calma\n 2) Nervosa\n 3) Agressiva\n Op��o: ");
			psico = read.nextInt();
			while(psico<1 || psico>3) {
				
				System.out.println("Caracter�stica inv�lida, selecione-a novamente");
				psico = read.nextInt();
			}
			while(people!=150)
			{
			if (psico==1) 
			{	
				pCalm++; //numbers people's calm
			}
			if (gender==1 && psico==2)
			{
				wMad++; // numbers women's mad
			}
			if (gender==2 && psico==3)
			{
				manAggr++;		// numbers men's aggressive
			}
			if(gender==3 && psico==1)
			{
				othersCalm++;	// Others gender's calm
			}
			if(age==40 && psico==2)
			{
				pMad40++; 		// People mad over 40 years
			}
			if(age<=18 && psico==1)
			{
				pCalm18++;		// People Calm under 18 years
			}
			System.out.println("Digite sua idade: ");
			age = read.nextInt();
			
			System.out.println("\n 1) Feminino\n 2) Masculino\n 3) Outros\n Op��o: "); 
			gender = read.nextInt();
			while(gender<1 || gender>3)
			{
				System.out.println("G�nero invalido. Digite-o novamente");
				gender = read.nextInt();
			}
			people++;
			}
			System.out.printf("\nO n�mero de pessoas calmas: %d", pCalm);
			System.out.printf("\nO n�mero de mulheres nervosas: %d", wMad);
			System.out.printf("\nO n�mero de homens agressivos: %d", manAggr );
			System.out.printf("\nO n�mero de pessoass de outros g�neros calmos: %d", othersCalm);
			System.out.printf("\nO n�mero de pessoas acima dos 40 nervosas: %d", pMad40);
			System.out.printf("\nO n�mero de abaixo dos 18 calmas: %d", pCalm18);
	}
	
}
