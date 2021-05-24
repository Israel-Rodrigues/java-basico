package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero de alunos existentes em uma torma e, ap�s isto,
 * ler as notas destes alunos, calcular e escrever a m�dia aritm�tica das notas
 * lidas
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio75 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double numAlunos, valor, resultado = 0, media = 0;

		// Entrada de dados fornecidos pelo usu�rio - n�mero de alunos
		numAlunos = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de alunos: "));

		// Solicitar a nota pela quantidade de vezes de alunos
		for (int i = 1; i < numAlunos; i++) {
			
			// Entrada de dados fornecidos pelo usu�rio - nota dos alunos
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno: " + i));
			resultado = resultado + valor;
		}
		// Realizando o calculo da m�dia
		media = resultado / numAlunos;

		// Apresentando o resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A m�dia das notas informadas � : " + media);
	}
}
