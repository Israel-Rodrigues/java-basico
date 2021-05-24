package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor A de 10 n�meros. Ap�s, ler mais um n�mero e
 * guardar em uma vari�vel X. Armazenar em um vetor M o resultado de cada
 * elemento de A multiplicado pelo valor X. Logo ap�s, imprimir o vetor M.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio92 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o dos vetores
		int a[] = new int[10];
		int b[] = new int[10];

		// Declara��o das vari�veis
		int x;
		int i;

		// Recebendo os valores do usu�rio
		for (i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o multiplicador"));

		// Realizando a multiplixa��o dos valores do vetor a por x e armazenando em b
		for (i = 0; i < b.length; i++) {
			b[i] = a[i] * x;
		}
		// Apresentando os dados ao usu�rio
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

}
