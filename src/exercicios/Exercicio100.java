package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar em um vetor a temperatura média de todos os
 * dias da semana. Calcular e escrever: a) A menor temperatura da semana b) A
 * maior temperatura da semana c) Temperatura média semanal d) O número de dias
 * na semana em que a temperatura foi inferior à média semanal.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio100 {

	/*
	 * Método principal para execuçao da classe
	 */
	public static void main(String[] args) {
		
		// Declaração de variáveis
		double menorTemp = 100;
		double maiorTemp = 0;
		double mediaTemp = 0;
		double totalTemp = 0;
		int menorMedia = 0;

		// Declaração do vetor
		double diaSeman[];
		
		// Inicialização do vetor e atribuição do tamanho
		diaSeman = new double[7];
		
		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < 7; i++) {
			diaSeman[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura no " + i + "º " + "dia."));

			// Verificando o dia com a menor temperatura
			if (diaSeman[i] < menorTemp) {
				menorTemp = diaSeman[i];
			}
			// Verificando o dia com a maior temperatura
			if (diaSeman[i] > maiorTemp) {
				maiorTemp = diaSeman[i];
			}
			totalTemp = totalTemp + diaSeman[i];
		}
		// Calculando a temperatura média
		mediaTemp = totalTemp / 7;

		// Verificando quantos dias tiveram temperatura abaixo da média
		int rep = 0;
		while (rep < 7) {

			if (diaSeman[rep] < mediaTemp) {
				menorMedia++;
			}
			rep++;
		}
		// Exibindo dados ao usuário
		System.out.println("A menor foi: " + menorTemp);
		System.out.println("A maior foi: " + maiorTemp);
		System.out.println("A media é: " + mediaTemp);
		System.out.println("Em " + menorMedia + " dias a temperatura foi inferior a media.");
	}

}
