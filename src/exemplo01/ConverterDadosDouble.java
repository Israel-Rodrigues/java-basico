
package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar convers�o de dados String para double
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		double valor1;
		double valor2;
		double resultado;

		// Atribuindo valor para a vari�vel informado pelo usu�rio
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

		// efetuando o calculo de divis�o
		resultado = valor1 / valor2;

		// exibindo o resultafo da divis�o no console

		System.out.println("O resultado da divis�o �: " + resultado);

	}

}
