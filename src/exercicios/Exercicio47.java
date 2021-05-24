package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a quantidade em estoque, calcular a média e verificar
 * se é necessário realizar compra ou não
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double quantAtual, quantMaxima, quantMinima, media;

		// Entrada de dados fornecidos pelo usuário
		quantAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade atual em estoque: "));
		quantMaxima = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade mínima permitida: "));
		quantMinima = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade mímáxima permitida: "));

		// Calculando a quantidade média permitida no estoque
		media = (quantMaxima + quantMinima) / 2;
		JOptionPane.showMessageDialog(null, "A quantidade média necessária em estoque é de: " + media);

		// Apresentando o valor ao usuário
		if (quantAtual >= media) {
			JOptionPane.showMessageDialog(null, "Não efetuar compra");
		} else {
			JOptionPane.showMessageDialog(null, "Efetuar compra");
		}
	}
}
