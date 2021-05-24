package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar em um vetor a temperatura m�dia de todos os
 * dias da semana. Calcular e escrever: a) A menor temperatura da semana b) A
 * maior temperatura da semana c) Temperatura m�dia semanal d) O n�mero de dias
 * na semana em que a temperatura foi inferior � m�dia semanal.
 *
 * @author Israel Oliveira Rodrigues
 * @since 12 de fev. de 2021
 * 
 */
public class Exercicio100 {

	/*
	 * M�todo principal para execu�ao da classe
	 */
	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		double menorTemp = 100;
		double maiorTemp = 0;
		double mediaTemp = 0;
		double totalTemp = 0;
		int menorMedia = 0;

		// Declara��o do vetor
		double diaSeman[];
		
		// Inicializa��o do vetor e atribui��o do tamanho
		diaSeman = new double[7];
		
		// Entrada de dados com o auxilio do comando for
		for (int i = 0; i < 7; i++) {
			diaSeman[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura no " + i + "� " + "dia."));

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
		// Calculando a temperatura m�dia
		mediaTemp = totalTemp / 7;

		// Verificando quantos dias tiveram temperatura abaixo da m�dia
		int rep = 0;
		while (rep < 7) {

			if (diaSeman[rep] < mediaTemp) {
				menorMedia++;
			}
			rep++;
		}
		// Exibindo dados ao usu�rio
		System.out.println("A menor foi: " + menorTemp);
		System.out.println("A maior foi: " + maiorTemp);
		System.out.println("A media �: " + mediaTemp);
		System.out.println("Em " + menorMedia + " dias a temperatura foi inferior a media.");
	}

}
