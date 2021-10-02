package Programação_Sequencial;

import java.util.Scanner;

public class Evento_Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas, minutos, segundos, seg; 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = scan.nextInt();
		
		horas = (segundos/3600);
		minutos = ((segundos%3600) /60);
		seg = ((segundos%3600) %60);
		
		System.out.printf("A duração do evento foi de: %d horas, %d minutos, %d segundos", horas, minutos, seg );
	}

}
