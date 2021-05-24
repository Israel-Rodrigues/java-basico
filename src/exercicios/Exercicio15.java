package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para apresentar o antecessor de um n�mero
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio15 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�vel
		int valor;

		// Atribuindo valor para a vari�vel informado pelo usu�rio
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));

		// Alterando o valor da vari�vel
		valor = valor - 1;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O antecessor do n�mero informado �: " + valor);
	}
}
