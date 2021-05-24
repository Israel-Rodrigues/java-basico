package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
 * correspondente em graus Celsius
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double temperaturaC, temperaturaF;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		temperaturaF = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit:"));

		// Convertendo o valor de Fahrenheit para Celcius
		temperaturaC = (temperaturaF - 32) * 05 / 9;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "Temperatura em Celsius �: " + temperaturaC);
	}
}
