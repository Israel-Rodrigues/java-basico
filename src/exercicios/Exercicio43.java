package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a hora de inicio e fim de um jogo e calcular a duração do
 * jogo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		int horaIni, horaFim, duracao;

		// Entrada de dados fornecidos pelo usuário
		horaIni = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora inicial do jogo: "));
		horaFim = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora final do jogo: "));

		// Calculando a duração do jogo
		duracao = horaFim - horaIni;

		// Apresentando ao usuário a duração do jogo
		if (duracao == 0) {
			JOptionPane.showMessageDialog(null, "A duração do jogo foi de 24 horas.");
		} else if (duracao < 0) {
			duracao = 24 - duracao * (-1);
			JOptionPane.showMessageDialog(null, "A duração do jogo foi de: " + duracao + " horas.");
		} else {
			JOptionPane.showMessageDialog(null, "A duração do jogo foi de: " + duracao + " horas.");
		}
	}
}
