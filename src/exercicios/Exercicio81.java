package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e no final, escreva o maior e o menor valor
 * lido.
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio81 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor, menor = 9999, maior = 0;

		// Entrada de dados utilizando o comando For
		for (int i = 1; i <= 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores" + "\n" + i + " � valor."));

			// Verificando o menor valor lido
			if (valor < menor) {
				menor = valor;
			}
			// Verificando o maior valor lido
			if (valor > maior) {
				maior = valor;
			}
		}
		// Apresentando o resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "Menor valor: " + menor + "\n" + "Maior valor: " + maior);

	}

}
