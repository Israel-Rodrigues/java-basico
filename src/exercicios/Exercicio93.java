package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para para ler 20 números e armazenar em um vetor. Após a leitura
 * total dos 20 números, o programa deve escrever esses 20 números lidos na
 * ordem inversa.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio93 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração do vetor
		int vetor[] = new int[20];

		// Declaração da variável
		int i;

		// Entrada de dados com o auxilio do comando FOR
		for (i = 0; i < 20; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número " + i));
		}
		// Apresentando ao usuário os números na ordem inversa
		i--;
		for (; i >= 0; i--) {
			System.out.println(vetor[i]);
		}

	}

}
