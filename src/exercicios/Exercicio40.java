package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se uma pessoa pode ou não votar calculando a idade
 * utilizando o ano atual e o ano de nascimento
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int anoAtual, anoNascimento, idade;

		// Entrada de dados fornecidos pelo usuário
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano atual: "));
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de nascimento: "));

		// Calculando a idade
		idade = anoAtual - anoNascimento;

		// Verificando se a pessoa pode votar e apresentando o resultado ao usuário
		if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Poderá votar este ano.");
		} else {
			JOptionPane.showMessageDialog(null, "Não poderá votar este ano.");
		}
	}
}
