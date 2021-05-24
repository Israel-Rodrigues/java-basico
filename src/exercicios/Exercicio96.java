package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e armazenar em um vetor. Após isto, o programa
 * deve ordenar os números no vetor em ordem crescente. Escrever o vetor
 * ordenado. depois de ordenar os elementos do vetor em ordem crescente, deve
 * ser lido mais um número qualquer e inserir esse novo número na posição
 * correta, ou seja, mantendo a ordem crescente do vetor.
 *
 * 
 * @author Israel Oliveira Rodrigues
 * @since 16 de fev. de 2021
 * 
 */
public class Exercicio96 {


	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração do vetor
		int vetor[] = new int[11];
		int i, x;
		String texto = "";

		for (i = 1; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: " + i));	
				}
		// Usuário informa o número que deve ser incluido
		vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor que deve ser incluido: "));
		
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
