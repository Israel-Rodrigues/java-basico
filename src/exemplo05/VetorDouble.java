package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utiliza��o de vetor double em java
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class VetorDouble {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Declarando o vetor
		double vetor [];
		
		// Inicializando e informando o tamanho do vetor
		vetor = new double[5];

		// Recebendo os dados do usu�rio para valorizar o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		}
		// Exibindo os dados gravados no tetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
