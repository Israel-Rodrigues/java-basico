package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler três notas de um aluno, calcule e escreva a média final deste aluno.
 * Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio24 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double nota1, nota2, nota3, media;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota:"));

		// Calculando a média ponderada
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "A média final é: " + media);
	}
}
