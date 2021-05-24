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
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double identificador, alimentos, frangos, total;

		// Imput do valor informado pelo usuário e armazenamento na variável
		frangos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de frangos a serem marcados: "));

		// Calculando o valor gasto com os aneis
		identificador = frangos * 4.0;
		alimentos = frangos * 3.5;

		// Calculando o valor total
		total = identificador + alimentos;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O valor total para marcar os frangos é de: R$ " + total);
	}
}
