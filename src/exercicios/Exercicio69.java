package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e imprimir o seu intervalo
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio69 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int n;

		// capturando o valor N do usuario
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

		// exibindo o resultado escolhido pelo usuario - intervalo entre 1 e N
		for (int i = 1; i <= n; i++) {
			System.out.println("Numero: " + i);
		}

	}

}

