package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber dois valores do usu�rio e exibir o resultado da soma
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio09 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor1, valor2, resultado;

		// Atribuindo valor �s vari�veis com as informa��es imputadas pelo uau�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

		// Executando a opera��o
		resultado = valor1 + valor2;

		// Exibindo resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A soma dos valores informados �: " + resultado);
	}
}
