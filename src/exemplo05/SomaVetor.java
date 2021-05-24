package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a soma de um vetor do tipo inteiro
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class SomaVetor {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Declarando o vetor
		int vetor[];
		
		// Declarando vari�vel auxiliar para somar o vetor
		int soma;
		
		// Inicializando o vetor
		vetor = new int[5];
		
		// Inicializando a vari�vel soma
		soma = 0;
		
		// Valorizando as posi��es do vetor com os dados informados pelo usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		// Somando o vetor com o auxilio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		// Exibindo o resultado da soma do vetor
		System.out.println(soma);
	}

}
