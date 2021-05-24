package exercicios;

import javax.swing.JOptionPane;

/**
 * 
 * Programa que imprima as seguintes sequ�ncias de n�meros: (1, 1 2 3 4 5 6 7 8
 * 9 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8
 * 9 10) e assim sucessivamente, at� que o primeiro n�mero (antes da v�rgula),
 * tamb�m chegue a 10.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio86 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		String result = "";

		// Fazendo a repeti��o dos dados
		for (int i = 1; i <= 10; i++) {
			result += i + ", 1 2 3 4 5 6 7 8 9 10" + "\n";
		}
		// Apresenta��o dos dados ao usu�rio
		JOptionPane.showMessageDialog(null, result);
	}

}
