package exercicios;

import javax.swing.JOptionPane;

/**
 * Convers�o de dolar pra real
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as vari�veis
		double dolar, valor;

		// Imput do valor informado pelo usu�rio e armazenamento na vari�vel "dolar"
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser convertido"));

		// Execu��o da opera��o
		valor = dolar * 6.61;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "A quantidade em reais �: R$ " + valor);
	}
}
