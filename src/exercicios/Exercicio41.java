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
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor1, valor2;

		// Entrada de dados fornecidos pelo usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));

		// Realizando a comparação para verificar o maior número
		if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "O valor maior é: " + valor1);
		} else if (valor2 > valor1) {
			JOptionPane.showMessageDialog(null, "O valor maior é: " + valor2);
		}
	}
}
