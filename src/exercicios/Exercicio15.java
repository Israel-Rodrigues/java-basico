package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para apresentar o antecessor de um número
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio15 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declaração de variável
		int valor;

		// Atribuindo valor para a variável informado pelo usuário
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

		// Alterando o valor da variável
		valor = valor - 1;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O antecessor do número informado é: " + valor);
	}
}
