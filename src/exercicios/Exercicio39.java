package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler duas notas de um aluno e calcular a média final
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double nota1, nota2, media;

		// Entrada de dados
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));

		// Calculando a média
		media = (nota1 + nota2) / 2;

		// Verificação da aprovação ou reprovação e exibição ao usuário
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Média = " + media + "\n" + "Aluno aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Média = " + media + "\n" + "Aluno reprovado");
		}
	}
}
