package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Solicitar n�meros para o usu�rio e armazenar em um vetor de 20
 * posi��es (aceitar somente n�meros positivos). Escrever a seguir o valor do
 * menor elemento e a respectiva posi��o que ele ocupa no vetor. 
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio91 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		// Declara��o do vetor
				int vetor[];

				// declara��o de vari�vel
				int menor, posicao;

				// Inicializando o Vetor
				vetor = new int[20];

				// Inicializando a vari�vel
				menor = 9999;
				posicao = 9999;

				// Entrada de dados com o auxilio do comando FOR
				for (int i = 0; i < vetor.length; i++) {
					vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));

					if (vetor[i] < 0) {
						JOptionPane.showMessageDialog(null, "Voc� digitou um valor negativo.");

						vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));
					}
				}
				// Verificando qual o menor elemento e em qual posi��o esta
				for (int i = 0; i < vetor.length; i++) {
					if (vetor[i] < menor) {
						menor = vetor[i];
						posicao = i;
					}
				}
				// Exibi��o do resultado ao usu�rio
				System.out.println("O menor elemento �: " + menor);
				System.out.println("Na posi��o: " + posicao);
			}

		}
