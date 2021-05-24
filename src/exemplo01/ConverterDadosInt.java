package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de tipos de dados
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		int valor1;
		int valor2;
		int resultado;

		// Recebendo valores dp usu�rio
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

		// Calculando o resultado da soma
		resultado = valor1 + valor2;

		// Exibindo o resultado da soma
		System.out.println("O resultado da soma � = " + resultado);

	}

}
