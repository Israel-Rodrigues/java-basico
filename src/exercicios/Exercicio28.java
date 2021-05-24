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
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int valorCarlos, valorAndre;
		double valorFelipe, valorTotalConta, valorDividido;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		valorTotalConta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta: "));

		// Calculando a divis�o da conta
		valorDividido = valorTotalConta / 3;

		// Atribuindo o valor para cada amigo
		valorCarlos = (int) valorDividido;
		valorAndre = (int) valorDividido;
		valorFelipe = valorTotalConta - (valorCarlos + valorAndre);

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O valor a ser pago por Carlos � de: R$ " + valorCarlos + "\n"+ 
											"O valor a ser pago por Andr� � de: R$ " + valorAndre + "\n" + 
											"O valor a ser pago por Felipe � de: R$ " + valorFelipe);
	}
}
