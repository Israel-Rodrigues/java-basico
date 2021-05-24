package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno.
 * Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio24 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double nota1, nota2, nota3, media;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota:"));

		// Calculando a m�dia ponderada
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "A m�dia final �: " + media);
	}
}
