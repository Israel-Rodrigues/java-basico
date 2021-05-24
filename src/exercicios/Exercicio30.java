package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter temperaturas de Celcius para Fahrenheit
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio30 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double temperaturaC, temperaturaF;

		// Imput do valor informado pelo usu�rio e armazenamento na vari�vel
		temperaturaC = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus Celsius: "));

		// Convers�o de temperatura para Fahrenheit
		temperaturaF = (temperaturaC * 9 / 5) + 32;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "A temperatura em graus Fahrenheit �: " + temperaturaF);
	}
}
