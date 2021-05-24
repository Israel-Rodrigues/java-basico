package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o custo de fábrica de um carro, calcular e escrever o custo final ao
 * consumidor.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double custoFabrica, taxaDistribuidor, imposto, valorReal;

		// Armazenamento do dado informado pelo usuário na variável "custoFabrica"
		custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica do carro: "));

		// Calculando o valor da taxa do distribuidor e o valor de impostos
		taxaDistribuidor = custoFabrica * 0.28;
		imposto = custoFabrica * 0.45;

		// Calculando o valor real a ser pago pelo carro
		valorReal = custoFabrica + taxaDistribuidor + imposto;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O custo final ao consumidor é: R$ " + valorReal);
	}
}
