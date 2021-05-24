package exemplo03;

/**
 * Programa para demonstrar a utilização de decremento de valores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class ExemploDecremento {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int numero;

		// Atribuindo valor a variável
		numero = 1;

		System.out.println(numero); // exibindo valor 1

		numero = numero - 1; //decremento

		System.out.println(numero); // exibindo valor 0

		// inicialização da variável
		numero = 10;

		numero--; //decremento

		System.out.println(numero); // exibindo valor 9

		numero--; //decremento
		numero--; //decremento

		System.out.println(numero); // exibindo valor 7

	}

}
