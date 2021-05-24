package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para coletar dados sobre o salário e número de filhos de cada
 * habitante e após as leituras, escrever: a) Média de salário da população b)
 * Média do número de filhos c) Maior salário dos habitantes d) Percentual de
 * pessoas com salário menor que R$ 150,00.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio84 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double salario = 1;
		int populacao = 0;
		int filho;
		double maiorSalario = 0;
		double totalSalario = 0;
		double mediaSalario = 0;
		double mediaFilho = 0;
		double totalFilho = 0;
		double mediaAbaixo = 0;
		double abaixo = 0;

		// Entrada de dados utilizando o comando While
		while (salario > 0) {

			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:"));

			if (salario > 0) {

				filho = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de filhos"));

				// Verificando o maior salário
				if (salario > maiorSalario) {
					maiorSalario = salario;
				}

				// Verificando os salários abaixo de 150
				if (salario < 150) {

					abaixo++;
				}
				// Realização dos calculos para o toal do salário e de filhos
				totalSalario = totalSalario + salario;
				totalFilho = totalFilho + filho;
				populacao++;
			}
		}

		// Realização dos calculos das médias
		mediaSalario = totalSalario / populacao;
		mediaFilho = totalFilho / populacao;
		mediaAbaixo = (abaixo / populacao) * 100;

		// Apresentação dos dados ao usuário
		System.out.println("Média de salario: R$ " + mediaSalario);
		System.out.println("Média de filhos: " + mediaFilho);
		System.out.println("Maior salario: R$ " + maiorSalario);
		System.out.println("Porcetual de pessoas com salário menor que R$ 150,00: " + mediaAbaixo + " %");

	}

}
