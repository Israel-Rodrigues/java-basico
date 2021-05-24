package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para para ler 10 n�meros. Todos os n�meros lidos com valor inferior
 * a 40 devem ser somados. Escreva o valor final da soma efetuada.
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio77 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor, contador = 0;

		// Usu�rio insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));

			// Realizando a soma dos valores enores que 40
			if (valor < 40) {
				contador = contador + valor;
			}

		}
		// Apresentando o resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A soma dos n�meros menores que 40 � : " + contador);
	}
}
