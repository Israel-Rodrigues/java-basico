package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos desses valores est�o entre 10
 * e 20 e quantos est�o fora desse intervalo
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio73 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valor, contador = 0, contador2 = 0;

		// Usu�rio insere 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));

			// Verificando os n�meros dentro do intervalo
			if ((valor >= 10) && (valor <= 20)) {
				contador++;
			}
			// Verificando os n�meros fora do intervalo
			if ((valor < 10) || (valor > 20)) {
				contador2++;
			}
		}
		// Exibindo o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "N�meros no intervalo de [10,20]: " + contador + "\n" + 
											"N�meros fora do intervalo: " + contador2);
	}
}
