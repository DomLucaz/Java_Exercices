package Exercise__java_day2;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\n Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\n Digite o terceiro n�mero");
		n3 = leia.nextInt();
		
		
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO n�mero maior �: "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("\nO num�ro maior �: "+n2);
		}
		else 
		{
			System.out.println("\nO n�mero maior �: "+n3);
		}
		
		
	}

}
