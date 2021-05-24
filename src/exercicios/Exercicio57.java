package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero de litros de combust�vel vendido em um posto e
 * calcular o valor pago pelo cliente
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio57 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		char combustivel;
		double litros, totalPago, total;

		// Entrada de dados fornecidos pelo usu�rio
		combustivel = JOptionPane.showInputDialog("Qual o Tipo de Combustivel: A-�lcool ou  G-gasolina ? ")
				.toUpperCase().charAt(0);
		litros = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quantos litros foram comprados: "));

		// Verificando o total a ser pago considerando o desconto
		if ((combustivel == 'A') && (litros <= 20)) {
			total = litros * 2.90;
			totalPago = total - (total * 0.03);
			JOptionPane.showMessageDialog(null, "O valor a ser pago �: R$ " + totalPago);

		} else if ((combustivel == 'A') && (litros > 20)) {
			total = litros * 2.90;
			totalPago = total - (total * 0.05);
			JOptionPane.showMessageDialog(null, "O valor a ser pago �: R$ " + totalPago);

		} else if ((combustivel == 'G') && (litros <= 20)) {
			total = litros * 3.30;
			totalPago = total - (total * 0.04);
			JOptionPane.showMessageDialog(null, "O valor a ser pago �: R$ " + totalPago);

		} else {
			total = litros * 3.30;
			totalPago = total - (total * 0.06);
			JOptionPane.showMessageDialog(null, "O valor a ser pago �: R$ " + totalPago);
		}
	}

}
