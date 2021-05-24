package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a hora de inicio e fim de um jogo e calcular a dura��o do
 * jogo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		int horaIni, horaFim, duracao;

		// Entrada de dados fornecidos pelo usu�rio
		horaIni = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora inicial do jogo: "));
		horaFim = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora final do jogo: "));

		// Calculando a dura��o do jogo
		duracao = horaFim - horaIni;

		// Apresentando ao usu�rio a dura��o do jogo
		if (duracao == 0) {
			JOptionPane.showMessageDialog(null, "A dura��o do jogo foi de 24 horas.");
		} else if (duracao < 0) {
			duracao = 24 - duracao * (-1);
			JOptionPane.showMessageDialog(null, "A dura��o do jogo foi de: " + duracao + " horas.");
		} else {
			JOptionPane.showMessageDialog(null, "A dura��o do jogo foi de: " + duracao + " horas.");
		}
	}
}
