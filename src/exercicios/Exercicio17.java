package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler a idade expressa em anos, meses e dias e escrever a idade dessa pessoa
 * expressa apenas em dias
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio17 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		int ano, mes, dia, total;

		// Atribuindo valor para a vari�vel informado pelo usu�rio
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes de nascimento: "));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento: "));

		// Convertendo os dados em dias
		ano = 2021 - ano;
		ano = ano * 365;
		mes = (mes * 30) - 30;

		// Somando os dias
		total = ano + mes + dia;

		// Exibindo resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "Sua idade em dias �: " + total);
	}
}
