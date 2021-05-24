package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para para ler 20 n�meros e armazenar em um vetor. Ap�s a leitura
 * total dos 20 n�meros, o programa deve escrever esses 20 n�meros lidos na
 * ordem inversa.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio93 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o do vetor
		int vetor[] = new int[20];

		// Declara��o da vari�vel
		int i;

		// Entrada de dados com o auxilio do comando FOR
		for (i = 0; i < 20; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero " + i));
		}
		// Apresentando ao usu�rio os n�meros na ordem inversa
		i--;
		for (; i >= 0; i--) {
			System.out.println(vetor[i]);
		}

	}

}
