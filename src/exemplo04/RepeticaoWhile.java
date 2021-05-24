package exemplo04;

/**
 * Programa para demonstrar laço de repetição while
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * Método princição para execução da classe
	 */
	public static void main(String[] args) {
		
		// declaração de variaveis
		int indice;
		
		// inicializando a variável
		indice = 0;
		
		// efetuando o laço de repetiçãpara exibir o cubo de um número
		while (indice < 10) { // inicio do laço de repetição
			
		System.out.println(indice + " ao cubo é: " + ((indice * indice) * indice));	
		indice ++;
		
		} // fim do laço de repetição

	}

}
