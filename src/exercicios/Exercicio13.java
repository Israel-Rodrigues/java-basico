package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber dois valores e apresentar o resultado de sua exponencia��o
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int resultado = (int) Math.pow(4, 2);

		// Exibindo resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A exponencia��o dos valores informados �: " + resultado);
	}
}
