package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para coletar dados sobre o sal�rio e n�mero de filhos de cada
 * habitante e ap�s as leituras, escrever: a) M�dia de sal�rio da popula��o b)
 * M�dia do n�mero de filhos c) Maior sal�rio dos habitantes d) Percentual de
 * pessoas com sal�rio menor que R$ 150,00.
 *
 * @author Israel Oliveira Rodrigues
 * @since 11 de fev. de 2021
 * 
 */
public class Exercicio84 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
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

				// Verificando o maior sal�rio
				if (salario > maiorSalario) {
					maiorSalario = salario;
				}

				// Verificando os sal�rios abaixo de 150
				if (salario < 150) {

					abaixo++;
				}
				// Realiza��o dos calculos para o toal do sal�rio e de filhos
				totalSalario = totalSalario + salario;
				totalFilho = totalFilho + filho;
				populacao++;
			}
		}

		// Realiza��o dos calculos das m�dias
		mediaSalario = totalSalario / populacao;
		mediaFilho = totalFilho / populacao;
		mediaAbaixo = (abaixo / populacao) * 100;

		// Apresenta��o dos dados ao usu�rio
		System.out.println("M�dia de salario: R$ " + mediaSalario);
		System.out.println("M�dia de filhos: " + mediaFilho);
		System.out.println("Maior salario: R$ " + maiorSalario);
		System.out.println("Porcetual de pessoas com sal�rio menor que R$ 150,00: " + mediaAbaixo + " %");

	}

}
