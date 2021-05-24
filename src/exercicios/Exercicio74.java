package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores, calcular e escrever a m�dia aritm�tica desses
 * valores
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio74 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double valor = 0, resultado = 0, media = 0;

		// Usu�rio insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
			resultado = resultado + valor;
		}
		// Calculando a m�dia
		media = resultado / 10;

		// Exibindo o resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A m�dia dos valores informados �: " + media);
	}
}
