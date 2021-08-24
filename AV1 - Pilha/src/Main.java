import java.util.Scanner;

public class Main {			//Moises José Aleixo neto   191091434

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		Pilha<Frase> pilha = new Pilha();
		
		System.out.println("1 - Adicionar frase");
		System.out.println("2 - Exibir topo");
		System.out.println("3 - Mostrar proximo dado");
		System.out.println("4 - Quantia de frases");
		System.out.println("5 - Sair");
		
		int num = entrada.nextInt();
		do {
			
			switch(num) {
				case 1:
						System.out.println("Digite a frase: ");
						entrada.nextLine();
						String frase = entrada.nextLine();
						pilha.insert(frase);
					break;
				case 2:
						if(pilha.estaVazia()) {
							System.out.println("Pilha sem dados");
						}else {
							System.out.println(pilha.get());
						}
					break;
				case 3:
						if(pilha.getTamanho() == 1) {
							System.out.println("Não tem proximo dado");
							System.out.println("-> " + pilha.get());
						}else if(pilha.estaVazia()) {
							System.out.println("Pilha vazia");
						}else {
							pilha.remove();
							System.out.println(pilha.get());
						}
					break;
				case 4:
						if(pilha.getTamanho() == 1) {
							System.out.println(pilha.getTamanho() + " frase");
						}else if(pilha.getTamanho() == 0) {
							System.out.println("Pilha vazia");
						}else {
							System.out.println(pilha.getTamanho() + " frases");
						}
					break;	
			}
			System.out.println("---------------------------------------");
			System.out.println("1 - Adicionar frase");
			System.out.println("2 - Exibir topo");
			System.out.println("3 - Mostrar proximo dado");
			System.out.println("4 - Quantida de dados");
			System.out.println("5 - sair");
			
			num = entrada.nextInt();
			
		}while(num != 5);
		System.out.println("Programa finalizado! ");
	}

}
