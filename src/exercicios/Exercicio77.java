package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para para ler 10 números. Todos os números lidos com valor inferior
 * a 40 devem ser somados. Escreva o valor final da soma efetuada.
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio77 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor, contador = 0;

		// Usuário insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));

			// Realizando a soma dos valores enores que 40
			if (valor < 40) {
				contador = contador + valor;
			}

		}
		// Apresentando o resultado ao usuário
		JOptionPane.showMessageDialog(null, "A soma dos números menores que 40 é : " + contador);
	}
}
