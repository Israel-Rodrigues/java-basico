package exercicios;

/**
 * Programa que desenhe na tela um retângulo de 60 colunas (a partir da coluna 1
 * da tela) e 10 linhas (a partir da linha 1 da tela), sendo que a borda deste
 * retângulo será formada pelo caractere ‘+’. Lembre-se que somente a primeira e
 * última linha deverão ter todas as colunas preenchidas com o caractere ‘+’. As
 * demais linhas (entre 2 e 9) só terão as colunas 1 e 60 preenchidas.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio87 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		String txt1 = "", txt2 = "+";
		int altura = 10, largura = 60;

		// Definindo a largura
		for (int i = 0; i < largura; i++) {
			txt1 += "+";
		}
		for (int i = 0; i < largura - 2; i++) {
			txt2 += " ";
		}
		txt2 += "+";
		System.out.println(txt1);

		// Definindo a altura
		for (int i = 0; i < altura - 2; i++) {
			System.out.println(txt2);
		}
		System.out.println(txt1);
	}

}
