package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor N qualquer (que ser� o tamanho dos vetores). Ap�s,
 * ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um
 * terceiro vetor SOMA a soma dos elementos do vetor A com os do vetor B
 * (respeitando as mesmas posi��es) e escrever o vetor Soma.
 *
 * 
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio94 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Declara��o da vari�vel
		int n;
		
		// Declara��o de vetores
		int a[];
		int b[];
		int soma[];

		// Usu�rio informa o tamanho do vetor
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho dos vetores"));

		// Atribuindo o tamanho ao vetor
		a = new int[n];
		b = new int[n];
		soma = new int[n];

		// Solicitando os dados ao usu�rio
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor " + i));
		} 
		// Solicitando os dados ao usu�rio
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor " + i));

			// Somando o vetor a com o vetor b e armazenando no vetor soma
			soma[i] = a[i] + b[i];

			// Exibi��o dos dados ao usu�rio
			System.out.println(soma[i]);
		}

	}

}
