package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para escrever 10 n�meros e ao final da leitura escrever a soma total
 * dos 10 n�meros
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio76 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double valor = 0, resultado = 0;

		// Usu�rio insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));

			// Realizando a soma dos valores informados
			resultado = resultado + valor;
		}
		// Apresenta��o do resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A soma dos valores informados �: " + resultado);
	}
}
