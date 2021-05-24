package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número de carros por vendidos por um vendedor, o valor
 * total de suas vendas, o salário fixo e o valor que ele recebe por carro
 * vendido. Calcular e escreva o salário final do vendedor.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * Método pprincipal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double carros, valorVendas, salario, valorPcarro, salarioFinal, comicaoVendas;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		carros = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de carros vendidos"));
		valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo"));
		valorPcarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor recebido por carro vendido"));

		// Calculando o valor da comissão pelas vendas
		comicaoVendas = valorVendas * 0.05;

		// Calculando o salário final
		salarioFinal = salario + comicaoVendas + (valorPcarro * carros);

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O salário final do vendedor é: R$ " + salarioFinal);
	}
}
