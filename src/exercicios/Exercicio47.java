package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a quantidade em estoque, calcular a m�dia e verificar
 * se � necess�rio realizar compra ou n�o
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double quantAtual, quantMaxima, quantMinima, media;

		// Entrada de dados fornecidos pelo usu�rio
		quantAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade atual em estoque: "));
		quantMaxima = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade m�nima permitida: "));
		quantMinima = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade m�m�xima permitida: "));

		// Calculando a quantidade m�dia permitida no estoque
		media = (quantMaxima + quantMinima) / 2;
		JOptionPane.showMessageDialog(null, "A quantidade m�dia necess�ria em estoque � de: " + media);

		// Apresentando o valor ao usu�rio
		if (quantAtual >= media) {
			JOptionPane.showMessageDialog(null, "N�o efetuar compra");
		} else {
			JOptionPane.showMessageDialog(null, "Efetuar compra");
		}
	}
}
