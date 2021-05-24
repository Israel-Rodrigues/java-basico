package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Solicitar n�meros para o usu�rio e armazenar em um vetor de 20
 * posi��es (aceitar somente n�meros positivos). Escrever a seguir o valor do
 * maior elemento e a respectiva posi��o que ele ocupa no vetor.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio90 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o do vetor
		int vetor[];

		// Declara��o de vari�vel
		int maior, posicao;

		// Inicializando o Vetor e definindo seu tamanho 
		vetor = new int[20];

		// Inicializando as vari�veis
		maior = 0;
		posicao = 0;

		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));

			if (vetor[i] < 0) { // Mensagem caso seja digitado um valor negativo
				JOptionPane.showMessageDialog(null, "Voc� digitou um valor negativo.");

				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));
			}
		}
		// Verificando o maior valor e a posi��o
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		// Exibi��o do resultado ao usu�rio
		System.out.println("O maior elemento �: " + maior);
		System.out.println("Na posi��o: " + posicao);
	}

}
