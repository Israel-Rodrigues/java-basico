package exemplo04;

/**
 * Programa para demonstrar a utilização do comando Do While
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// declaração de variáveis
		int i;
		
		// inicializando a variável
		i = 0;
		
		do {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
			i ++;
		} while (i < 10);

	}

}
