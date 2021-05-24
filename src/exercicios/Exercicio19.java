package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o sal�rio mensal de um funcion�rio e o percentual de reajuste. Calcular e escrever o valor do novo sal�rio
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio19 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as vari�veis
		double salario, reajuste, salarioNovo;

		// Armazenando os valores informados pelo usu�rio nas vari�veis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio atual: "));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de reajuste: "));

		// Execu��o da opera��o
		salarioNovo = salario / 100 * reajuste + salario;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O sal�rio com o reajuste �: R$ " + salarioNovo);
	}
}
