package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o custo de f�brica de um carro, calcular e escrever o custo final ao
 * consumidor.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double custoFabrica, taxaDistribuidor, imposto, valorReal;

		// Armazenamento do dado informado pelo usu�rio na vari�vel "custoFabrica"
		custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de f�brica do carro: "));

		// Calculando o valor da taxa do distribuidor e o valor de impostos
		taxaDistribuidor = custoFabrica * 0.28;
		imposto = custoFabrica * 0.45;

		// Calculando o valor real a ser pago pelo carro
		valorReal = custoFabrica + taxaDistribuidor + imposto;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O custo final ao consumidor �: R$ " + valorReal);
	}
}
