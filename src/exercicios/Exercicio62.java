package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as 3 notas obtidas por um aluno nas 3 verifica��es e a
 * m�dia dos exerc�cios que fazem parte da avalia��o. Calcular a m�dia de
 * aproveitamento
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio62 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double n1, n2, n3, mediaDeAproveitamento, mediaDosExercicios;

		// Entrada de dados fornecidos pelo usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota: "));
		mediaDosExercicios = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a m�dia dos exerc�cios: "));

		// Calculando a m�dia de aproveitamento
		mediaDeAproveitamento = (n1 + (n2 * 2) + (n3 * 3) + mediaDosExercicios) / 7;

		// Verificando o conceito com base na m�dia de aproveitamento
		if (mediaDeAproveitamento >= 9.0) {
			JOptionPane.showMessageDialog(null, "Conceito A");
		} else if ((mediaDeAproveitamento >= 7.5) || (mediaDeAproveitamento < 9.0)) {
			JOptionPane.showMessageDialog(null, "Conceito B");
		} else if ((mediaDeAproveitamento >= 6.0) || (mediaDeAproveitamento < 7.5)) {
			JOptionPane.showMessageDialog(null, "Conceito C");
		}
		if (mediaDeAproveitamento < 6) {
			JOptionPane.showMessageDialog(null, "Conceito D");
		}
	}
}
