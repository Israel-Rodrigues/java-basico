package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar a leitura das notas de uma turma de 20 alunos.
 * Calcular a média da turma e contar quantos alunos obtiveram nota acima desta
 * média calculada. Escrever a média da turma e o resultado da contagem.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio89 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração do vetor
		int vetor[];

		// Declarando variável
		int nota, media, soma;

		// Inicializando o Vetor
		vetor = new int[20];

		// Inicializando a variável N
		nota = 0;
		media = 0;
		soma = 0;

		// Recebendo do do usuário as notas dos 20 alunos
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno"));
		}
		// Calculando a média das notas
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
			media = soma/20;
			
			// Verificando quantos alunos ficaram acima da média
			if (vetor[i] > media) {
				nota++;
			}
		}
		// Exibindo o resultado ao usuário
		System.out.println("A média das notas informadas é: " + media);
		System.out.println("Total de alunos a cima da média: " + nota);
	}

}
