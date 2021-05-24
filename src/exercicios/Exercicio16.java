package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler as dimensões de um retângulo e calcular e escrever a área do retângulo
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio16 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as Variáveis
		int base, altura, area;

		// Atribuindo para a variável o valor informado pelo usuário
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da base: "));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da altura: "));

		// calculando o valor da área
		area = base * altura;

		// Exibindo resultado ao usuário
		JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
	}
}
