package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Ler 2 valores, calcular e escrever a soma dos inteiros
 * existentes entre os 2 valores lidos (incluindo os valores lidos na soma).
 * Considere que o segundo valor lido ser� sempre maior que o primeiro valor
 * lido.
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio78 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor = 0;
		int valor1, valor2;

		// Usu�rio insere 2 valores
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));

		// Realizando a soma dos valores dentro do intervalo dos n�meros fornecidos pelo
		// usu�rio
		for (int i = valor1; i <= valor2; i++) {
			valor += i;
		}
		// Exibindo o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "A soma dos valores no intervalo de " + valor1 + " e " + valor2 + " � " + valor);
	}
}
