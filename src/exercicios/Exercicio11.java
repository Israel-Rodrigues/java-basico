package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber dois valores do usuário e apresentar o valor de sua multiplicação
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio11 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor1, valor2, resultado;

		// Atribuindo valor ás variáveis com as informações imputadas pelo uauário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

		// Executando a operação
		resultado = valor1 * valor2;

		// Exibindo resultado ao usuário
		JOptionPane.showMessageDialog(null, "A multiplicação dos valores informados é: " + resultado);
	}
}
