package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber do usuário: salário e vale-refeição e exibir no console
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		String salario, valeRefeicao;

		// Atribuir valor para a variável nome informado peo usuário
		salario = JOptionPane.showInputDialog("Informe seu salário: ");
		valeRefeicao = JOptionPane.showInputDialog("Informe seu vale-refeição: ");

		// exibindo o resultado no console
		System.out.println("Salário: " + salario + "\n" + "Vale-Refeição: " + valeRefeicao);
	}
}
