package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para escrever 10 números e ao final da leitura escrever a soma total
 * dos 10 números
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio76 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double valor = 0, resultado = 0;

		// Usuário insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));

			// Realizando a soma dos valores informados
			resultado = resultado + valor;
		}
		// Apresentação do resultado ao usuário
		JOptionPane.showMessageDialog(null, "A soma dos valores informados é: " + resultado);
	}
}
