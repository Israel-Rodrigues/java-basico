package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o salário total de um vendedor
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double salarioFixo, valorVendas, salarioTotal;

		// Entrada de dados fornecidos pelo usuário
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário fixo: "));
		valorVendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor total das vendas: "));

		// Calculo do salário e exibição do resultado ao usuário
		if (valorVendas <= 1500) {
			JOptionPane.showMessageDialog(null, "O salário total é de: R$ " + ((valorVendas * 0.03) + salarioFixo));
		} else {
			salarioTotal = salarioFixo + (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
			JOptionPane.showMessageDialog(null, "O salário total é de: R$ " + salarioTotal);
		}
	}
}
