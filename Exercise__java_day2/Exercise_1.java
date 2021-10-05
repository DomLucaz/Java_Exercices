package Exercise__java_day2;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\n Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\n Digite o terceiro número");
		n3 = leia.nextInt();
		
		
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO número maior é: "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("\nO numéro maior é: "+n2);
		}
		else 
		{
			System.out.println("\nO número maior é: "+n3);
		}
		
		
	}

}
