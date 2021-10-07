package Array;

import java.util.Scanner;

public class First_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float medias[] = new float[4];
		float somamedia=0, mediageral, n1,n2,n3;
		int x;
		
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<4;x++)
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = read.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = read.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = read.nextFloat();
			
			medias[x] = (n1+n2+n3)/3;
			
			System.out.printf("\nMédia do aluno %d: %2.2f", x+1,medias[x]);
			somamedia += medias[x];
		}
		mediageral = somamedia / 4;
		System.out.printf("\nMédia geral: %2.2f", mediageral);
		
	}

}
