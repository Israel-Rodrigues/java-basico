package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular o valor total a ser pago por um produto
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio61 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		String produto;
		double quantidadeAdquirida, precoUni, total, totalPago;

		// Entrada de dados fornecidos pelo usuário
		produto = JOptionPane.showInputDialog("Informe a descrição do produto.");
		quantidadeAdquirida = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade adquirida: "));
		precoUni = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor unitário do produto: "));

		// Calculando o valor se a quantidade adquirida for menor ou igual a 5
		if (quantidadeAdquirida <= 5) {
			total = quantidadeAdquirida * precoUni;
			totalPago = total - (total * 0.02);
			JOptionPane.showMessageDialog(null, "Item: " + produto + "\n" + 
												"O valor total é: R$ " + total + "\n" + 
												"O valor de desconto é: R$ " + (total - totalPago) + "\n" + 
												"O valor a ser pago é: R$ " + totalPago);
		}
		if ((quantidadeAdquirida > 5) || (quantidadeAdquirida <= 10)) {
			total = quantidadeAdquirida * precoUni;
			totalPago = total - (total * 0.03);
			JOptionPane.showMessageDialog(null, "Item: " + produto + "\n" + 
												"O valor total é: R$ " + total + "\n" + 
												"O valor de desconto é: R$ " + (total - totalPago) + "\n" + 
												"O valor a ser pago é: R$ " + totalPago);
		} else {
			total = quantidadeAdquirida * precoUni;
			totalPago = total - (total * 0.05);
			JOptionPane.showMessageDialog(null, "Item: " + produto + "\n" + 
												"O valor total é: R$ " + total + "\n" + 
												"O valor de desconto é: R$ " + (total - totalPago) + "\n" + 
												"O valor a ser pago é: R$ " + totalPago);
		}
	}
}
