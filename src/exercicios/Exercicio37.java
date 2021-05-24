package exercicios;

import javax.swing.JOptionPane;

/**
 * Verificar se um valor é positivo ou negativo (considerando 0 valor positivo)
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double valor;

		// Entrada de dados
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));

		// Verificando se o número informado é positivo ou negativo
		if (valor >= 0) {
			JOptionPane.showMessageDialog(null, "Número positivo");
		} else {
			JOptionPane.showMessageDialog(null, "Número negativo");
		}
	}
}
