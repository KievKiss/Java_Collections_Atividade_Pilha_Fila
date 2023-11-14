package AtividadePilhaFila;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Atividade02Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int op;//Opções
		
		
		do {
			
			System.out.println("\n****************************");
			System.out.println("\n(1) Adicionar Livro na Pilha");
			System.out.println("\n(2) Listar todos os Livros");
			System.out.println("\n(3) Retirar Livro da Pilha");
			System.out.println("\n(0) Sair");
			System.out.println("\n****************************");
			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();
		
			switch(op) {
			case 1:
					leia.nextLine();
					System.out.println("Digite o nome do livro");
					String nome = leia.nextLine();
					
					if(nome.isEmpty()) {
						System.out.println("Nome do livro não foi adicionado a lista");
					}else {
						pilha.add(nome);
						System.out.println("\nLivro adicionado!");
					}  
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nLista de livros na fila...");
				
				for(Iterator<String> it = pilha.iterator();it.hasNext();){
					System.out.println(it.next());
				}
				break;
				
			case 3:
				leia.nextLine();
				
				if(pilha.isEmpty() == true) {
					System.out.println("\nA fila está vazia...");
				}else {
					System.out.printf("\nO livro %s foi retirado!",pilha.pop());
					System.out.println("\n fila: \n");
					
					for(Iterator<String> it = pilha.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println();
				}
				break;
			case 0:
				System.out.println("\n Até mais... :)");
				break;
			default:
				System.out.println("\n Opção inválida!!!");				
			}
		}while(op != 0);

	}

}
