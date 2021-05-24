package exercicios;

import javax.swing.JOptionPane;

/**
 * Verificar se um valor � positivo ou negativo (considerando 0 valor positivo)
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double valor;

		// Entrada de dados
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));

		// Verificando se o n�mero informado � positivo ou negativo
		if (valor >= 0) {
			JOptionPane.showMessageDialog(null, "N�mero positivo");
		} else {
			JOptionPane.showMessageDialog(null, "N�mero negativo");
		}
	}
}
