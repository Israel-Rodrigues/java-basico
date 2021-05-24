package exercicios;

import javax.swing.JOptionPane;

/**
 * Claculando o custo total da compra de maçãs com base na quantidade comprada
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double maca;

		// Entrada de dados fornecidos pelo usuário
		maca = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de maçãs comprada."));

		// Verificando o valor a ser pago

		if (maca < 12) {
			maca = maca * 1.30;
			JOptionPane.showMessageDialog(null, "O valor a ser pago é: R$ " + maca);
		} else {
			maca = maca * 1.0;
			JOptionPane.showMessageDialog(null, "O valor a ser pago é: R$ " + maca);
		}
	}
}
