package exercicios;

import javax.swing.JOptionPane;

/**
 * ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos
 * litros um motorista conseguiu colocar no tanque.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio25 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double valorPago, valorLitro, total;

		// Imput dos valores informado pelo usuário e armazenamento nas variáveis
		valorPago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago:"));
		valorLitro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do litro:"));

		// calculando o total de litros
		total = valorPago / valorLitro;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O total de litros adquiridos é de: " + total);
	}
}
