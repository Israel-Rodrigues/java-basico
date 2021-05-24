package exercicios;

import javax.swing.JOptionPane;

/**
 * Claculando o custo total da compra de ma��s com base na quantidade comprada
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double maca;

		// Entrada de dados fornecidos pelo usu�rio
		maca = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de ma��s comprada."));

		// Verificando o valor a ser pago

		if (maca < 12) {
			maca = maca * 1.30;
			JOptionPane.showMessageDialog(null, "O valor a ser pago �: R$ " + maca);
		} else {
			maca = maca * 1.0;
			JOptionPane.showMessageDialog(null, "O valor a ser pago �: R$ " + maca);
		}
	}
}
