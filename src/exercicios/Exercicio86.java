package exercicios;

import javax.swing.JOptionPane;

/**
 * 
 * Programa que imprima as seguintes sequências de números: (1, 1 2 3 4 5 6 7 8
 * 9 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8
 * 9 10) e assim sucessivamente, até que o primeiro número (antes da vírgula),
 * também chegue a 10.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio86 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		String result = "";

		// Fazendo a repetição dos dados
		for (int i = 1; i <= 10; i++) {
			result += i + ", 1 2 3 4 5 6 7 8 9 10" + "\n";
		}
		// Apresentação dos dados ao usuário
		JOptionPane.showMessageDialog(null, result);
	}

}
