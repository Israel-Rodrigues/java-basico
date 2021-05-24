package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler duas notas de um aluno, calcular e imprimir a média. Só
 * devem ser aceitos valores de 0 a 10 para cada nota
 *
 * @author Israel Oliveira Rodrigues
 * @since 10 de fev. de 2021
 * 
 */
public class Exercicio65 {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {

		// Declaração de variáveis
		double nota1, nota2;

		// Inicializando as variáveis
		nota1 = -1;
		nota2 = -1;

		// Recendo o valor do usuário
		
		while ((nota1 > 10) || (nota1 < 0)) {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
			
		}
		
		while ((nota2 > 10) || (nota2 < 0)) {
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
			
		}
		JOptionPane.showMessageDialog(null, "A média do aluno é : " + ((nota1 + nota2) / 2));
	}
}
