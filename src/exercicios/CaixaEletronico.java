package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para simular um caixa eletrônico
 * 
 * @author iorodrigues
 * @since 08/02/2021
 */
public class CaixaEletronico {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double valorSaque;
		int nota2, nota5, nota10, nota20, nota50;
		int resto2, resto5, resto10, resto20, resto50;
		String mensagem = "";

		nota2 = 0;
		nota5 = 0;
		nota10 = 0;
		nota20 = 0;
		nota50 = 0;
		resto2 = 0;
		resto5 = 0;
		resto10 = 0;
		resto20 = 0;
		resto50 = 0;

		// Entrada de dados
		valorSaque = Double.parseDouble(JOptionPane.showInputDialog("===== Caixa Eletrônico =====" + "\n"
				+ "Notas disponíveis: 2, 5, 10, 20, 50" + "\n\n" + "Informe o valor a ser sacado"));
		if ((valorSaque <= 0) || (valorSaque == 1) || (valorSaque == 3)) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido");
			System.exit(0);
		} else if (Math.floor(valorSaque) != valorSaque) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido");
			System.exit(0);
		} else if (valorSaque > 0) {
			nota50 = (int) valorSaque / 50;
			resto50 = (int) valorSaque % 50;

			nota20 = (int) resto50 / 20;
			resto20 = resto50 % 20;

			nota10 = (int) resto20 / 10;
			resto10 = resto20 % 10;

			nota5 = (int) resto10 / 5;
			resto5 = resto10 % 5;

			nota2 = (int) resto5 / 2;
			resto2 = resto5 % 2;
		} 
		
		if (resto2 >= 1) {
			if (nota5 >= 1) {
				nota5 = nota5 - 1;
				nota2 = nota2 + 3;

			} else if (nota10 >= 1) {
				nota10 = nota10 - 1;
				nota5 = nota5 + 1;
				nota2 = nota2 + 3;

			} else if (nota20 >= 1) {
				nota20 = nota20 - 1;
				nota10 = nota10 + 1;
				nota5 = nota5 + 1;
				nota2 = nota2 + 3;

			} else if (nota50 >= 1) {
				nota50 = nota50 - 1;
				nota20 = nota20 - 1;
				nota10 = nota10 + 1;
				nota5 = nota5 + 1;
				nota2 = nota2 + 3;
			}
		}

		if (nota50 > 0) {
			mensagem += "Nota(s) de R$50 : " + nota50 + "\n";
		}
		if (nota20 > 0) {
			mensagem += "Nota(s) de R$20 : " + nota20 + "\n";
		}
		if (nota10 > 0) {
			mensagem += "Nota(s) de R$10 : " + nota10 + "\n";
		}
		if (nota5 > 0) {
			mensagem += "Nota(s) de R$5 : " + nota5 + "\n";
		}
		if (nota2 > 0) {
			mensagem += "Nota(s) de R$2 : " + nota2;
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
