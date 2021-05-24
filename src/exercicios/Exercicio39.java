package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler duas notas de um aluno e calcular a m�dia final
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double nota1, nota2, media;

		// Entrada de dados
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));

		// Calculando a m�dia
		media = (nota1 + nota2) / 2;

		// Verifica��o da aprova��o ou reprova��o e exibi��o ao usu�rio
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "M�dia = " + media + "\n" + "Aluno aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "M�dia = " + media + "\n" + "Aluno reprovado");
		}
	}
}
