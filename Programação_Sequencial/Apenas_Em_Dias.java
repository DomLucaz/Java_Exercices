package Programação_Sequencial;

import java.util.Scanner;

public class Apenas_Em_Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia,mes,ano;
		int dia_ano	=365;
		int dia_mes=30;
		int resolucao;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Informe quantos anos voce tem. Em anos , meses e dias. ");
		System.out.println("Anos: ");
		ano = scan.nextInt();
		System.out.println("Meses: ");
		mes = scan.nextInt();
		System.out.println("Dias: ");
		dia = scan.nextInt();
	

		resolucao=((ano*365)+(mes*30)+dia);
		
		System.out.printf("\t\tA sua idade é de: %d", resolucao);

	}

}
