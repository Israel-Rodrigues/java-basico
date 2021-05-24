package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o sal�rio total de um vendedor
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double salarioFixo, valorVendas, salarioTotal;

		// Entrada de dados fornecidos pelo usu�rio
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o sal�rio fixo: "));
		valorVendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor total das vendas: "));

		// Calculo do sal�rio e exibi��o do resultado ao usu�rio
		if (valorVendas <= 1500) {
			JOptionPane.showMessageDialog(null, "O sal�rio total � de: R$ " + ((valorVendas * 0.03) + salarioFixo));
		} else {
			salarioTotal = salarioFixo + (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
			JOptionPane.showMessageDialog(null, "O sal�rio total � de: R$ " + salarioTotal);
		}
	}
}
