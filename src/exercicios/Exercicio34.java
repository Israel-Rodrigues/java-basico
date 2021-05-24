package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantidade de �gua e de suco para produ��o de refresco
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio34 {

	/* 
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		double agua, suco, refresco;
		
		// Imput do valor informado pelo usu�rio e armazenamento na vari�vel
		refresco = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos litros de refresco ser�o feitos: "));
		
		// Calculando a quantidade de �gua e de suco
		agua = 8*refresco/10;
		suco = 2*refresco/10;
		
		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "Para produzir " + refresco + 
											" litros de refresco ser�o necess�rios:" + "\n" + agua + 
											" Litros de �gua" + "\n" + suco + 
											" Litros de �suco");
	}
}
