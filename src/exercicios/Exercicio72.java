package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e informar quantos são negativos
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio72 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// Declaração de variáveis
		int valor, contador = 0;
		
		// Usuário insere 10 valores
		for (int i = 1; i < 11; i++) {
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
			if (valor < 0) {
				contador++;
			}
		}
		// Exibindo o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Números negativos digitados: " + contador);
	}

}
