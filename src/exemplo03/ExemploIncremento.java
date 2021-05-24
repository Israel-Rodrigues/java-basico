package exemplo03;

/**
 * Programa para demonstrar a utilização de incremento de valores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int numero;

		// Atribuindo valor a variável
		numero = 1;

		System.out.println(numero); // exibindo valor 1

		numero = numero + 1; // incremento

		System.out.println(numero); // exibindo valor 2

		numero++; // incremento

		System.out.println(numero); // exibindo valor 3

		System.out.println(numero++); // exibindo valor 3

		System.out.println(numero); // exibindo valor 4

		System.out.println(++numero); // exibindo valor 5

	}

}
