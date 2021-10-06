package Java_lacos_repeticao;

import java.util.Scanner;

public class Exercise_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media, mg, somamedia=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=4;x++)
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia do aluno %d: %2.2f",x,media);
			
			somamedia = somamedia + media;
		}
		mg = somamedia / 4;
		System.out.println("\nMédia geral: "+mg);
		
	}
}
