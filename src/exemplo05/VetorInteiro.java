package exemplo05;

/**
 * Programa para demonstrar a utiliza��o de vetor do tipo inteiro
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class VetorInteiro {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Declarando o vetor
		int vetor[];

		// Iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new int[3]; // 10 � o tamanho do vetor
		
		//Adicionando o valor 10 na 1� posi��o do vetor no seu �ndice 0
		vetor[0] = 10;
		
		//Adicionando o valor 5 na 3 � posi��o do vetor no seu �ndice 1
		vetor[1] = 5;
		
		//Adicionando o valor 25 na 3� posi��o do vetor no seu �ndice 2
		vetor[2] = 25;
		
		// Exibindo o valor da primeira posi��o do vetor
		System.out.println(vetor[0]);
		
		// Exibindo o valor da segunda posi��o do vetor
		System.out.println(vetor[1]);
		
		// Exibindo o valor da terceira posi��o do vetor
		System.out.println(vetor[2]);
	}

}
