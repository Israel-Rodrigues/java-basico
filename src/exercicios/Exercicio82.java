package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade e a seguir ler esta quantidade de n�meros.
 * Depois de ler todos os n�meros o programa deve apresentar na tela o maior dos
 * n�meros lidos e a m�dia dos n�meros lidos.
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio82 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double quanti, valor, maior = 0, resultado = 0, media = 0;

		// Entrada de dados fornecidos pelo usu�rio
		quanti = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade: "));

		for (int i = 1; i <= quanti; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: " + i));
			resultado = resultado + valor;

			// Encontrando o maior valor
			if (valor > maior) {
				maior = valor;
			}
		}
		// Calculando a m�dia
		media = resultado / quanti;

		// Apresentando os dados ao usu�rio
		JOptionPane.showMessageDialog(null, "O maior valor informado �: " + String.format("%.0f",maior) + "\n" + 
											"A m�dia dos valores informados �: " + media);
	}
}
