package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir a tabuada (de 1 a 10) para os n�meros de 1 a 10.
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio85 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		String resultado;
		int resultadoTabuada;

		// Atribuindo a variavel de resultado seu cabe�alho
		resultado = "Tabuada\n";

		// La�o para calcular a tabuada
		for (int i = 0; i < 11; i++) {

			for (int j = 0; j < 11; j++) {
				resultadoTabuada = i * j;
				resultado += i + "x" + j + " = " + resultadoTabuada + "\n";
			}
		}

		// Axibindo o resultado da tabuada ao usu�rio
		JOptionPane.showMessageDialog(null, resultado);

	}

}
