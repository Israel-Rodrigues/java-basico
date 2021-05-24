package exercicios;

import javax.swing.JOptionPane;

/**
 * Entrar com o dia e o mês de uma data e informar quantos dias se passaram
 * desde o início do ano.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio26 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int dia, mes, total;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês: "));

		// Calculando a quantidade de dias que se passaram desde o início do ano
		total = ((mes * 30) - 30) + dia;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Se passaram desde o início do ano: " + total + "dias.");
	}
}
