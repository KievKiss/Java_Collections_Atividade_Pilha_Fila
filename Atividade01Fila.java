package AtividadePilhaFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01Fila {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Queue<String> fila = new LinkedList<String>();
		
		int op;
		
		do{
			
			System.out.println("\n******************************************");
			System.out.println("\n(1) Para adicionar clientes na fila");
			System.out.println("\n(2) Para listar todos os clientas da fila");
			System.out.println("\n(3) Para Retirar clientes da fila");
			System.out.println("\n(0) Para sair\n");
			System.out.println("\n******************************************");
			System.out.println("\nEscolha uma opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o seu nome: ");
				String nome = ler.nextLine();
				
				if(nome.isEmpty()) { 
					System.out.println("\nO nome não foi adicionado na fila");
				}else {
				fila.add(nome);
				System.out.println("\n Cliente adicionado...\n");
				}
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nLista de clientes na fila...");
				
				for(Iterator<String> it = fila.iterator();it.hasNext();) { 
					System.out.println(it.next());
				}
				break;
			case 3:
				ler.nextLine();
				
				if(fila.isEmpty() == true) {
					System.out.println("\nA fila está vazia...");
				}else {
					System.out.printf("\nO cliente %s foi chamado!",fila.poll());
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println();
				}
				break;
			case 0:
				System.out.println("\n Até mais...");
				break;
			default:
				System.out.println("\n Opção inválida!!!");				
			}
		}while(op !=0);
		
	}

}
