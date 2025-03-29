package datastructure;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanho;
		do {
			System.out.println("Determine o Tamanho do Vetor: ");
			tamanho = scanner.nextInt();			
		}while(tamanho < 5 || tamanho > 25);
		int[] vetor = new int[tamanho];
		
		System.out.println("Digite os " + tamanho + " número inteiros do vetor: ");
		for(int i = 0; i<tamanho; i++) {
			System.out.println("Elemento " + (i+1) + ": ");
			vetor[i] = scanner.nextInt();
		}
			
		Arrays.sort(vetor);
		System.out.println("Vetor Ordenado: " + Arrays.toString(vetor));
		
		System.out.println("Digite o numero: ");
		int numeroBusca = scanner.nextInt();
		
		int resultado = buscaBinaria(vetor, numeroBusca);
		if(resultado != -1) {
			System.out.println("Numero encontrado no indice: " + resultado);
		}else {
			System.out.println("Não encontrado");
		}
		scanner.close();
	}
	
	public static int buscaBinaria(int[] vetor, int chave) {
		int inicio = 0, fim = vetor.length -1;
		while(inicio<=fim) {
			int meio = (inicio + fim)/2;
			if(vetor[meio] == chave) {
				return meio;
			}else if(vetor[meio] < chave){
				inicio = meio + 1;
			}else {
				fim = meio - 1;
			}
		}
		return -1;
	}
}
