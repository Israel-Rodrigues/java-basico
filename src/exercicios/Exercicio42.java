package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e escrevê-los em ordem crescente
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor1, valor2;

		// entrada de dados fornecidos pelo usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));

		// apresentando os valores em ordem crescente
		if (valor1 < valor2) {
			JOptionPane.showMessageDialog(null, "Ordem crescente: " + valor1 + " , " + valor2);
		} else {
			JOptionPane.showMessageDialog(null, "Ordem crescente: " + valor2 + " , " + valor1);
		}
	}
}
