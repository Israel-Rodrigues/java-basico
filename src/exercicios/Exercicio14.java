package exercicios;

import javax.swing.JOptionPane;

/**
 * Apresentar o resultado do m�dulo entre duas vari�veis
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio14 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declrando a vari�vel
		double resultado = Math.abs(3 / 2);

		// Exibindo resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "O resultado do m�dulo �: " + resultado);
	}
}
