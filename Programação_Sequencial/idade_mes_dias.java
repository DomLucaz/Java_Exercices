package Programação_Sequencial;

import java.util.Scanner;

public class idade_mes_dias {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int totaldias, ano, mes, dia;
				
				Scanner scan = new Scanner (System.in);
				
				System.out.println("Entre com o total de dias vividos: ");
				totaldias = scan.nextInt();
				
				ano = (totaldias / 365);
				mes = ((totaldias % 365)/ 30);
				dia = ((totaldias % 365) % 30);
				
				System.out.printf("Eu tenho: %d anos %d meses e %d dias", ano, mes, dia);
				
			}
	}


