package exercicios;

import javax.swing.JOptionPane;

/**
 * Entrar com o dia e o m�s de uma data e informar quantos dias se passaram
 * desde o in�cio do ano.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio26 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int dia, mes, total;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s: "));

		// Calculando a quantidade de dias que se passaram desde o in�cio do ano
		total = ((mes * 30) - 30) + dia;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "Se passaram desde o in�cio do ano: " + total + "dias.");
	}
}
