package exercicios;

import javax.swing.JOptionPane;

/**
 * Apresentar o resultado do módulo entre duas variáveis
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio14 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declrando a variável
		double resultado = Math.abs(3 / 2);

		// Exibindo resultado ao usuário
		JOptionPane.showMessageDialog(null, "O resultado do módulo é: " + resultado);
	}
}
