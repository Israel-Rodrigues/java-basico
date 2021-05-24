package exemplo04;

/**
 * Programa para demonstrar la�o de repeti��o while
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * M�todo princi��o para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// declara��o de variaveis
		int indice;
		
		// inicializando a vari�vel
		indice = 0;
		
		// efetuando o la�o de repeti��para exibir o cubo de um n�mero
		while (indice < 10) { // inicio do la�o de repeti��o
			
		System.out.println(indice + " ao cubo �: " + ((indice * indice) * indice));	
		indice ++;
		
		} // fim do la�o de repeti��o

	}

}
