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
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double temperaturaC, temperaturaF;

		// Imput do valor informado pelo usuário e armazenamento na variável
		temperaturaC = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus Celsius: "));

		// Conversão de temperatura para Fahrenheit
		temperaturaF = (temperaturaC * 9 / 5) + 32;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "A temperatura em graus Fahrenheit é: " + temperaturaF);
	}
}
