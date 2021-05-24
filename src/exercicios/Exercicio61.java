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
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		String produto;
		double quantidadeAdquirida, precoUni, total, totalPago;

		// Entrada de dados fornecidos pelo usu�rio
		produto = JOptionPane.showInputDialog("Informe a descri��o do produto.");
		quantidadeAdquirida = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade adquirida: "));
		precoUni = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor unit�rio do produto: "));

		// Calculando o valor se a quantidade adquirida for menor ou igual a 5
		if (quantidadeAdquirida <= 5) {
			total = quantidadeAdquirida * precoUni;
			totalPago = total - (total * 0.02);
			JOptionPane.showMessageDialog(null, "Item: " + produto + "\n" + 
												"O valor total �: R$ " + total + "\n" + 
												"O valor de desconto �: R$ " + (total - totalPago) + "\n" + 
												"O valor a ser pago �: R$ " + totalPago);
		}
		if ((quantidadeAdquirida > 5) || (quantidadeAdquirida <= 10)) {
			total = quantidadeAdquirida * precoUni;
			totalPago = total - (total * 0.03);
			JOptionPane.showMessageDialog(null, "Item: " + produto + "\n" + 
												"O valor total �: R$ " + total + "\n" + 
												"O valor de desconto �: R$ " + (total - totalPago) + "\n" + 
												"O valor a ser pago �: R$ " + totalPago);
		} else {
			total = quantidadeAdquirida * precoUni;
			totalPago = total - (total * 0.05);
			JOptionPane.showMessageDialog(null, "Item: " + produto + "\n" + 
												"O valor total �: R$ " + total + "\n" + 
												"O valor de desconto �: R$ " + (total - totalPago) + "\n" + 
												"O valor a ser pago �: R$ " + totalPago);
		}
	}
}
