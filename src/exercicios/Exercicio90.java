package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Solicitar números para o usuário e armazenar em um vetor de 20
 * posições (aceitar somente números positivos). Escrever a seguir o valor do
 * maior elemento e a respectiva posição que ele ocupa no vetor.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio90 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração do vetor
		int vetor[];

		// Declaração de variável
		int maior, posicao;

		// Inicializando o Vetor e definindo seu tamanho 
		vetor = new int[20];

		// Inicializando as variáveis
		maior = 0;
		posicao = 0;

		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));

			if (vetor[i] < 0) { // Mensagem caso seja digitado um valor negativo
				JOptionPane.showMessageDialog(null, "Você digitou um valor negativo.");

				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));
			}
		}
		// Verificando o maior valor e a posição
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		// Exibição do resultado ao usuário
		System.out.println("O maior elemento é: " + maior);
		System.out.println("Na posição: " + posicao);
	}

}
