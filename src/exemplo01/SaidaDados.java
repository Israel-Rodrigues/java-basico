package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar exibição de dados para o usuário
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		double num1, num2, res;

		// atribundo valor para as variáveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));

		// Efetuando a operação de multiplicação
		res = num1 * num2;

		// exibindo o resultado no console
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado:" + num1 + "\n" +
											"Segundo valor digitado:" + num2 + "\n" +
											"Resultado da operação" + res);

	}

}
