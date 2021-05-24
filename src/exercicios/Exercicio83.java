package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o código e o preço de 5 produtos, calcular e escrever: 
 * O maior preço lido e a média aritmética dos preços dos produtos
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio83 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		
		// Declaração de variáveis
		double preco, maior = 0, media, soma = 0;
		int codigo = 0;
		
		// Entrada de dados utilizando o comando For
		for (int i = 1; i < 6; i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código: " + i));
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: " + i));
			soma = soma + preco;
			
			// Encontrando o maior preço lido
			if (preco>maior) {
				maior = preco;
			}
		}
		// Calculando a média dos valores informados
		media = soma / 5;
		
		//Exibição do resultado ao usuário
		JOptionPane.showMessageDialog(null, "O maior preço lido é: \n" + "Produto: " + codigo + 
											" / " +" Preço: R$ " + maior + "\n\n" + 
											"A média dos preços lidos é: " + media);
	}
}