package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar exibi��o de dados para o usu�rio
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double num1, num2, res;

		// atribundo valor para as vari�veis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero"));

		// Efetuando a opera��o de multiplica��o
		res = num1 * num2;

		// exibindo o resultado no console
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado:" + num1 + "\n" +
											"Segundo valor digitado:" + num2 + "\n" +
											"Resultado da opera��o" + res);

	}

}
