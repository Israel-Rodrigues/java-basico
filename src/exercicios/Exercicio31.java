package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcular o gasto total de uma granja para marcar frangos
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double identificador, alimentos, frangos, total;

		// Imput do valor informado pelo usu�rio e armazenamento na vari�vel
		frangos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de frangos a serem marcados: "));

		// Calculando o valor gasto com os aneis
		identificador = frangos * 4.0;
		alimentos = frangos * 3.5;

		// Calculando o valor total
		total = identificador + alimentos;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O valor total para marcar os frangos � de: R$ " + total);
	}
}
