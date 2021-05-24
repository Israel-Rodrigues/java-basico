package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler dois valores diferentes e escrever o maior entre eles
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio41 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor1, valor2;

		// Entrada de dados fornecidos pelo usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));

		// Realizando a compara��o para verificar o maior n�mero
		if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "O valor maior �: " + valor1);
		} else if (valor2 > valor1) {
			JOptionPane.showMessageDialog(null, "O valor maior �: " + valor2);
		}
	}
}
