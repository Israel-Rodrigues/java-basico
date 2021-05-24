package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar a leitura das notas de uma turma de 20 alunos.
 * Calcular a m�dia da turma e contar quantos alunos obtiveram nota acima desta
 * m�dia calculada. Escrever a m�dia da turma e o resultado da contagem.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio89 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o do vetor
		int vetor[];

		// Declarando vari�vel
		int nota, media, soma;

		// Inicializando o Vetor
		vetor = new int[20];

		// Inicializando a vari�vel N
		nota = 0;
		media = 0;
		soma = 0;

		// Recebendo do do usu�rio as notas dos 20 alunos
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno"));
		}
		// Calculando a m�dia das notas
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
			media = soma/20;
			
			// Verificando quantos alunos ficaram acima da m�dia
			if (vetor[i] > media) {
				nota++;
			}
		}
		// Exibindo o resultado ao usu�rio
		System.out.println("A m�dia das notas informadas �: " + media);
		System.out.println("Total de alunos a cima da m�dia: " + nota);
	}

}
