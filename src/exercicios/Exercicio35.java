
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
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		
		// Atribuição de variáveis
		int anoDeNascimento, anoAtual, meses, dias, semanas, anos;

		// Imput do valor informado pelo usuário e armazenamento na variável
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
		anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: "));
		
		//Alterando o valor das variáveis
		anos = anoAtual - anoDeNascimento;
		meses = anos * 12;
		dias = anos * 365;
		semanas = anos * 52;
		
		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "A idade em anos é " + anos + "\n" + 
											"A sua idade em meses é " + meses + "\n" +
											"A sua idade em semanas é " + semanas + "\n" +
											"A sua idade em dias é " + dias + "\n");
	}
}
