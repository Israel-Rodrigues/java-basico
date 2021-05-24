package exercicios;

import javax.swing.JOptionPane;

/**
 * Receber do usuário o nome, celular e cidade e exibir no console
 * 
 * @author Israel Oliveira Rodrigues
 * @since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		String nome, celular, cidade;

		// Recebendo os dados do usuário
		nome = JOptionPane.showInputDialog("Digite o seu nome:");
		celular = JOptionPane.showInputDialog("Digite o seu celular>");
		cidade = JOptionPane.showInputDialog("Digite o nome da sua cidade:");

		// exibindo o resultado no console
		System.out.println("Nome: " + nome + "\n" + "Celular: " + celular + "\n" + "Cidade: " + cidade);
	}
}
