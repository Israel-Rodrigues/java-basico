package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular a quantidade necess�ria de hamb�rguer, queijo e presunto para fazer
 * uma quantidade espec�fica de sanduiches
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio29 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double quantidade, presunto, queijo, hamburguer;

		// Imput do valor informado pelo usu�rio e armazenamento na vari�vel
		quantidade = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de sanduiches a serem preparados: "));

		// Calculando a quantidade de cada item
		presunto = quantidade * 0.05;
		queijo = quantidade * 0.1;
		hamburguer = quantidade * 0.1;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "Para produzir " + quantidade + 
											" sanduiches s�o necess�rios: " + "\n" + presunto + 
											" Kg de presunto " + "\n" + queijo + 
											" Kg de queijo " + "\n" + hamburguer + 
											" Kg de hamburguer ");
	}
}
