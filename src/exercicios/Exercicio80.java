package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar a entrada das seguintes informa��es: a) o n�mero total
 * de mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o
 * valor total em estoque e a m�dia de valor das mercadorias
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio80 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double numMercadorias, valorMercadorias, media = 0, soma = 0;

		// Entrada de dados informados pelo usu�rio
		numMercadorias = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero total de mercadorias: "));

		for (int i = 0; i < numMercadorias; i++) {
			valorMercadorias = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada mercadoria: "));
			soma = soma + valorMercadorias;
		}

		// Calculo da m�dia
		media = soma / numMercadorias;
		
		// Apresenta��o dos dados ao usu�rio
		JOptionPane.showMessageDialog(null, "O valor total em estoque �: R$ " + soma + "\n" + 
											"A m�dia do valor das mercadorias �: R$ " + media);
	}

}
