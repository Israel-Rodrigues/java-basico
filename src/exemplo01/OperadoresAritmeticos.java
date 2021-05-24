package exemplo01;

/**
 * Programa para demonstrar opera��es aritim�ticas
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class OperadoresAritmeticos {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		int adicao;
		int subtracao;
		double divisao;
		int multiplicacao;
		int modulo;

		// Exemplo de adi��o
		adicao = 10 + 5;

		// Exemplo de subitra��o
		subtracao = 10 - 5;

		// Exemplo de multiplica��o
		multiplicacao = 24 * 3;

		// Exemplo de divis�o
		divisao = 25 / 6;

		// Exemplo de m�dulo
		modulo = 10 % 3;

		// Exibindo o resultado no console
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("24 * 3 = " + multiplicacao);
		System.out.println("25 / 6 = " + divisao);
		System.out.println("10 % 3 = " + modulo);

	}

}
