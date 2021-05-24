package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar a entrada das seguintes informações: a) o número total
 * de mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o
 * valor total em estoque e a média de valor das mercadorias
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio80 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double numMercadorias, valorMercadorias, media = 0, soma = 0;

		// Entrada de dados informados pelo usuário
		numMercadorias = Double.parseDouble(JOptionPane.showInputDialog("Informe o número total de mercadorias: "));

		for (int i = 0; i < numMercadorias; i++) {
			valorMercadorias = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada mercadoria: "));
			soma = soma + valorMercadorias;
		}

		// Calculo da média
		media = soma / numMercadorias;
		
		// Apresentação dos dados ao usuário
		JOptionPane.showMessageDialog(null, "O valor total em estoque é: R$ " + soma + "\n" + 
											"A média do valor das mercadorias é: R$ " + media);
	}

}
