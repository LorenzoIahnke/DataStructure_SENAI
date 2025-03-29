package datasctructure;

import java.util.Scanner;
import java.util.Arrays;

public class BuscaBinaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tamanho = obterTamanhoVetor(scanner);
		VetorBusca vetorBusca = new VetorBusca(tamanho);
		vetorBusca.preencherVetor(scanner);
		vetorBusca.exibirVetor();
		System.out.println("Digite o número a ser buscado: ");
		int numeroBusca = scanner.nextInt();
		
		int resultado = vetorBusca.buscaBinaria(numeroBusca);
		if(resultado != -1) {
			System.out.println("Numero encontrado no indice " + resultado);
		}else {
			System.out.println("Não encontrado");
		}
		scanner.close();
	}
	
	//método para obter tamanho
	public static int obterTamanhoVetor(Scanner scanner) {
		int tamanho;
		do {
			System.out.println("Digite o tamanho vetor: ");
			tamanho = scanner.nextInt();
			if(tamanho < 5 || tamanho > 25) {
				System.out.println("Inválido!!");
			}
		}while(tamanho < 5 || tamanho > 25);
		return tamanho;
	}

}
