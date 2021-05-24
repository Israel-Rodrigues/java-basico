package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número de alunos existentes em uma torma e, após isto,
 * ler as notas destes alunos, calcular e escrever a média aritmética das notas
 * lidas
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio75 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double numAlunos, valor, resultado = 0, media = 0;

		// Entrada de dados fornecidos pelo usuário - número de alunos
		numAlunos = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de alunos: "));

		// Solicitar a nota pela quantidade de vezes de alunos
		for (int i = 1; i < numAlunos; i++) {
			
			// Entrada de dados fornecidos pelo usuário - nota dos alunos
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno: " + i));
			resultado = resultado + valor;
		}
		// Realizando o calculo da média
		media = resultado / numAlunos;

		// Apresentando o resultado ao usuário
		JOptionPane.showMessageDialog(null, "A média das notas informadas é : " + media);
	}
}
