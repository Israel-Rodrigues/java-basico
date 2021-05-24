package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usuário
 * @author iorodrigues
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		
		// declarando variáveis
		String nome;
		
		// Atribuir valor para a variável nome informado peo usuário
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		//Exibindo dados no console
		System.out.println("Seu nome é: " + nome);

	}

}
