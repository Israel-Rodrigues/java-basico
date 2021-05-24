package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Calcular o valor a ser pago pela compra de morango e ma��s
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double maca, morango, totalPeso, totalValor, totalPago, totalMaca, totalMorango;

		// Entrada de dados fornecidos pelo usu�rio
		morango = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade em Kg de morangos comprados"));
		maca = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de em Kg ma��s comprados"));

		// Calculando o total
		totalPeso = morango + maca;

		if ((maca <= 5.00) && (morango <= 5.00)) {
			totalMaca = (maca * 1.80);
			totalMorango = (morango * 2.50);
			totalValor = totalMaca + totalMorango;

			if ((totalPeso > 8) || (totalValor > 25)) {
				totalPago = totalValor - (totalValor * 0.10);

				JOptionPane.showMessageDialog(null, "O valor a ser pago �: " + totalPago);

			} else if ((maca > 5.00) && (morango > 5.00)) {
				totalMaca = (maca * 1.50);
				totalMorango = (morango * 2.20);
				totalValor = totalMaca + totalMorango;

				if ((totalPeso > 8) || (totalValor > 25)) {
					totalPago = totalValor - (totalValor * 0.10);

					JOptionPane.showMessageDialog(null, "O valor a ser pago �: " + totalPago);
				}
			}
		}
	}
}
