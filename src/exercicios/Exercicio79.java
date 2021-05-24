package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Calcular e escrever a m�dia aritm�tica dos n�meros inteiros
 * entre 15 (inclusive) e 100 (inclusive).
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio79 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double soma = 0;
		double quantidade = 0;
		double i = 15;
		double media = 0;

		// Verificando os n�meros entre 15 e 100
		while (i <= 100) {
			soma += i;
			quantidade += 1;
			i += 1;

			// Calculando a m�dia
			media = soma / quantidade;
		}
		// Exibindo o resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A m�dia da soma dos valores entre 15 e 100 �: " + media);
	}

}
