package exemplo01;

/**
 * Programa para demonstrar utilização de variáveis
 * @author iorodrigues
 * @since 04/02/2021
*/
public class Variaveis {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// Declarando variávei do tipo inteiro
		int idade;
		
		// Declarando variáveis do tipo String
		String nome;
		
		// Declarando variável do tipo double
		double valor;
		
		// Atribuindo valores para as variáveis
		idade = 25;
		nome = "Israel";
		valor = 155.98;
		
		// Exibindo o conteúdo das variáveis no console
		System.out.println("Variável IDADE: " + idade + ".");
		System.out.println("Variável NOME: " + nome + "." );
		System.out.println("Variável VALOR: " + valor + ".");

	}

}
