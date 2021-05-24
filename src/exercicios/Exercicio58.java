package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler a idade de 2 homens e 2 mulheres, calcular e escrever a soma das idades
 * do homem mais velho com a mulher mais nova e o produto das idades do homem
 * mais novo com a mulher mais velha
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int idadeH1, idadeH2, idadeM1, idadeM2;

		// Entrada de dados fornecidos pelo usu�rio
		idadeH1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do primeiro homem: "));
		idadeH2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do segundo homem: "));
		idadeM1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do primeira mulher: "));
		idadeM2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do segunda mulher: "));

		// Realizando a soma das idades
		if ((idadeH1 > idadeH2) && (idadeM1 < idadeM2)) {
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a idade da mulher mais nova �: " + (idadeH1 + idadeM1));
			JOptionPane.showMessageDialog(null,
					"O produto das idades do homem mais novo com a mulher mais velha �: " + (idadeH2 * idadeM2));

		} else if ((idadeH1 > idadeH2) && (idadeM2 < idadeM1)) {
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a idade da mulher mais nova �: " + (idadeH1 + idadeM2));
			JOptionPane.showMessageDialog(null,
					"O produto das idades do homem mais novo com a mulher mais velha �: " + (idadeH2 * idadeM1));

		} else if ((idadeH2 > idadeH1) && (idadeM1 < idadeM2)) {
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a idade da mulher mais nova �: " + (idadeH2 + idadeM1));
			JOptionPane.showMessageDialog(null,
					"O produto das idades do homem mais novo com a mulher mais velha �: " + (idadeH1 * idadeM2));

		} else if ((idadeH2 > idadeH1) && (idadeM1 > idadeM2)) {
			JOptionPane.showMessageDialog(null,
					"A soma da idade do homem mais velho com a idade da mulher mais nova �: " + (idadeH2 + idadeM2));
			JOptionPane.showMessageDialog(null,
					"O produto das idades do homem mais novo com a mulher mais velha �: " + (idadeH1 * idadeM1));
		}
	}

}
