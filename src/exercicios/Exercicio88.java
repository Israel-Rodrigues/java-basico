package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar a leitura dos nomes de 10 pessoas e armazenar os nomes
 * lidos em um vetor. Após isto, o programa deve permitir a leitura de mais 1
 * nome qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome estiver
 * entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso
 * contrário.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio88 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando um vetor String
		String nomes[];

		// Inicializar e definir o tamanho do vetor
		nomes = new String[10];

		// Recebendo do usuario os nomes e armazenando em um vetor
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe um nome");
		}

		// Recebendo do usuario um nome para verificar se existe nos nomes informados
		// anteriormente
		String busca = JOptionPane.showInputDialog("Informe o nome a ser procurado");

		// variavel para contar as vezes que achou o nome escolhido pelo usuário
		boolean achou = false;

		// varrendo o vetor para verificar se o nome informado pelo usuario existe
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(busca)) {
				achou = true;
			}
		}

		// exibindo o resultado da busca
		if (achou) {
			System.out.println("ACHEI");
		} else {
			System.out.println("NÃO ACHEI");
		}

	}

}