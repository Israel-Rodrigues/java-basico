package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e escrev�-los em ordem decrescente
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio53 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		int valor1, valor2, valor3;

		// Entrada de dados forneidos pelo usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro valor: "));

		// Verificando a ordem crescente dos n�meros e apresentando ao usu�rio
		if ((valor1 > valor2) && (valor1 > valor3) && (valor2 > valor3) && (valor2 < valor1)) {
			JOptionPane.showMessageDialog(null, valor1 + " , " + valor2 + " , " + valor3);
		} else if ((valor1 > valor2) && (valor1 > valor3) && (valor3 > valor2) && (valor3 < valor1)) {
			JOptionPane.showMessageDialog(null, valor1 + " , " + valor3 + " , " + valor2);
		} else if ((valor2 > valor1) && (valor2 > valor3) && (valor1 > valor3) && (valor1 < valor2)) {
			JOptionPane.showMessageDialog(null, valor2 + " , " + valor1 + " , " + valor3);
		} else if ((valor2 > valor1) && (valor2 > valor3) && (valor3 > valor1) && (valor3 < valor2)) {
			JOptionPane.showMessageDialog(null, valor2 + " , " + valor3 + " , " + valor1);
		} else if ((valor3 > valor2) && (valor3 > valor1) && (valor2 > valor1) && (valor2 < valor3)) {
			JOptionPane.showMessageDialog(null, valor3 + " , " + valor2 + " , " + valor1);
		} else if ((valor2 < valor3) && (valor2 < valor1) && (valor3 > valor2)) {
			JOptionPane.showMessageDialog(null, valor3 + " , " + valor1 + " , " + valor2);
		}
	}
}
