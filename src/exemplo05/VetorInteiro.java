package exemplo05;

/**
 * Programa para demonstrar a utilização de vetor do tipo inteiro
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class VetorInteiro {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// Declarando o vetor
		int vetor[];

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[3]; // 10 é o tamanho do vetor
		
		//Adicionando o valor 10 na 1ª posição do vetor no seu índice 0
		vetor[0] = 10;
		
		//Adicionando o valor 5 na 3 ª posição do vetor no seu índice 1
		vetor[1] = 5;
		
		//Adicionando o valor 25 na 3ª posição do vetor no seu índice 2
		vetor[2] = 25;
		
		// Exibindo o valor da primeira posição do vetor
		System.out.println(vetor[0]);
		
		// Exibindo o valor da segunda posição do vetor
		System.out.println(vetor[1]);
		
		// Exibindo o valor da terceira posição do vetor
		System.out.println(vetor[2]);
	}

}
