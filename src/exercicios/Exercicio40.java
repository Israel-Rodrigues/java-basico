package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se uma pessoa pode ou n�o votar calculando a idade
 * utilizando o ano atual e o ano de nascimento
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int anoAtual, anoNascimento, idade;

		// Entrada de dados fornecidos pelo usu�rio
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano atual: "));
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de nascimento: "));

		// Calculando a idade
		idade = anoAtual - anoNascimento;

		// Verificando se a pessoa pode votar e apresentando o resultado ao usu�rio
		if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Poder� votar este ano.");
		} else {
			JOptionPane.showMessageDialog(null, "N�o poder� votar este ano.");
		}
	}
}
