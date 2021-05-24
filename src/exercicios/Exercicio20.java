package exercicios;

import javax.swing.JOptionPane;

/**
 * Conversão de dolar pra real
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as variáveis
		double dolar, valor;

		// Imput do valor informado pelo usuário e armazenamento na variável "dolar"
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser convertido"));

		// Execução da operação
		valor = dolar * 6.61;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "A quantidade em reais é: R$ " + valor);
	}
}
