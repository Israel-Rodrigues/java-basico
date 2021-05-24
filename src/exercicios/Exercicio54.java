package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e informar se formam um triângulo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio54 {

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

		// Verificando se os valores forma um triângulo
		if ((valor1 < valor2 + valor3) && (valor2 < valor1 + valor3) && (valor3 < valor1 + valor2)) {
			JOptionPane.showMessageDialog(null, "Os valores informados formam um triângulo");
		} else {
			JOptionPane.showMessageDialog(null, "Os valores informados não formam um triângulo");

		}
	}
}
