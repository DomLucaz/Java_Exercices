package POO;

import java.util.Scanner;

public class AirplaneAbject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner read = new Scanner(System.in))
		{
			System.out.println("---Teste da Classe Cliente---");
			AirplaneCustomer customer1 = new AirplaneCustomer("Lucas", "111.111.111.-11", "Masculino", "teste@teste.com", "(11) 9999-9999");
				customer1.purchaseItem();
				customer1.refundItem();
				customer1.printInfo();
				//-----------------------------------------------------------------------------------------------------------------------------
			System.out.println("\n--Teste da Classe Funcion�rio---");
			System.out.print("Digite o nome do funcion�rio: ");
			String name = read.nextLine();
			System.out.print("Digite o CPF do Funcion�rio: ");
			String cpf = read.nextLine();
			System.out.print("Digite o RG do funcion�rio: ");
			String rg = read.nextLine();
			System.out.print("Digite o g�nero do funcion�rio: ");
			String gender = read.nextLine();
			System.out.print("Digite o e-mail do Funcion�rio: ");
			String email = read.nextLine();
			System.out.print("Digite a Data de nascimento do funcion�rio: ");
			String birth_date = read.nextLine();
			System.out.print("Digite a matr�cula do funcion�rio: ");
			String registration = read.nextLine();	
			System.out.print("Digite o cargo do funcion�rio: ");
			String role = read.nextLine();	
			System.out.print("Digite o sal�rio do funcion�rio: ");
			double salary = read.nextDouble();
			AirplaneEmployee Employee1 = new AirplaneEmployee(name, cpf, rg, gender, email, birth_date, registration, role, salary);
			Employee1.printInfo();
			//----------------------------------------------------------------------------------------------------------------------------------
			System.out.println("\nTeste da Classe Avi�o---");
			String maker, brand, colour; int seats;
			AirplaneClass[]airplanes = new AirplaneClass[3];
			
			for(int i=0; i<airplanes.length;i++)
			{
				read.nextLine();
				System.out.print("Digite o fabricante da aeronave: ");
				maker = read.nextLine();
				System.out.print("Digite o modelo da aeronave: ");
				brand = read.nextLine();
				System.out.print("Digite o fabricante da aeronave: ");
				colour = read.nextLine();
				System.out.print("Digite a quantidade de assentos da aeronave: ");
				seats = read.nextInt();
				airplanes[i]= new AirplaneClass(maker, brand, colour, seats);
				System.out.println("------------------------------------------------");
			}
			System.out.print("\nBD de Aeronaves\n");
			for(AirplaneClass x: airplanes)
			{
				x.printInfo();
			}
			airplanes[0].statusFlying();
			airplanes[1].statusFlying();
			
			System.out.print("\nBD de Aeronaves\n");
			for(AirplaneClass x: airplanes) {
				x.printInfo();
			}
		}
	}

}
