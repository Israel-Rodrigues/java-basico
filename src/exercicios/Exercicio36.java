package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se um número informado pelo usuário é maior ou menor
 * que 10
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double valor;

		// Entrada de dados
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um número diferente de 10!"));

		// Verificando se o número é maior ou menor que 10
		if (valor > 10) {
			JOptionPane.showMessageDialog(null, "É maior que 10");
		} else {
			JOptionPane.showMessageDialog(null, "Não é maior que 10");
		}
	}
}
