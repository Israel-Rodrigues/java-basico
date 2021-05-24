
package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e apresentar o menor
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio49 {

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

		// Verificando o maior n�mero e apresentando ao usu�rio
		if ((valor1 < valor2) && (valor1 < valor3)) {
			JOptionPane.showMessageDialog(null, valor1 + " � o menor n�mero");
		} else if ((valor2 < valor1) && (valor2 < valor3)) {
			JOptionPane.showMessageDialog(null, valor2 + " � o menor n�mero");
		} else {
			JOptionPane.showMessageDialog(null, valor3 + " � o menor n�mero");
		}
	}
}
