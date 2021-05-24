package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e armazenar em um vetor. Após isto, o programa
 * deve ordenar os números no vetor em ordem crescente. Escrever o vetor
 * ordenado.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio95 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração do vetor
		int vetor[] = new int[10];
		int i, x;
		String texto = "";

		for (i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));	
				}
		
		//Verificando a ordem dos números
		for ( i = 0; i < vetor.length; i++) {
			for (int j = i; j > 0; j--) {
				if (vetor[j] < vetor[j -1]) {
					x = vetor[j];
                    vetor[j] = vetor[j -1];
                    vetor[j -1] = x;
				}
			}
		}
		// Exibindo os números em ordem crescente
		for ( i = 0; i < vetor.length; i++) {
			texto += vetor[i] + " , ";
		}
		System.out.println("Numero: " + texto);
	}
}
