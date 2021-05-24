package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o nome de dois times e o n�mero de gols e escrever o nome
 * do vencedor ou empate
 * 
 * @author Israel Oliveira Rodrigues
 * @since 09/02/2021
 */
public class Exercicio55 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		String time1, time2;
		int golsTime1, golsTime2;

		// Entrada de dados informados pelo usu�rio
		time1 = JOptionPane.showInputDialog("Informe o nome do primeiro time: ");
		golsTime1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos gols marcou o " + time1));
		time2 = JOptionPane.showInputDialog("Informe o nome do segundo time: ");
		golsTime2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos gols marcou o " + time2));

		// Verificando o vencedor ou se deu empate
		if (golsTime1 == golsTime2) {
			JOptionPane.showMessageDialog(null, "EMPATE");
		} else if ((golsTime1 > golsTime2)) {
			JOptionPane.showMessageDialog(null, "O " + time1 + " � o vencedor.");
		} else {
			JOptionPane.showMessageDialog(null, "O " + time2 + " � o vencedor.");
		}
	}
}
