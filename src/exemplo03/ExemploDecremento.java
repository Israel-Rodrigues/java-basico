package exemplo03;

/**
 * Programa para demonstrar a utiliza��o de decremento de valores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class ExemploDecremento {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int numero;

		// Atribuindo valor a vari�vel
		numero = 1;

		System.out.println(numero); // exibindo valor 1

		numero = numero - 1; //decremento

		System.out.println(numero); // exibindo valor 0

		// inicializa��o da vari�vel
		numero = 10;

		numero--; //decremento

		System.out.println(numero); // exibindo valor 9

		numero--; //decremento
		numero--; //decremento

		System.out.println(numero); // exibindo valor 7

	}

}
