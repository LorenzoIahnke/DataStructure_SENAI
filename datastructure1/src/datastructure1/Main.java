package datastructure1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos filhos você tem?: ");
		int qtdFilhos = scanner.nextInt();

		// Verifica se o número de filhos está dentro dos limites (entre 5 e 25)
		// Se o valor for inválido, o código não continuará
		if (qtdFilhos >= 5 && qtdFilhos <= 25) {
			// Cria um array com o tamanho baseado na quantidade de filhos informada
			int[] filhos = new int[qtdFilhos];

			// Preenche o array com as idades informadas pelo usuário
			for (int i = 0; i < filhos.length; i++) {
				System.out.println("Digite a idade do filho " + (i + 1) + ": ");
				filhos[i] = scanner.nextInt();
			}

			// Exibe as idades dos filhos separadas por "|"
			System.out.println("Idade filhos: ");
			for (int idade : filhos) {
				System.out.print(idade + " | ");
			}

			// Ordena o vetor para garantir que a busca binária funcione corretamente
			Arrays.sort(filhos);
			System.out.println("\nIdades ordenadas: ");
			for (int idade : filhos) {
				System.out.print(idade + " | ");
			}

			// Solicita uma idade para verificar se existe no array
			System.out.println("\nQual idade você quer conferir?: ");
			int idades = scanner.nextInt();

			// Se o valor digitado for diferente de -1, realiza a busca
			if (idades != -1) {
				// Usa a busca binária para tentar encontrar a idade no array
				int resultado = BinarySearch.searchInteractive(filhos, idades);

				// Se o valor for encontrado, retorna o índice
				if (resultado != -1) {
					System.out.println("Elemento encontrado no índice: " + resultado);
				} else {
					// Se não for encontrado, informa ao usuário
					System.out.println("Não encontrado.");
				}
			}

		} else {
			System.out.println("Inválido!");
		}

		scanner.close();
	}

}
