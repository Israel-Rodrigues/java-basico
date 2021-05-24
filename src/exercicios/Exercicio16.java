package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler as dimens�es de um ret�ngulo e calcular e escrever a �rea do ret�ngulo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio16 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as Vari�veis
		int base, altura, area;

		// Atribuindo para a vari�vel o valor informado pelo usu�rio
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da base: "));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da altura: "));

		// calculando o valor da �rea
		area = base * altura;

		// Exibindo resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo �: " + area);
	}
}
