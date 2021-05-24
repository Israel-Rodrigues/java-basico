package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor do tipo string
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class VetorString {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// Declaração de vetor
		String vetor[];
		
		// Inicializando e definindo o tamanho do vetor
		vetor = new String[5];

		// Valorizando o vetor recebendo os dados do usuário
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		
		// Exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
