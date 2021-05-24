package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o nome de dois times e o número de gols e escrever o nome
 * do vencedor ou empate
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio55 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		String time1, time2;
		int golsTime1, golsTime2;

		// Entrada de dados informados pelo usuário
		time1 = JOptionPane.showInputDialog("Informe o nome do primeiro time: ");
		golsTime1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos gols marcou o " + time1));
		time2 = JOptionPane.showInputDialog("Informe o nome do segundo time: ");
		golsTime2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos gols marcou o " + time2));

		// Verificando o vencedor ou se deu empate
		if (golsTime1 == golsTime2) {
			JOptionPane.showMessageDialog(null, "EMPATE");
		} else if ((golsTime1 > golsTime2)) {
			JOptionPane.showMessageDialog(null, "O " + time1 + " é o vencedor.");
		} else {
			JOptionPane.showMessageDialog(null, "O " + time2 + " é o vencedor.");
		}
	}
}
