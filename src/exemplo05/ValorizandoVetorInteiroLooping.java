package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para valorizar um vetor do tipo inteiro informado pelo usuário utilizando o for
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class ValorizandoVetorInteiroLooping {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// Declrando o vetor
		int vetor[];
		
		// Inicializando o vetor e definindo o seu tamanho
		vetor = new int[5];
		
		// Recebendo os valores do usuário com o auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		// Exibindo os valores contidos no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
