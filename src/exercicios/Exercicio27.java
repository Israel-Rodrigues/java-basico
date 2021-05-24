package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o valor arrecadado com a venda de camisas
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio27 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int camisap, camisam, camisag, total;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		camisap = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de camisas do tamanho P vendidas: "));
		camisam = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de camisas do tamanho M vendidas: "));
		camisag = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de camisas do tamanho G vendidas: "));

		// Calculando o valor total arrecadado com a venda de camisas
		total = (camisap * 10) + (camisam * 12) + (camisag * 15);

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O valor total arrecadado com a venda de camisas foi de: R$" + total);
	}
}
