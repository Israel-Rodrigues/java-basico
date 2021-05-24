package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero de horas trabalhadas de um funcion�rio e calcular
 * o sal�rio total com a inclus�o de horas extras
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int hTrabalhadas, salarioH, horaExtra, valorHE;

		// Entrada de dados fornecidos pelo usu�rio
		hTrabalhadas = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas no m�s:"));
		salarioH = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor pago por hora trabalhada: "));

		// Calculo de hora extra
		horaExtra = hTrabalhadas - 160;
		valorHE = (int) (horaExtra * ((salarioH * 0.5) + salarioH));

		// Apresentando ao usu�rio o sal�rio final
		if (hTrabalhadas <= 160) {
			JOptionPane.showMessageDialog(null, "O sal�rio total no m�s � de: R$ " + (hTrabalhadas * salarioH));
		} else {
			JOptionPane.showMessageDialog(null, "O sal�rio total no m�s � de: R$ " + ((160 * salarioH) + valorHE));
		}
	}
}
