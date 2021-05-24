package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o número total de eleitores de um município, número de votos brancos,
 * nulos e válidos. Calcular e escrever o percentual em relação ao total de
 * eleitores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double votosBrancos, vutosNulos, votosValidos, total;

		// Armazenando nas variáveis os valores informados pelo usuário
		total = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade total de eleitores: "));
		votosValidos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de votos válidos: "));
		votosBrancos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de votos brancos: "));
		vutosNulos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de votos nulos: "));

		// Calculo do percentual
		votosValidos = votosValidos / 100 * 10;
		votosBrancos = votosBrancos / 100 * 10;
		vutosNulos = vutosNulos / 100 * 10;

		// Apresentando o resultado para o usuário
		JOptionPane.showMessageDialog(null, "O percentual de votos validos é : " + votosValidos + "%" + "\n" + 
											"O percentual de votos brancos é : " + votosBrancos + "%" + "\n" + 
											"O percentual de votos nulos é : " + vutosNulos + "%" + "\n" + 
											"A quantidade total de eleitores é de: " + total);
	}
}
