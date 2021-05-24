package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se um n�mero informado pelo usu�rio � maior ou menor
 * que 10
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double valor;

		// Entrada de dados
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero diferente de 10!"));

		// Verificando se o n�mero � maior ou menor que 10
		if (valor > 10) {
			JOptionPane.showMessageDialog(null, "� maior que 10");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � maior que 10");
		}
	}
}
