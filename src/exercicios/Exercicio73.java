package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos desses valores estão entre 10
 * e 20 e quantos estão fora desse intervalo
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio73 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valor, contador = 0, contador2 = 0;

		// Usuário insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));

			// Verificando os números dentro do intervalo
			if ((valor >= 10) && (valor <= 20)) {
				contador++;
			}
			// Verificando os números fora do intervalo
			if ((valor < 10) || (valor > 20)) {
				contador2++;
			}
		}
		// Exibindo o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Números no intervalo de [10,20]: " + contador + "\n" + 
											"Números fora do intervalo: " + contador2);
	}
}
