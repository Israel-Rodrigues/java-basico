
package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e apresentar o maior
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio48 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor1, valor2, valor3;

		// Entrada de dados fornecidos pelo usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro valor: "));

		// Verificando o maior número e apresentando ao usuário
		if ((valor1 > valor2) && (valor1 > valor3)) {
			JOptionPane.showMessageDialog(null, valor1 + " é o maior número");
		} else if ((valor2 > valor1) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, valor2 + " é o maior número");
		} else {
			JOptionPane.showMessageDialog(null, valor3 + " é o maior número");
		}
	}
}
