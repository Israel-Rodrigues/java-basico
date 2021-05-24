package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para para ler um vetor de 10 n�meros. Ap�s isto, ler mais um n�mero
 * qualquer, calcular e escrever quantas vezes esse n�mero aparece no vetor.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio99 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o do vetor
		int vetor[] = new int[10];

		// Declara��o das vari�veis
		int num;
		int aparicao = 0;

		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		}
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero a ser verificado:"));

		// Verificando quantas vezes o n�mero informado apareceu no vetor
		for (int i = 0; i < 10; i++) {
			if (vetor[i] == num) {
				aparicao++;
			}
		}
		// Exibi��o do resultado ao usu�rio
		System.out.println("APARECE: " + aparicao + " VEZES");
	}
}
