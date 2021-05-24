package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Calcular o valor a ser pago pela compra de morango e maçãs
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double maca, morango, totalPeso, totalValor, totalPago, totalMaca, totalMorango;

		// Entrada de dados fornecidos pelo usuário
		morango = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade em Kg de morangos comprados"));
		maca = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de em Kg maçãs comprados"));

		// Calculando o total
		totalPeso = morango + maca;

		if ((maca <= 5.00) && (morango <= 5.00)) {
			totalMaca = (maca * 1.80);
			totalMorango = (morango * 2.50);
			totalValor = totalMaca + totalMorango;

			if ((totalPeso > 8) || (totalValor > 25)) {
				totalPago = totalValor - (totalValor * 0.10);

				JOptionPane.showMessageDialog(null, "O valor a ser pago é: " + totalPago);

			} else if ((maca > 5.00) && (morango > 5.00)) {
				totalMaca = (maca * 1.50);
				totalMorango = (morango * 2.20);
				totalValor = totalMaca + totalMorango;

				if ((totalPeso > 8) || (totalValor > 25)) {
					totalPago = totalValor - (totalValor * 0.10);

					JOptionPane.showMessageDialog(null, "O valor a ser pago é: " + totalPago);
				}
			}
		}
	}
}
