package exemplo03;

/**
 * Programa para demonstrar a utiliza��o de incremento de valores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int numero;

		// Atribuindo valor a vari�vel
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
