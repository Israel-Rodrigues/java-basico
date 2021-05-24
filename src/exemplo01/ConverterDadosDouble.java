
package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar conversão de dados String para double
 * 
 * @author iorodrigues
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		double valor1;
		double valor2;
		double resultado;

		// Atribuindo valor para a variável informado pelo usuário
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

		// efetuando o calculo de divisão
		resultado = valor1 / valor2;

		// exibindo o resultafo da divisão no console

		System.out.println("O resultado da divisão é: " + resultado);

	}

}
