package Exercise__java_day2;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite a idade do competidor: ");
		idade = scan.nextInt();
	
		if(idade<10)
		{
			System.out.println("\nCompetidor sem categoria definida, menor de 10 anos..");
		}
		else if(idade>=10 && idade<=14)
		{
			System.out.println("\nCategoria Infantil.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria Juvenil.");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria Adulto");
		}
		else
		{
			System.out.println("\nCompetidor sem categoria definida, maior de 25 anos");
		}
	}

}
