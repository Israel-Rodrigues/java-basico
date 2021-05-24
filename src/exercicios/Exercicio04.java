package exercicios;

/**
 * Programa para declarar uma variável do tipo String chamada, nome, celular e
 * cidade. Atribuir valor e mostrar o resultado no console
 * 
 * @author Israel Oliveira Rodrigues
 * @since 04/02/2021
 */
public class Exercicio04 {
	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declarando as variáveis
		String nome, celular, cidade;

		// Atribuindo valores para as variáveis
		nome = "Israel Rodrigues";
		celular = "(11)99155-0464";
		cidade = "Itapevi";

		// Apresentando o resultado no console
		System.out.println("Meu nome é: " + nome + ".");
		System.out.println("Meu celular é: " + celular + ".");
		System.out.println("Minha cidade é:" + cidade + ".");
	}
}
