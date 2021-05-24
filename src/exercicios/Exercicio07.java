package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber do usu�rio idade, altura e peso e exibir no console
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando vari�veis
		int idade;
		double altura;
		double peso;

		// Atribuindo valores para as vari�veis
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));

		// exibindo o resultado no console
		System.out.println("Idade: " + idade + "\n" + "Altura: " + altura + "\n" + "Peso: " + peso);
	}
}
