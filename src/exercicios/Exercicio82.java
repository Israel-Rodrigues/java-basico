package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade e a seguir ler esta quantidade de números.
 * Depois de ler todos os números o programa deve apresentar na tela o maior dos
 * números lidos e a média dos números lidos.
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio82 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double quanti, valor, maior = 0, resultado = 0, media = 0;

		// Entrada de dados fornecidos pelo usuário
		quanti = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade: "));

		for (int i = 1; i <= quanti; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: " + i));
			resultado = resultado + valor;

			// Encontrando o maior valor
			if (valor > maior) {
				maior = valor;
			}
		}
		// Calculando a média
		media = resultado / quanti;

		// Apresentando os dados ao usuário
		JOptionPane.showMessageDialog(null, "O maior valor informado é: " + String.format("%.0f",maior) + "\n" + 
											"A média dos valores informados é: " + media);
	}
}
