package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o total de moedas de um cofrinho
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio33 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double moedas1, moedas5, moedas10, moedas25, moedas50, moedas, total;

		// Imput do valor informado pelo usuário e armazenamento na variável
		moedas1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de moedas de 1 centavo: "));
		moedas5 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de moedas de 5 centavos: "));
		moedas10 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de moedas de 10 centavos: "));
		moedas25 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de moedas de 25 centavos: "));
		moedas50 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de moedas de 50 centavos: "));
		moedas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de moedas de 1 real: "));

		// Execução da operação
		total = ((moedas1 + (moedas5 * 5) + (moedas10 * 10) + (moedas25 * 25) + (moedas50 * 50) + (moedas * 100))
				/ 100);

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O valor total é de: R$" + total);
	}
}
