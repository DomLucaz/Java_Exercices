package Collections;

import java.util.ArrayList;

import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		int op = 0;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> lista=new ArrayList();
		
		do {
			System.out.print("\n----------------------------------------");
			System.out.print("\n1) Deseja adicionar produto ao estoque");
			System.out.print("\n2) Deseja remover produto ao estoque?");
			System.out.print("\n3) Deseja atualizar produto do estoque?");
			System.out.print("\n4) Deseja mostrar todos os produtos do estoque?");
			System.out.print("\n0) SAIR DO PROGRAMA");
			System.out.print("\n-----------------------------");
			System.out.print("\nDIGITE SUA OPÇÃO: ");			
			op = scan.nextInt();  //O LEITOR
			System.out.print("\n----------------------------------------");
			
			
			switch(op) {
			
			case 1:
				scan.nextLine();
				System.out.print("\nDigite o nome do produto para adicionar ao estoque: ");
				String produto=scan.nextLine();
				lista.add(produto);
				System.out.println("\nProduto adicionado com sucesso!!!");
				break;
				
			case 2:
				scan.nextLine();
				System.out.print("\nDigite o nome do produto que deseja remover do estoque: ");
				String produtor = scan.nextLine();
				if(lista.contains(produtor)) {
					lista.remove(produtor);
					System.out.println("\nProduto removido com sucesso!!!");
				}
				else System.out.println("\nNão existe "+produtor+" no seu estoque!!!");
				break;
				
			case 3:
				scan.nextLine();
				System.out.print("\nDigite o nome do produto que deseja alterar do estoque: ");	String alterar = scan.nextLine();
				if(lista.contains(alterar)) {
					System.out.println("\nDigite o nome do produto que entra no lugar de"+alterar+ ": ");
					String novo = scan.nextLine();
					lista.remove(alterar);
					System.out.println("\nProduto alterado com sucesso!!!");
				}
				else System.out.println("\nNão existe"+alterar+" no seu estoque!!!\nImpossível alterar");
				break;
				
			case 4:
				scan.nextLine();
				System.out.print("\n--------------------------------------------------");
				System.out.print("\n--------------------------------------------------");
				System.out.print("\n4) PRODUTOS DO ESTOQUE: ");
				System.out.println(lista);
				System.out.print("\n--------------------------------------------------");
				System.out.print("\n--------------------------------------------------");
				break;
				
				default: System.out.print("\n--------------------------------------------------");
					System.out.print("\nOpção inválidade");
					System.out.print("\n--------------------------------------------------");
			}
		}while(op!=0);
	}

}
