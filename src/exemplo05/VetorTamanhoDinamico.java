package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utiliza��o de vetor com o usu�rio informando o seu tamanho
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class VetorTamanhoDinamico {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Declarando o vetor
		int vetor[];
		
		// Vari�vel auxiliar informada pelo usu�rio para definir o tamanho do vetor
		int tamanho;
		
		// Usu�rio informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		
		// Inicializando o vetor e definindo o seu tamanho
		vetor = new int[tamanho];

		// Recebendo do usu�rio os valores a serem gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		// Exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
