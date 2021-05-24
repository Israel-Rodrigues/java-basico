package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e informar se formam um tri�ngulo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor1, valor2, valor3;

		// Entrada de dados fornecidos pelo usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro valor: "));

		// Verificando se os valores forma um tri�ngulo
		if ((valor1 < valor2 + valor3) && (valor2 < valor1 + valor3) && (valor3 < valor1 + valor2)) {
			JOptionPane.showMessageDialog(null, "Os valores informados formam um tri�ngulo");
		} else {
			JOptionPane.showMessageDialog(null, "Os valores informados n�o formam um tri�ngulo");

		}
	}
}
