package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o c�digo e o pre�o de 5 produtos, calcular e escrever: 
 * O maior pre�o lido e a m�dia aritm�tica dos pre�os dos produtos
 * 
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio83 {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		double preco, maior = 0, media, soma = 0;
		int codigo = 0;
		
		// Entrada de dados utilizando o comando For
		for (int i = 1; i < 6; i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo: " + i));
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o: " + i));
			soma = soma + preco;
			
			// Encontrando o maior pre�o lido
			if (preco>maior) {
				maior = preco;
			}
		}
		// Calculando a m�dia dos valores informados
		media = soma / 5;
		
		//Exibi��o do resultado ao usu�rio
		JOptionPane.showMessageDialog(null, "O maior pre�o lido �: \n" + "Produto: " + codigo + 
											" / " +" Pre�o: R$ " + maior + "\n\n" + 
											"A m�dia dos pre�os lidos �: " + media);
	}
}