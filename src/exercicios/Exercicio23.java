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
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double temperaturaC, temperaturaF;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		temperaturaF = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit:"));

		// Convertendo o valor de Fahrenheit para Celcius
		temperaturaC = (temperaturaF - 32) * 05 / 9;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Temperatura em Celsius é: " + temperaturaC);
	}
}
