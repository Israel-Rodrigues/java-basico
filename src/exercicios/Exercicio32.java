package exercicios;

import javax.swing.JOptionPane;

/**
 * Calculo de litros de refrigerenate comprados
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio32 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int latap, garrafam, garrafag, litros;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		latap = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de latas compradas: "));
		garrafam = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de garrafas pequenas compradas: "));
		garrafag = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de garrafas grandes compradas: "));

		// Calculando a quantidade de litros
		litros = ((latap * 350) + (garrafam * 600) + (garrafag * 2000)) / 1000;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "A quantidade total de litros comprados � de: " + litros);
	}
}
