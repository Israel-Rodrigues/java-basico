package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler: número da conta do cliente, saldo, débito e crédito. Informar o saldo atual, e se é positivo ou negativo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double numeroConta, saldo, debito, credito, saldoAtual;

		// Entrada de dados fornecidos pelo usuário
		numeroConta = Double.parseDouble(JOptionPane.showInputDialog("Informe o número da conta:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo:"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de débito:"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de crédito:"));

		// Calculando o saldo atual
		saldoAtual = saldo - debito + credito;

		// Apresentando o valor do saldo atual ao usuário
		JOptionPane.showMessageDialog(null, "Conta: "+ numeroConta + "\n"+"Saldo atual é de: " + saldoAtual);

		// Verificando se o saldo é positivo ou negativo
		if (saldoAtual >= 0) {
			JOptionPane.showMessageDialog(null, "Saldo positivo");
		} else {
			JOptionPane.showMessageDialog(null, "Saldo negativo");
		}
	}
}
