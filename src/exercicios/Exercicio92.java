package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor A de 10 números. Após, ler mais um número e
 * guardar em uma variável X. Armazenar em um vetor M o resultado de cada
 * elemento de A multiplicado pelo valor X. Logo após, imprimir o vetor M.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio92 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração dos vetores
		int a[] = new int[10];
		int b[] = new int[10];

		// Declaração das variáveis
		int x;
		int i;

		// Recebendo os valores do usuário
		for (i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o multiplicador"));

		// Realizando a multiplixação dos valores do vetor a por x e armazenando em b
		for (i = 0; i < b.length; i++) {
			b[i] = a[i] * x;
		}
		// Apresentando os dados ao usuário
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

}
