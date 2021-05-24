package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor especifico no vetor String
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class BuscarValorVetorString {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o do vetor
		String vetor[];

		// Inicializando o vetor e definindo o seu tamanho
		vetor = new String[3];

		// Velorizando o vetor com os dados informados pelo usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		// Varrendo o veto para verificar os registros armazenados
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals("Israel")) {
				System.out.println("Achei o que voc� precisava na posi��o: " + i);

			}
		}
	}

}
