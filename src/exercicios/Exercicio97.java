package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 20 n�meros. Ap�s isto, dever� ser lido mais um
 * n�mero qualquer e verificar se esse n�mero existe no vetor ou n�o. Se
 * existir, o programa deve gerar um novo vetor sem esse n�mero. (Considere que
 * n�o haver� n�meros repetidos no vetor).
 *
 * @author Israel Oliveira Rodrigues
 * @since 16 de fev. de 2021
 * 
 */
public class Exercicio97 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara�ao de vetor
		int valor[];
		int valor2[];

		// Declarando vari�vel
		int busca, j;

		// Inicializar e definir o tamanho do vetor
		valor = new int[20];
		valor2 = new int[20];

		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < valor.length; i++) {
			valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		}
		busca = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser exclu�do"));

		// Incluindo um novo vetor para armazenar os valores sem o valor exclu�do
		j = 0;
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != busca) {
				j = j + 1;
				valor2[j] = valor[i];
			}
		}
		if (j != 20) {
			System.out.println("Nao ocorre no vetor");
		}
		// Exibindo ao usu�rio o vetor sem o valor exclu�do
		System.out.println("Vetor sem " + busca);
		for (int i = 0; i < valor2.length; i++) {
			System.out.println(valor2[i]);
		}
	}

}
