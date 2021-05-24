package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o salário mensal de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio19 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as variáveis
		double salario, reajuste, salarioNovo;

		// Armazenando os valores informados pelo usuário nas variáveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário atual: "));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de reajuste: "));

		// Execução da operação
		salarioNovo = salario / 100 * reajuste + salario;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O salário com o reajuste é: R$ " + salarioNovo);
	}
}
