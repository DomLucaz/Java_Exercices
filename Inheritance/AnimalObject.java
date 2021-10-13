package Inheritance;

import java.util.Scanner;

public class AnimalObject {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int op;
	
	DogClass au = new DogClass("Apolo", 12,"Cachorro","Carnívoro", "Dachshund");
	HorseClass pocoto = new HorseClass("Kentucky", 8,"Cavalo","Herbívoro", "Arabian Horse");
	SlothClass lerdo = new SlothClass("Sloth", 9,"bixo-preguiça","Herbívoro", "Bradypus torquatus");
	
	do {
		
			System.out.println("\n-----------------------------");
			System.out.printf("\n 1) Cachorro");
			System.out.printf("\n 2) Cavalo");
			System.out.printf("\n 3) Bicho-preguiça");
			System.out.printf("\n Opção: ");
			System.out.println("\n-------------------------------");
			op = scan.nextInt();
			
			switch (op) {
			
			case 1: au.print();
			System.out.print("\n----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 1) Exibir ação");
			System.out.print("\n Opção:");
			op = scan.nextInt();
			while (op >=1 || op<= 2) {
				if (op == 1) {
					au.sound();
					break;
				} if (op == 2) {
					au.run();
					break;
					}
			}
			break;
			
			case 2: pocoto.print();
			System.out.print("\n----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 1) Exibir ação");
			System.out.print("\n Opção: ");
			op = scan.nextInt();
			while (op >=1 || op<= 2) {
				if (op == 1) {
					pocoto.sound();
					break;
				} if (op == 2) {
					pocoto.run();
					break;
					}
			}
			break;
			
			case 3:	lerdo.print();
			System.out.print("\n----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 1) Exibir ação");
			System.out.print("\n Opção: ");
			op = scan.nextInt();
			while (op >=1 || op<= 2) {
				if (op == 1) {
					lerdo.sound();
					break;
				} if (op == 2) {
					lerdo.climb();
					break;
					}
			}
			break;
			default: System.out.println("\n\tOPÇÃO INVALIDA!!!!!"); break;
					}
		} 	while (op!=0);
	} 	
}

