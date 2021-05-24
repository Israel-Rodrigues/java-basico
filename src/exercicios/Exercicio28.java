package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o valor a ser pago por cada amigo na conta de um bar
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio28 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int valorCarlos, valorAndre;
		double valorFelipe, valorTotalConta, valorDividido;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		valorTotalConta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta: "));

		// Calculando a divisão da conta
		valorDividido = valorTotalConta / 3;

		// Atribuindo o valor para cada amigo
		valorCarlos = (int) valorDividido;
		valorAndre = (int) valorDividido;
		valorFelipe = valorTotalConta - (valorCarlos + valorAndre);

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O valor a ser pago por Carlos é de: R$ " + valorCarlos + "\n"+ 
											"O valor a ser pago por André é de: R$ " + valorAndre + "\n" + 
											"O valor a ser pago por Felipe é de: R$ " + valorFelipe);
	}
}
