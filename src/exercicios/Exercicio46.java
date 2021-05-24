package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Informar o saldo atual, e se � positivo ou negativo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double numeroConta, saldo, debito, credito, saldoAtual;

		// Entrada de dados fornecidos pelo usu�rio
		numeroConta = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero da conta:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo:"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de d�bito:"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cr�dito:"));

		// Calculando o saldo atual
		saldoAtual = saldo - debito + credito;

		// Apresentando o valor do saldo atual ao usu�rio
		JOptionPane.showMessageDialog(null, "Conta: "+ numeroConta + "\n"+"Saldo atual � de: " + saldoAtual);

		// Verificando se o saldo � positivo ou negativo
		if (saldoAtual >= 0) {
			JOptionPane.showMessageDialog(null, "Saldo positivo");
		} else {
			JOptionPane.showMessageDialog(null, "Saldo negativo");
		}
	}
}
