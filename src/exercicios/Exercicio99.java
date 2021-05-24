package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para para ler um vetor de 10 números. Após isto, ler mais um número
 * qualquer, calcular e escrever quantas vezes esse número aparece no vetor.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio99 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração do vetor
		int vetor[] = new int[10];

		// Declaração das variáveis
		int num;
		int aparicao = 0;

		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		}
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser verificado:"));

		// Verificando quantas vezes o número informado apareceu no vetor
		for (int i = 0; i < 10; i++) {
			if (vetor[i] == num) {
				aparicao++;
			}
		}
		// Exibição do resultado ao usuário
		System.out.println("APARECE: " + aparicao + " VEZES");
	}
}
