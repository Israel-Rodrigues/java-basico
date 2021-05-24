package exercicios;

import javax.swing.JOptionPane;

/**
 * ler o pre�o do litro da gasolina e o valor do pagamento, e exibir quantos
 * litros um motorista conseguiu colocar no tanque.
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio25 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double valorPago, valorLitro, total;

		// Imput dos valores informado pelo usu�rio e armazenamento nas vari�veis
		valorPago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago:"));
		valorLitro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do litro:"));

		// calculando o total de litros
		total = valorPago / valorLitro;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O total de litros adquiridos � de: " + total);
	}
}
