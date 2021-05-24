package exemplo04;

/**
 * Programa para demonstrar a utiliza��o do comando Do While
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// declara��o de vari�veis
		int i;
		
		// inicializando a vari�vel
		i = 0;
		
		do {
			System.out.println(i + " ao cubo �: " + ((i * i) * i));
			i ++;
		} while (i < 10);

	}

}
