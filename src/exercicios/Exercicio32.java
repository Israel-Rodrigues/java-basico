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
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int latap, garrafam, garrafag, litros;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		latap = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de latas compradas: "));
		garrafam = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de garrafas pequenas compradas: "));
		garrafag = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de garrafas grandes compradas: "));

		// Calculando a quantidade de litros
		litros = ((latap * 350) + (garrafam * 600) + (garrafag * 2000)) / 1000;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "A quantidade total de litros comprados é de: " + litros);
	}
}
