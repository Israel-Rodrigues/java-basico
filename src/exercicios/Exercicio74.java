package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores, calcular e escrever a média aritmética desses
 * valores
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio74 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double valor = 0, resultado = 0, media = 0;

		// Usuário insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
			resultado = resultado + valor;
		}
		// Calculando a média
		media = resultado / 10;

		// Exibindo o resultado ao usuário
		JOptionPane.showMessageDialog(null, "A média dos valores informados é: " + media);
	}
}
