package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o n�mero total de eleitores de um munic�pio, n�mero de votos brancos,
 * nulos e v�lidos. Calcular e escrever o percentual em rela��o ao total de
 * eleitores
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declara��o de vari�veis
		double votosBrancos, vutosNulos, votosValidos, total;

		// Armazenando nas vari�veis os valores informados pelo usu�rio
		total = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade total de eleitores: "));
		votosValidos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de votos v�lidos: "));
		votosBrancos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de votos brancos: "));
		vutosNulos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de votos nulos: "));

		// Calculo do percentual
		votosValidos = votosValidos / 100 * 10;
		votosBrancos = votosBrancos / 100 * 10;
		vutosNulos = vutosNulos / 100 * 10;

		// Apresentando o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "O percentual de votos validos � : " + votosValidos + "%" + "\n" + 
											"O percentual de votos brancos � : " + votosBrancos + "%" + "\n" + 
											"O percentual de votos nulos � : " + vutosNulos + "%" + "\n" + 
											"A quantidade total de eleitores � de: " + total);
	}
}
