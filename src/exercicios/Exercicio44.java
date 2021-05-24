package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número de horas trabalhadas de um funcionário e calcular
 * o salário total com a inclusão de horas extras
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int hTrabalhadas, salarioH, horaExtra, valorHE;

		// Entrada de dados fornecidos pelo usuário
		hTrabalhadas = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas no mês:"));
		salarioH = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor pago por hora trabalhada: "));

		// Calculo de hora extra
		horaExtra = hTrabalhadas - 160;
		valorHE = (int) (horaExtra * ((salarioH * 0.5) + salarioH));

		// Apresentando ao usuário o salário final
		if (hTrabalhadas <= 160) {
			JOptionPane.showMessageDialog(null, "O salário total no mês é de: R$ " + (hTrabalhadas * salarioH));
		} else {
			JOptionPane.showMessageDialog(null, "O salário total no mês é de: R$ " + ((160 * salarioH) + valorHE));
		}
	}
}
