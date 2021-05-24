package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e informar quantos s�o negativos
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio72 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		int valor, contador = 0;
		
		// Usu�rio insere 10 valores
		for (int i = 1; i < 11; i++) {
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
			if (valor < 0) {
				contador++;
			}
		}
		// Exibindo o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "N�meros negativos digitados: " + contador);
	}

}
