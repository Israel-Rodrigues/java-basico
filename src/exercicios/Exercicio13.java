package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber dois valores e apresentar o resultado de sua exponenciação
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int resultado = (int) Math.pow(4, 2);

		// Exibindo resultado ao usuário
		JOptionPane.showMessageDialog(null, "A exponenciação dos valores informados é: " + resultado);
	}
}
