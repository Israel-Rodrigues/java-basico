package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular a quantidade necessária de hambúrguer, queijo e presunto para fazer
 * uma quantidade específica de sanduiches
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio29 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double quantidade, presunto, queijo, hamburguer;

		// Imput do valor informado pelo usuário e armazenamento na variável
		quantidade = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de sanduiches a serem preparados: "));

		// Calculando a quantidade de cada item
		presunto = quantidade * 0.05;
		queijo = quantidade * 0.1;
		hamburguer = quantidade * 0.1;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Para produzir " + quantidade + 
											" sanduiches são necessários: " + "\n" + presunto + 
											" Kg de presunto " + "\n" + queijo + 
											" Kg de queijo " + "\n" + hamburguer + 
											" Kg de hamburguer ");
	}
}
