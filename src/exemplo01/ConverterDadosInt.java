package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de tipos de dados
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		int valor1;
		int valor2;
		int resultado;

		// Recebendo valores dp usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

		// Calculando o resultado da soma
		resultado = valor1 + valor2;

		// Exibindo o resultado da soma
		System.out.println("O resultado da soma é = " + resultado);

	}

}
