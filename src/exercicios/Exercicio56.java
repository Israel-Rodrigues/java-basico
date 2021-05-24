package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para comparar dois n�meros e verificar se s�o: iguais ou qual � o
 * maior
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor1, valor2;

		// Entrada de dados fornecidos pelo usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));

		// realiza��o da compara��o e apresenta��o ao usu�rio
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "Valores iguais: ");
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "O primeiro � maior.");
		} else {
			JOptionPane.showMessageDialog(null, "O segundo � maior.");
		}
	}

}
