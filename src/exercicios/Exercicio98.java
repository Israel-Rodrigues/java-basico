package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para a ler dois vetores V1 e V2 de 15 números cada. Calcular e
 * escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas
 * mesmas posições.
 *
 * 
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio98 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de vetores
		int v1[] = new int[15];
		int v2[] = new int[15];

		// Declaração de variáveis
		int i, j, quantidade = 0;

		// Entrada de dados com o auxilio do comando for
		for (i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores do primeiro vetor"));
		}
		for (j = 0; j < v2.length; j++) {
			v2[j] = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores do segundo vetor"));

			// Verificando a quantidade de valores iguais nos dois vetores
			for (i = 0; i < v2.length; i++) {
				if (v1[i] == v2[j]) {
					quantidade++;
				}
			}
		}
		// Exibindo o resultado ao usuário
		System.out.println("Quantidade de valores iguais nos dois vetores: " + quantidade);
	}

}
