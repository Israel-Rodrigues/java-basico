package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e escrever a multiplicação dos dois menores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio51 {

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

		// Verificando os dois maiores números e apresentando a soma deles
		if ((valor1 > valor2) && (valor1 > valor3)) {
			JOptionPane.showMessageDialog(null, "A multiplicação dos dois valores menores é: " + (valor2 * valor3));
		} else if ((valor2 > valor1) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, "A multiplicação dos dois valores menores é: " + (valor1 * valor3));
		} else {
			JOptionPane.showMessageDialog(null, "A multiplicação dos dois valores menores é: " + (valor1 * valor2));
		}
	}
}
