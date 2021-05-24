package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Calcular e escrever a média aritmética dos números inteiros
 * entre 15 (inclusive) e 100 (inclusive).
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio79 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double soma = 0;
		double quantidade = 0;
		double i = 15;
		double media = 0;

		// Verificando os números entre 15 e 100
		while (i <= 100) {
			soma += i;
			quantidade += 1;
			i += 1;

			// Calculando a média
			media = soma / quantidade;
		}
		// Exibindo o resultado ao usuário
		JOptionPane.showMessageDialog(null, "A média da soma dos valores entre 15 e 100 é: " + media);
	}

}
