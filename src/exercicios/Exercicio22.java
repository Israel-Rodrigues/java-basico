package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero de carros por vendidos por um vendedor, o valor
 * total de suas vendas, o sal�rio fixo e o valor que ele recebe por carro
 * vendido. Calcular e escreva o sal�rio final do vendedor.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * M�todo pprincipal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double carros, valorVendas, salario, valorPcarro, salarioFinal, comicaoVendas;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		carros = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de carros vendidos"));
		valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio fixo"));
		valorPcarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor recebido por carro vendido"));

		// Calculando o valor da comiss�o pelas vendas
		comicaoVendas = valorVendas * 0.05;

		// Calculando o sal�rio final
		salarioFinal = salario + comicaoVendas + (valorPcarro * carros);

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O sal�rio final do vendedor �: R$ " + salarioFinal);
	}
}
