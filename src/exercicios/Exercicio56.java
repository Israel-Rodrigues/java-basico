package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para comparar dois números e verificar se são: iguais ou qual é o
 * maior
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor1, valor2;

		// Entrada de dados fornecidos pelo usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));

		// realização da comparação e apresentação ao usuário
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "Valores iguais: ");
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "O primeiro é maior.");
		} else {
			JOptionPane.showMessageDialog(null, "O segundo é maior.");
		}
	}

}
