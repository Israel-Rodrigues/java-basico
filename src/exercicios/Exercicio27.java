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
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int camisap, camisam, camisag, total;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		camisap = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de camisas do tamanho P vendidas: "));
		camisam = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de camisas do tamanho M vendidas: "));
		camisag = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de camisas do tamanho G vendidas: "));

		// Calculando o valor total arrecadado com a venda de camisas
		total = (camisap * 10) + (camisam * 12) + (camisag * 15);

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O valor total arrecadado com a venda de camisas foi de: R$" + total);
	}
}
