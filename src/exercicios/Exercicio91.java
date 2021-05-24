package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Solicitar números para o usuário e armazenar em um vetor de 20
 * posições (aceitar somente números positivos). Escrever a seguir o valor do
 * menor elemento e a respectiva posição que ele ocupa no vetor. 
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio91 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		// Declaração do vetor
				int vetor[];

				// declaração de variável
				int menor, posicao;

				// Inicializando o Vetor
				vetor = new int[20];

				// Inicializando a variável
				menor = 9999;
				posicao = 9999;

				// Entrada de dados com o auxilio do comando FOR
				for (int i = 0; i < vetor.length; i++) {
					vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));

					if (vetor[i] < 0) {
						JOptionPane.showMessageDialog(null, "Você digitou um valor negativo.");

						vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));
					}
				}
				// Verificando qual o menor elemento e em qual posição esta
				for (int i = 0; i < vetor.length; i++) {
					if (vetor[i] < menor) {
						menor = vetor[i];
						posicao = i;
					}
				}
				// Exibição do resultado ao usuário
				System.out.println("O menor elemento é: " + menor);
				System.out.println("Na posição: " + posicao);
			}

		}
