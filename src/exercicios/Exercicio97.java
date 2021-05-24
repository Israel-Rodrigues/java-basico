package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 20 números. Após isto, deverá ser lido mais um
 * número qualquer e verificar se esse número existe no vetor ou não. Se
 * existir, o programa deve gerar um novo vetor sem esse número. (Considere que
 * não haverá números repetidos no vetor).
 *
 * @author Israel Oliveira Rodrigues
 * @since 16 de fev. de 2021
 * 
 */
public class Exercicio97 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaraçao de vetor
		int valor[];
		int valor2[];

		// Declarando variável
		int busca, j;

		// Inicializar e definir o tamanho do vetor
		valor = new int[20];
		valor2 = new int[20];

		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < valor.length; i++) {
			valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		}
		busca = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser excluído"));

		// Incluindo um novo vetor para armazenar os valores sem o valor excluído
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
		// Exibindo ao usuário o vetor sem o valor excluído
		System.out.println("Vetor sem " + busca);
		for (int i = 0; i < valor2.length; i++) {
			System.out.println(valor2[i]);
		}
	}

}
