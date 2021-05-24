package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantidade de água e de suco para produção de refresco
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio34 {

	/* 
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		
		// Declaração de variáveis
		double agua, suco, refresco;
		
		// Imput do valor informado pelo usuário e armazenamento na variável
		refresco = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos litros de refresco serão feitos: "));
		
		// Calculando a quantidade de água e de suco
		agua = 8*refresco/10;
		suco = 2*refresco/10;
		
		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Para produzir " + refresco + 
											" litros de refresco serão necessários:" + "\n" + agua + 
											" Litros de água" + "\n" + suco + 
											" Litros de ásuco");
	}
}
