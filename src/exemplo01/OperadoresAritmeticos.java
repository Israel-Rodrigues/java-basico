package exemplo01;

/**
 * Programa para demonstrar operações aritiméticas
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class OperadoresAritmeticos {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		int adicao;
		int subtracao;
		double divisao;
		int multiplicacao;
		int modulo;

		// Exemplo de adição
		adicao = 10 + 5;

		// Exemplo de subitração
		subtracao = 10 - 5;

		// Exemplo de multiplicação
		multiplicacao = 24 * 3;

		// Exemplo de divisão
		divisao = 25 / 6;

		// Exemplo de módulo
		modulo = 10 % 3;

		// Exibindo o resultado no console
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("24 * 3 = " + multiplicacao);
		System.out.println("25 / 6 = " + divisao);
		System.out.println("10 % 3 = " + modulo);

	}

}
