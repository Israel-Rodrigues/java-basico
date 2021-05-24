package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber do usu�rio: sal�rio e vale-refei��o e exibir no console
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		String salario, valeRefeicao;

		// Atribuir valor para a vari�vel nome informado peo usu�rio
		salario = JOptionPane.showInputDialog("Informe seu sal�rio: ");
		valeRefeicao = JOptionPane.showInputDialog("Informe seu vale-refei��o: ");

		// exibindo o resultado no console
		System.out.println("Sal�rio: " + salario + "\n" + "Vale-Refei��o: " + valeRefeicao);
	}
}
