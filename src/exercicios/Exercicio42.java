package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e escrev�-los em ordem crescente
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor1, valor2;

		// entrada de dados fornecidos pelo usu�rio
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
