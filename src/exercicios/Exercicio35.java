
package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para apresentar a idade de uma pessoa em anos, meses, semanas e dias.
 * 
 * @author Israel Oliveira Rodrigues
   @since 08/02/2021
 */
public class Exercicio35 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		
		// Atribui��o de vari�veis
		int anoDeNascimento, anoAtual, meses, dias, semanas, anos;

		// Imput do valor informado pelo usu�rio e armazenamento na vari�vel
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
		anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: "));
		
		//Alterando o valor das vari�veis
		anos = anoAtual - anoDeNascimento;
		meses = anos * 12;
		dias = anos * 365;
		semanas = anos * 52;
		
		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "A idade em anos � " + anos + "\n" + 
											"A sua idade em meses � " + meses + "\n" +
											"A sua idade em semanas � " + semanas + "\n" +
											"A sua idade em dias � " + dias + "\n");
	}
}
