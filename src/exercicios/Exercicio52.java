package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e escrevê-los em ordem crescente
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio52 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor1, valor2, valor3;

		// Entrada de dados forneidos pelo usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro valor: "));

		// Verificando a ordem crescente dos números e apresentando ao usuário
		if ((valor1 < valor2) && (valor1 < valor3) && (valor2 < valor3) && (valor2 > valor1)) {
			JOptionPane.showMessageDialog(null, valor1 + " , " + valor2 + " , " + valor3);
		} else if ((valor1 < valor2) && (valor1 < valor3) && (valor3 < valor2) && (valor3 > valor1)) {
			JOptionPane.showMessageDialog(null, valor1 + " , " + valor3 + " , " + valor2);
		} else if ((valor2 < valor1) && (valor2 < valor3) && (valor1 < valor3) && (valor1 > valor2)) {
			JOptionPane.showMessageDialog(null, valor2 + " , " + valor1 + " , " + valor3);
		} else if ((valor2 < valor1) && (valor2 < valor3) && (valor3 < valor1) && (valor3 > valor2)) {
			JOptionPane.showMessageDialog(null, valor2 + " , " + valor3 + " , " + valor1);
		} else if ((valor3 < valor2) && (valor3 < valor1) && (valor2 < valor1) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, valor3 + " , " + valor2 + " , " + valor1);
		} else if ((valor2 > valor3) && (valor2 > valor1) && (valor3 < valor2)) {
			JOptionPane.showMessageDialog(null, valor3 + " , " + valor1 + " , " + valor2);
		}
	}
}
